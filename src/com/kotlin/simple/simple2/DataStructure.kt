package com.kotlin.simple.simple2

import com.sun.xml.internal.xsom.impl.ForeignAttributesImpl

/**
 *
 * 数据结构 操作相关
 */
class DataStructure{


    fun testMain(){
        println("DataStructure ->  testMain 1 ")

        // 自动推导类型
        val one = 1 // Int
        val threeBillion = 3000000000 // Long
        val oneLong = 1L // Long
        val oneByte: Byte = 1

        val pi = 3.14 // Double
        val e = 2.7182818284 // Double
        val eFloat = 2.7182818284f // Float，实际值为 2.7182817

        //getName(one)    // 编译报错
        //getName(threeBillion) // 编译报错
        //getName(oneLong) // 编译报错
        //getName(oneByte) // 编译报错
        //getName(eFloat)  // 编译报错
        getName(pi)
        getName(e)

        val oneMillion = 1_000_000
        val creditCardNumber = 1234_5678_9012_3456L
        val socialSecurityNumber = 999_99_9999L
        val hexBytes = 0xFF_EC_DE_5E
        val bytes = 0b11010010_01101001_10010100_10010010

        println("oneMillion = $oneMillion")




        // 使用 === 比较地址值
        val a: Int = 10000
        println("=== ${a === a}") // 输出“true”

        val boxedA: Int? = a
        val anotherBoxedA: Int? = a

        println("=== ${boxedA === anotherBoxedA}") // ！！！输出“false”！！！

        // 使用 == 比较字面值
        println("== ${a == a}") // 输出“true”
        println("== ${boxedA == anotherBoxedA}") // 输出“true”


        parse()

        funArray()
    }


    fun getName(double: Double) : String?{
        return null
    }



    // 显示转换
    fun parse(){


        // 假想的代码，实际上并不能编译：
        val a: Int? = 1 // 一个装箱的 Int (java.lang.Integer)
//        val b: Long? = a // 编译错误 隐式转换产生一个装箱的 Long (java.lang.Long)
//        print(b == a) // 编译错误 这将输出“false”鉴于 Long 的 equals() 会检测另一个是否也为 Long


        val b: Byte = 1 // OK, 字面值是静态检测的
//        val i: Int = b // 编译错误

        val i: Int = b.toInt() // OK：显式拓宽

        print(i)

        val l = 1L + 3 // Long + Int => Long


        val x = 5 / 2
        //println(x == 2.5) // 编译出错 ERROR: Operator '==' cannot be applied to 'Int' and 'Double'
        println(x == 2)

    }




    // 数组的使用
    private fun funArray() {
        println(" ->  funArray 1 ")


        // 创建指定大小 内容为null 的数组
        val nullArray = arrayOfNulls<String>(3)
        nullArray.forEach {
            println(" it = $it")
        }

        // 创建一个 Array<String> 初始化为 ["0", "2", "4", "6", "8"]
        val asc = Array(5) {
            it -> (it * 2).toString()
            }
        asc.forEach {
            println("asc = $it")
        }


        val x: IntArray = intArrayOf(1, 2, 3)
        x[0] = x[1] + x[2]

        // 大小为 5、值为 [0, 0, 0, 0, 0] 的整型数组
        val arrInt = IntArray(5)


        // 例如：使用 lambda 表达式初始化数组中的值
        // 大小为 5、值为 [0, 1, 2, 3, 4] 的整型数组（值初始化为其索引值）
        var arr = IntArray(5) {
            it * 1
        }


    }








}