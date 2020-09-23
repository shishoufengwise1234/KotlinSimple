package com.kotlin.simple.syner

import kotlinx.coroutines.*

fun testJobCancel() = runBlocking{
    val job = launch {
        repeat(1000){
            println("job sleeping $it")
            delay(500)
        }
    }
    delay(1300)
    println("main: waiting ")
//    job.cancel()
//    job.join()
    job.cancelAndJoin()
    println("main : quit...")
}