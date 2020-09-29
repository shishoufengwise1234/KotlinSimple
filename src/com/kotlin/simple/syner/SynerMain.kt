package com.kotlin.simple.syner

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.xml.bind.JAXBElement

suspend fun main(){


//    testScope()
//   testScopeBlocking()
//    testBlocking()
//    testJob()
//    testCoroutineScope()
//    testSuspendFunction()
//    testRepeat()
//    testGlobalRepeat()


    //测试协程的取消和超时
//    testJobCancel()

//    val startMode = ScopeStartMode()
//    startMode.testDefault()
//    startMode.testLazy()
//    startMode.testAtomic()

    testErrorCoroutine()

}