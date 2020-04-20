package com.kotlin.simple.simple4

/*
    扩展相关
 */

class SimpleSwap(val name:String){

    override fun toString(): String {
        return "SimpleSwap(name='$name')"
    }
}

// 对 ArrayList 进行添加拓展函数
fun ArrayList<Int>.swap(index1 : Int ,index2 : Int):Boolean{
    val swap = this[index1]
    this[index1] = this[index2]
    this[index2] = swap
    return true
}

// 对扩展函数进行泛型化处理
fun <E> ArrayList<E>.swapE(index1 : Int ,index2 : Int):Boolean{
    val swap = this[index1]
    this[index1] = this[index2]
    this[index2] = swap
    return true
}


open class Animal(name: String)

class Dog : Animal(name = "Dog")

class Cat : Animal(name = "Cat")

fun Animal.getType() = 1

fun Dog.getType() = 2

fun Cat.getType() = 4

// 打印 type
fun printType(animal: Animal){
    println(animal.getType())
}

class Tiger{

    fun getAge(){
        println(200)
    }
    fun getAge(int: Int){
        println(200)
    }
}

fun Tiger.getAge(){
    println(100)
}

fun Tiger.getAge(string: String){
    println(100)
}



