package com.kotlin.simple.simple2

import java.io.IOException
import java.security.Provider
import java.util.*
import kotlin.collections.ArrayList
import kotlin.reflect.KClass



fun getTime() {
    /*……*/
}

class InteropKotlin {

    val x: Int
        @JvmName("getX_prop")
        get() = 15

    fun getX() = 10


    fun getTime(): Date {
        return Date()
    }

    @get:JvmName("z")
    @set:JvmName("changeZ")
    var z: Int = 23


    /**
     * 传入 KClass 字节码对象
     */
    fun getInteropClass(kClass: KClass<Any>){

    }

    fun List<String>.filterValid(): List<String>{
        return ArrayList<String>(1)
    }

    @JvmName("filterValidInt")
    fun List<Int>.filterValid(): List<Int>{
        return ArrayList<Int>(1)
    }

}

class Person() {


    @JvmField
    var peronId:Int = 23

    var personName : String? = null

}

class Key(val value: Int) {
    // 伴生对象
    companion object {

        @JvmField
        val COMPARATOR: Comparator<Key> = compareBy<Key> {
            it.value
        }


    }
}

object Singleton {

    // 延迟初始化属性
    lateinit var provider: Provider
}


object Obj {
    const val CONST = 1

    // 静态方法
    @JvmStatic
    fun callStatic() {

    }
    // 非静态方法
    fun callNonStatic() {

    }
}

class InteropC {
    companion object {
        const val VERSION = 9

        // 静态方法
        @JvmStatic
        fun callStatic() {

        }
        // 非静态方法
        fun callNonStatic() {

        }
    }
}

const val MAX = 239



interface ChatBot {

    companion object {

        @JvmStatic
        fun greet(username: String) {
            println("Hello, $username")
        }

    }
}

// 使用 @JvmOverloads 标识可以重载体现的类 和 函数
class Circle @JvmOverloads constructor(centerX: Int, centerY: Int, radius: Double = 1.0) {

    @JvmOverloads
    fun draw(label: String, lineWidth: Int = 1, color: String = "red") { /*……*/
    }
}


@Throws(IOException::class)
fun writeToFile() {
    /*……*/
    throw IOException()
}

fun getInteropName():String?{
    return null
}

class Changed{


}
