package com.kotlin.simple.clazz

data class Animal(val id:Int,val name:String)

fun main() {

    testDataClass()

}

//data class 自动实现了 toString()、equals()、copy()、hashCode() 方法
fun testDataClass() {
    val a = Animal(1,"Dog")
    val a2 = Animal(2,"Dog")

    println(a)  //toString()
    println(a == a2)  //equals()
    println(a == a.copy())  //equals()
    println(a.copy())  //copy()
    println(a.hashCode() == a.copy().hashCode()) //拷贝出来的对象hashCode() 是一样的



}

class TestKotlinClassMain {



}