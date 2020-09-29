package com.kotlin.simple.syner

import com.kotlin.simple.logCurrentThread
import jdk.nashorn.internal.runtime.regexp.JoniRegExp
import kotlinx.coroutines.*

/**
 *
 * 协程启动模式
 */
class ScopeStartMode {

    //default 模式 创建后立即运行
    fun testDefault() {
        GlobalScope.launch(start = CoroutineStart.DEFAULT) {
            logCurrentThread()
            delay(400)
            println("testDefault start")
        }
        println("testDefault ")
        runBlocking {
            delay(1000L)
        }
    }

    suspend fun testLazy() {
        val job = GlobalScope.launch(start = CoroutineStart.LAZY) {
            logCurrentThread()
//            delay(400)
            println("testLazy start")
        }
        job.start()
        println("lazy complete")
        runBlocking {
            delay(400)
        }
    }

    suspend fun testAtomic() {
        println("atomic 1")
        val job = GlobalScope.launch(start = CoroutineStart.ATOMIC) {
            println("atomic 2")
            logCurrentThread()
            delay(1000)

            //协程被取消后 此行日志不会输出
            println("atomic while complete")
        }
        println("atomic 3")
        job.cancel()
        println("atomic 4")
        job.join()
    }





}