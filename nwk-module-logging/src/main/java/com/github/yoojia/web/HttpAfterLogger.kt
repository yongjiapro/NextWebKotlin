package com.github.yoojia.web

import com.github.yoojia.web.supports.InternalPriority
import org.slf4j.LoggerFactory
import java.util.*

/**
 * @author Yoojia Chen (yoojiachen@gmail.com)
 * @since 2.a.13
 */
class HttpAfterLogger : HttpLogger() {

    companion object {

        private fun prepareResponseLog(request: Request, response: Response): String {
            val buff = StringBuilder()
            val end = System.currentTimeMillis()
            addLine("Response-At", FORMATTER.format(Date(end)), buff)
            addLine("Response-Time", "${end - request.createTime} ms", buff)
            addLine("Status-Code", response.servletResponse.status, buff)
            response.servletResponse.contentType?.let { contentType->
                addLine("Content-Type", contentType, buff)
            }
            return buff.toString()
        }

        private val Logger = LoggerFactory.getLogger(HttpAfterLogger::class.java)

        @JvmStatic val DEFAULT_PRIORITY = InternalPriority.LOGGING_AFTER
    }

    override fun onCreated(context: Context, config: Config) {
        // nop
    }

    override fun onDestroy() {
        // nop
    }

    override fun process(request: Request, response: Response, chain: RequestChain, router: Router) {
        val prepared = request.paramAsBoolean(LOGGING_ENABLED_NAME)
        val text = request.paramAsString(LOGGING_TEXT_NAME)
        request.removeParam(LOGGING_ENABLED_NAME)
        request.removeParam(LOGGING_TEXT_NAME)
        if(prepared && text.isNotEmpty()) {
            val buff = StringBuilder(text)
            buff.append(prepareResponseLog(request, response))
            buff.append("<=== END ===>")
            Logger.debug(buff.toString())
        }
        router.next(request, response, chain, router)
    }
}