package com.kotlin.simple.simple4


fun main(array: Array<String>){

    println("array = $array")

    val arrayList = arrayListOf(1,5,8,9,6)

    // 像调用原来 ArrayList 内部方法一样调用 扩展函数
    arrayList.swap(2,3)

    println("arrayList = $arrayList")

    // 使用泛型
    val arr = arrayListOf(SimpleSwap("23"), SimpleSwap("simple"), SimpleSwap("Java"))
    // 交换值
    arr.swapE(0,2)

    println("arr = $arr")

    val dog = Dog()
    val cat = Cat()

    print("dog = ")
    printType(dog)
    print("cat = ")
    printType(cat)

    // 当存在相同方法名
    val tiger = Tiger()
    tiger.getAge()






}