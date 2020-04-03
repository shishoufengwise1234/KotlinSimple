package com.kotlin.simple.simple2

import java.io.*
import java.util.ArrayList
import java.util.concurrent.Executors
import java.util.concurrent.ThreadPoolExecutor

/*

    kotlin 调用Java 示例
 */


class InteropJava{


    fun testMain(){

        val interop = InteropMethed()

        // 访问 getter 和 setter
        val user = InteropMethed.User()
        user.isVip = false
        user.userId = 90
        user.userName = "张三"

        val a = ArrayList<String>(2)

//        if (a is List<Int>){  // 错误：无法检测它是否真的是一个 Int 列表
//            println("a is List<Int>")
//        }
        if (a is List<*>){
            // OK：不保证列表的内容
            println("a is List<*>")

        }


        val array = intArrayOf(0, 1, 2, 3)
        interop.removeIndices(array)  // 将 int[] 传给方法


        val arr = intArrayOf(0, 1, 2, 3)
        interop.removeIndicesVarArg(*arr) // 通过 *传递可变参数
        //interop.removeIndicesVarArg(null)   // 编译报错

//        val file = File("")
//        val ins = FileInputStream(file)
//        ins.read()

        // 获取 Java 类引用
        interop::class.java
        interop.javaClass

//        Character.isLetter()

        val runnable = Runnable {
            println("This runs in a runnable")
        }


        val executor = Executors.newSingleThreadExecutor()
        // Java 签名：void execute(Runnable command)
        executor.execute {
            println("This runs in a thread pool")
        }

    }

}

open abstract class CommonSimple{


}

open abstract class BaseSimple : Closeable,Flushable{

    abstract fun getSimpleId()
}

interface ISimple{

    fun setSimpleId()

}

class SimpleClone : Cloneable, BaseSimple(), ISimple{
    override fun close() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun flush() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    override fun setSimpleId() {

    }

    override fun getSimpleId() {

    }

    override fun clone(): Any {
        return SimpleClone()
    }

    protected fun finalize(){

    }
}