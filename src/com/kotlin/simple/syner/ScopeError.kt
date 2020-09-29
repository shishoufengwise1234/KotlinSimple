package com.kotlin.simple.syner

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.util.*
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException
import kotlin.coroutines.suspendCoroutine

//协程异常处理


fun getTarget(callBack: CallBack<String>) {
    val r = Random()
    if (r.nextBoolean()) {
        callBack.success(r.nextInt().toString())
    } else {
        callBack.error(IllegalArgumentException("getTarget is error"))
    }
}


interface CallBack<T> {

    fun success(t: T)

    fun error(t: Throwable)
}

suspend fun getTargetCoroutine() = suspendCoroutine<String> { continuation ->
    getTarget(object : CallBack<String> {
        override fun success(t: String) {
            continuation.resume(t)
        }

        override fun error(t: Throwable) {
            continuation.resumeWithException(t)
        }
    })
}

suspend fun testErrorCoroutine() {
    GlobalScope.launch() {
        try {
            val text = getTargetCoroutine()

            println("text = $text")
        } catch (t: Exception) {
            t.printStackTrace()
        }
    }

    delay(3000)


}