package com.kotlin.simple.simple2


fun main(args:Array<String>){

    val npe = NPECheck()

    npe.testNPE()

//    println("hashCode = ${npe.parseInt("23").hashCode()}")


    // 数据结构相关
    val dataStructure = DataStructure()

    dataStructure.testMain()

    // kotlin 中调用 Java 代码
    val interopJava = InteropJava()

    //
    val interopKotlin = InteropKotlin()

    interopJava.testMain()


    fun emptyList(): List<Nothing> = listOf()


    val initOrder = InitOrder("Tony")

    val b = Boss(Normal("张三"))

    val sam = Boss.Sam()


    val con = Constructors(1)

    val d = Derived("Hello", "Kotlin")







}