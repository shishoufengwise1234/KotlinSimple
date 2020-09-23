package com.kotlin.simple.syner

import kotlinx.coroutines.*
import kotlin.concurrent.thread
import kotlin.random.Random
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeAliasDescriptor

fun testScope(){

    GlobalScope.launch {
        delay(1000L)
        println("Word !")
    }
    println("Hello ")

    Thread.sleep(2000L)
}


fun testScopeBlocking(){

    GlobalScope.launch {
        delay(1000L)
        println("Word !")
    }
    println("Hello ")

    //阻塞式的方法
    runBlocking {
        delay(2000L)
    }
}

//使用 runBlocking 包装一个方法
fun testBlocking() = runBlocking<Unit> {

    launch {
        delay(1000L)
        println("launch ")
    }
    delay(2000L)
    println("blocking main")
}

//等待另一个协程结束
fun testJob() = runBlocking<Unit>{
    val job = GlobalScope.launch {
        delay(1000L)
        println("launch ")
    }
    println("Job Main")
    job.join()
}

fun testCoroutineScope() = runBlocking {
    launch {
        delay(200)
        println("launch start")
    }
    //挂起函数 内部子协程数没有结束之前 不会结束
    coroutineScope {
        launch {
            delay(500)
            println("coroutineScope inner launch task ")
        }
        delay(100)
        println("coroutineScope 外部输出")
    }
    println("testCoroutineScope() end")

}

//提取函数
fun testSuspendFunction() = runBlocking {
    launch {
        doWork()
    }
    println("testSuspendFunction()")
}

suspend fun doWork(){
    delay(1000)
    println("doWork")
}

//启动大量线程
fun testRepeat() = runBlocking {

    repeat(100_000){
        delay(100)
        println("repeat . ${Random.nextInt()}")
    }
}

fun testGlobalRepeat() = runBlocking {
    GlobalScope.launch {
        repeat(1000) { i ->
            println("I'm sleeping $i ...")
            delay(500L)
        }
    }
    delay(1300L) // just quit after delay
}