package com.kotlin.simple

fun str(){


    var a = 1
    // 模板中的简单名称：
    val s1 = "a is $a"

//    println("a is "+a)

    a = 2
    // 模板中的任意表达式：
    val s2 = "${s1.replace("is", "was")}, but now is $a"

    println(s2)


    val i = 10
    println("i = $i") // 输出“i = 10”


    // 使用 {} 嵌入少量代码
    val s = "abc"
    println("$s.length is ${s.length}") // 输出“abc.length is 3”



    // 在字符串中 使用 $
    val price = """${'$'}9.99"""

    println("price = $price")

}