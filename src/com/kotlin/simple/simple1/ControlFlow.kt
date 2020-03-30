package com.kotlin.simple

// 程序控制流相关代码

fun max(a : Int ,b : Int) : Int{
    val max = if (a > b) {
        print("Choose a")
        a
    } else {
        print("Choose b")
        b
    }
    return max
}

// for 循环
fun flowFor(){

    // 遍历
    val items = listOf("apple", "banana", "kiwifruit")
    for (item in items) {
        println(item)
    }

    // 遍历集合索引位置
    for (index in items.indices) {
        println("item at $index is ${items[index]}")
    }


    // 使用 库函数 withIndex 访问下标
    val array = arrayOf("a", "b", "c")
    for ((index, value) in array.withIndex()) {
        println("the element at $index is $value")
    }



}

// while 循环
fun flowWhile(){

    // while
    var x = 9
    while (x > 0) {
        x--
    }
    // do while 循环
    do {
        val y = getObj()
    } while (y != null) // y 在此处可见


}

fun getObj(): String{
    return ""
}


// when 表达式
fun flowWhen(){

    // 匹配规则
    val x = 3
    when (x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        else -> { // 注意这个块
            println("x is neither 1 nor 2")
        }
    }

    // 使用 方法作为匹配项
    when (x) {
        parseInt() -> println("s encodes x")
        else -> println("s does not encode x")
    }

    // 检测是否在 .. 一个区间 或 一个集合中
    val b = -1
    val validNumbers = listOf(2,3,5,-1)
    when (b) {
        in 1..10 -> println("x is in the range")
        in validNumbers -> println("x is valid")
        !in 10..20 -> println("x is outside the range")
        else -> println("none of the above")
    }

    // 使用 when 代替 if else 表达式
    val xw = Xwhen()
    when {
        xw.isOdd() -> println("x is odd")
        xw.isEven() -> println("x is even")
        else -> println("x is funny")
    }



    // 使用局部变量
    fun describe(obj: Any): String =
        when (obj) {
            1          -> "One"
            "Hello"    -> "Greeting"
            is Long    -> "Long"
            !is String -> "Not a string"
            else       -> "Unknown"
        }

    describe(1)
}



fun parseInt(): Int {
    //
    return 3
}


// 智能转换
fun hasPrefix(x: Any) = when(x) {
    is String -> x.startsWith("prefix")
    else -> false
}

class Xwhen{

    fun isOdd() : Boolean = false

    fun isEven() : Boolean = true
}


// 区间表达式
fun flowRange(){

    // 检查是否在这个范围
    val x = 10
    val y = 9
    if (x in 1..y+1) {
        println("fits in range")
    }


    // 检查是否不再一个范围内
    val list = listOf("a", "b", "c")
    if (-1 !in 0..list.lastIndex) {
        println("-1 is out of range  ${list.lastIndex}")
    }
    if (list.size !in list.indices) {
        println("list size is out of valid list indices range, too ${list.indices}")
    }

    // 区间迭代
    for (i in 1..5) {
        print(i)
    }

    println("---------")

    // step ： 步长 即每次迭代的差值
    for (z in 1..10 step 2) {
        print(z)
    }
    println("------------")

    for (w in 9 downTo 0 step 3) {
        print(w)
    }


    for (i in 1..8 step 2) println(i) //1357
    println()
    for (i in 8 downTo 1 step 2) print(i)   // 8642

    println()

    for (i in 1 until 10) {       // i in [1, 10), 10被排除
        print(i)
    }

    println("*******")


    class Version(val major: Int, val minor: Int): Comparable<Version> {
        override fun compareTo(other: Version): Int {
            if (this.major != other.major) {
                return this.major - other.major
            }
            return this.minor - other.minor
        }
    }


    val versionRange = Version(1, 11)..Version(1, 30)
    println("versionRange = $versionRange")

    println(Version(0, 9) in versionRange)
    println(Version(1, 20) in versionRange)

    println()

    for (i in 1..9 step 3) print(i) // 最后一个元素是 7

    println(" &&&& ")

    for (i in 4 downTo 1) print(i)

    println(" %%% ")

    println((1..10).filter { it % 2== 0 })  // 输出区间内偶数
}