package com.github.yoojia.web

/**
 * HTTP Status Code
 * @author Yoojia Chen (yoojiachen@gmail.com)
 * @since 2.0
 */
class StatusCode private constructor() {

    companion object {
        /**
         * Status code (100) indicating the client can continue.
         */
        val CONTINUE = 100

        /**
         * Status code (101) indicating the server is switching protocols
         * according to Upgrade header.
         */
        val SWITCHING_PROTOCOLS = 101

        /**
         * Status code (200) indicating the request succeeded normally.
         */
        val OK = 200

        /**
         * Status code (201) indicating the request succeeded and created
         * a new resource on the server.
         */
        val CREATED = 201

        /**
         * Status code (202) indicating that a request was accepted for
         * processing, but was not completed.
         */
        val ACCEPTED = 202

        /**
         * Status code (203) indicating that the meta information presented
         * by the client did not originate from the server.
         */
        val NON_AUTHORITATIVE_INFORMATION = 203

        /**
         * Status code (204) indicating that the request succeeded but that
         * there was no new information to return.
         */
        val NO_CONTENT = 204

        /**
         * Status code (205) indicating that the agent *SHOULD* reset
         * the document view which caused the request to be sent.
         */
        val RESET_CONTENT = 205

        /**
         * Status code (206) indicating that the server has fulfilled
         * the partial GET request for the resource.
         */
        val PARTIAL_CONTENT = 206

        /**
         * Status code (300) indicating that the requested resource
         * corresponds to any one of a set of representations, each with
         * its own specific location.
         */
        val MULTIPLE_CHOICES = 300

        /**
         * Status code (301) indicating that the resource has permanently
         * moved to a new location, and that future references should use a
         * new URI with their requests.
         */
        val MOVED_PERMANENTLY = 301

        /**
         * Status code (302) indicating that the resource has temporarily
         * moved to another location, but that future references should
         * still use the original URI to access the resource.

         * This definition is being retained for backwards compatibility.
         * FOUND is now the preferred definition.
         */
        val MOVED_TEMPORARILY = 302

        /**
         * Status code (302) indicating that the resource reside
         * temporarily under a different URI. Since the redirection might
         * be altered on occasion, the client should continue to use the
         * Request-URI for future requests.(HTTP/1.1) To represent the
         * status code (302), it is recommended to use this variable.
         */
        val FOUND = 302

        /**
         * Status code (303) indicating that the response to the request
         * can be found under a different URI.
         */
        val SEE_OTHER = 303

        /**
         * Status code (304) indicating that a conditional GET operation
         * found that the resource was available and not modified.
         */
        val NOT_MODIFIED = 304

        /**
         * Status code (305) indicating that the requested resource
         * *MUST* be accessed through the proxy given by the
         * `*Location*` field.
         */
        val USE_PROXY = 305

        /**
         * Status code (307) indicating that the requested resource
         * resides temporarily under a different URI. The temporary URI
         * *SHOULD* be given by the `*Location*`
         * field in the response.
         */
        val TEMPORARY_REDIRECT = 307

        /**
         * Status code (400) indicating the request sent by the client was
         * syntactically incorrect.
         */
        val BAD_REQUEST = 400

        /**
         * Status code (401) indicating that the request requires HTTP
         * authentication.
         */
        val UNAUTHORIZED = 401

        /**
         * Status code (402) reserved for future use.
         */
        val PAYMENT_REQUIRED = 402

        /**
         * Status code (403) indicating the server understood the request
         * but refused to fulfill it.
         */
        val FORBIDDEN = 403

        /**
         * Status code (404) indicating that the requested resource is not
         * available.
         */
        val NOT_FOUND = 404

        /**
         * Status code (405) indicating that the method specified in the
         * `*Request-Line*` is not allowed for the resource
         * identified by the `*Request-URI*`.
         */
        val METHOD_NOT_ALLOWED = 405

        /**
         * Status code (406) indicating that the resource identified by the
         * request is only capable of generating response entities which have
         * content characteristics not acceptable according to the accept
         * headers sent in the request.
         */
        val NOT_ACCEPTABLE = 406

        /**
         * Status code (407) indicating that the client *MUST* first
         * authenticate itself with the proxy.
         */
        val PROXY_AUTHENTICATION_REQUIRED = 407

        /**
         * Status code (408) indicating that the client did not produce a
         * request within the time that the server was prepared to wait.
         */
        val REQUEST_TIMEOUT = 408

        /**
         * Status code (409) indicating that the request could not be
         * completed due to a conflict with the current state of the
         * resource.
         */
        val CONFLICT = 409

        /**
         * Status code (410) indicating that the resource is no longer
         * available at the server and no forwarding address is known.
         * This condition *SHOULD* be considered permanent.
         */
        val GONE = 410

        /**
         * Status code (411) indicating that the request cannot be handled
         * without a defined `*Content-Length*`.
         */
        val LENGTH_REQUIRED = 411

        /**
         * Status code (412) indicating that the precondition given in one
         * or more of the request-header fields evaluated to false when it
         * was tested on the server.
         */
        val PRECONDITION_FAILED = 412

        /**
         * Status code (413) indicating that the server is refusing to process
         * the request because the request entity is larger than the server is
         * willing or able to process.
         */
        val REQUEST_ENTITY_TOO_LARGE = 413

        /**
         * Status code (414) indicating that the server is refusing to service
         * the request because the `*Request-URI*` is longer
         * than the server is willing to interpret.
         */
        val REQUEST_URI_TOO_LONG = 414

        /**
         * Status code (415) indicating that the server is refusing to service
         * the request because the entity of the request is in a format not
         * supported by the requested resource for the requested method.
         */
        val UNSUPPORTED_MEDIA_TYPE = 415

        /**
         * Status code (416) indicating that the server cannot serve the
         * requested byte range.
         */
        val REQUESTED_RANGE_NOT_SATISFIABLE = 416

        /**
         * Status code (417) indicating that the server could not meet the
         * expectation given in the Expect request header.
         */
        val EXPECTATION_FAILED = 417

        /**
         * Status code (500) indicating an error inside the HTTP server
         * which prevented it from fulfilling the request.
         */
        val INTERNAL_SERVER_ERROR = 500

        /**
         * Status code (501) indicating the HTTP server does not support
         * the functionality needed to fulfill the request.
         */
        val NOT_IMPLEMENTED = 501

        /**
         * Status code (502) indicating that the HTTP server received an
         * invalid response from a server it consulted when acting as a
         * proxy or gateway.
         */
        val BAD_GATEWAY = 502

        /**
         * Status code (503) indicating that the HTTP server is
         * temporarily overloaded, and unable to handle the request.
         */
        val SERVICE_UNAVAILABLE = 503

        /**
         * Status code (504) indicating that the server did not receive
         * a timely response from the upstream server while acting as
         * a gateway or proxy.
         */
        val GATEWAY_TIMEOUT = 504

        /**
         * Status code (505) indicating that the server does not support
         * or refuses to support the HTTP protocol version that was used
         * in the request message.
         */
        val HTTP_VERSION_NOT_SUPPORTED = 505
    }
}
