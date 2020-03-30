package com.kotlin.simple.simple1

import com.kotlin.simple.*

fun main(args : Array<String>){


    // 初始化 类对象
    val fn = Functions()

    // 调用函数
    val doubleResult = fn.double(2)

    // 使用对象 。 调用成员函数
    val doubleResult2 = Functions().double(doubleResult)

    println(" doubleResult : $doubleResult , doubleResult2 :  $doubleResult2")


    // 调用具名函数
    fn.foo(baz = 3)

    // 最后一个参数是 lambda表达式情况下传参方式
    // 既可以作为具名参数在括号内传入，也可以在括号外传入：
    fn.foo(1){ print("hello Foo")}  // 使用默认值 baz = 1
    fn.foo(qux = { print("hello Foo 2 ")})  // 使用两个默认值 bar = 0 与 baz = 1
    fn.foo{print("hello Foo 3 ")}    // 使用两个默认值 bar = 0 与 baz = 1

    //调用具名参数函数
    fn.reformat("s")

    // 可以根据需要进行传参
    fn.reformat(str = "334", wordSeparator = '_')

    // 调用 可变函数
    val list = fn.asList(1,2,4,5,6)

    for (l in list){
        println(" main l = $l")

    }

    println(" main list = $list")

    val a = arrayOf(1, 2, 3)
    val list2 = fn.asList(-1, 0, *a, 4)

    println(" main list2 = $list2")



    // 中缀表示法
    val sh = 1.shl(3)

    println(" main sh = $sh")


    Sample().foo() // 创建类 Sample 实例并调用 foo


    // 尾递归函数
    val point = findFixPoint()

    println(" point $point")

    val adr = Address()
    adr.name = "name"

    val adrNew = copyAddress(adr)


    println(" adr = $adr 、adrNew = $adrNew")

    // 引用伴生对象内部常量
    Address.APP_ID

    val test = MyTest()

    // 延迟初始化变量
    test.setup()
    // 使用
    test.toChar()

    // 执行字符串中方法
    str()

    // for 循环
    flowFor()

    // 表达式
    flowWhen()

    // 区间表达式
    flowRange()


    testInstance()
}


// 中缀表示法
infix fun Int.shl(x: Int): Int {
    return  x * 2
}


fun maxOf(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}