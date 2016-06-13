package com.github.yoojia.web.core

/**
 * @author Yoojia Chen (yoojiachen@gmail.com)
 * @since 2.1
 */
interface ClassProvider {

    fun get(context: Context): List<Class<*>>
}