package com.kotlin.simple.simple3

/*
*
* 跳转和返回
*
*/

class Control3 {

    fun testMain() {

        println(" Control3 > : testMain ")

        controlBreak()

        foo()

        foo2()

        foo3()

        // 匿名函数实现 foreach
        foo4()

        foo5()
    }

    private fun controlBreak() {

        loop@ for (i in 1..10) {
            println("外层循环 i = $i")

            for (j in 1..10) {
                println(" j = $j")

                if (i == 5) break@loop
            }
        }
        // 指定跳转位置
        loop@ for (i in 1..10) {
            println("外层循环 i = $i")

            inter@ for (j in 1..10) {
                println(" j = $j")

                if (i == 5) break@inter
            }
        }
    }

    private fun foo() {
        listOf(1, 2, 3, 4, 5).forEach {
            if (it == 3) return // 非局部直接返回到 foo() 的调用者
            print(it)
        }
        println("this point is unreachable")
    }

    private fun foo2() {
        println(" foo2 ---")

        listOf(1, 2, 3, 4, 5).forEach lit@{
            if (it == 3) return@lit // 局部返回到该 lambda 表达式的调用者，即 forEach 循环
            print(it)
        }
        print(" done with explicit label")
    }

    fun foo3() {
        println(" foo3 ---")

        listOf(1, 2, 3, 4, 5).forEach {
            if (it == 3) return@forEach // 局部返回到该 lambda 表达式的调用者，即 forEach 循环
            print(it)
        }
        print(" done with implicit label")
    }

    fun foo4() {
        println(" foo4 ---")

        listOf(1, 2, 3, 4, 5).forEach(fun(value: Int) {
            if (value == 3) return  // 局部返回到匿名函数的调用者，即 forEach 循环
            print(value)
        })
        print(" done with anonymous function")
    }


    private fun foo5() {
        println(" foo5 ---")

        run loop@{
            listOf(1, 2, 3, 4, 5).forEach {
                if (it == 3) return@loop // 从传入 run 的 lambda 表达式非局部返回
                print(it)
            }
        }
        print(" done with nested loop")
    }



}