package com.ahhsfj1991.okhttplogger

import okhttp3.Interceptor
import okhttp3.Response

class OkHttpLoggerInterceptor : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        val respone = chain.request()
        return chain.proceed(chain.request())
    }

}