package com.kotlin.simple.simple2

// 声明一个类
class Invoice {
    /*……*/
}

class Empty

// 主构造器
class Vip constructor(userName: String) {
    /*……*/
}

// 省略 constructor 关键字
class Normal(userName: String){

}

class Noraml2(val firstName: String, val lastName: String, var age: Int) {
    /*……*/
}

class InitOrder(name: String) {

    val firstProperty = "First property: $name".also(::println)

    init {
        println("First initializer block that prints ${name}")
    }

    val secondProperty = "Second property: ${name.length}".also(::println)

    init {
        println("Second initializer block that prints ${name.length}")
    }

}

// 初始化属性时调用 主构造器参数
class Customer(name: String) {
    val customerKey = name.toUpperCase()
}

class Boss{

    var children: MutableList<Any> = mutableListOf<Any>()

    constructor(normal: Normal) {
        children.add(normal)
    }

    class Sam{


    }
}
class Boss2(bossName:String){

    var children: MutableList<Any> = mutableListOf<Any>()

    constructor(name: String,normal: Normal) :this(name) {
        children.add(normal)
    }
}

// init 初始化代码块 在 次构造器之前执行
class Constructors {
    init {
        println("Init block")
    }

    constructor(i: Int) {
        println("Constructor")
    }
}

// 使用 private 修饰主构造器避免外部访问
class DontCreateMe private constructor () {
    /*……*/
}


open class Shape {
    open val vertexCount: Int = 0

    open fun draw() {
        /*……*/
    }
    fun fill() {
        /*……*/
    }
}

class Rect() : Shape() {
    override fun draw() {
        /*……*/
    }
}

open class Rectangle() : Shape() {
    override val vertexCount: Int
        get() = 2

    final override fun draw() { /*……*/ }
}


open class Base(val name: String) {

    init {
        println("Initializing Base")
    }

    open val size: Int =
        name.length.also { println("Initializing size in Base: $it") }
}

class Derived(
    name: String,
    val lastName: String
) : Base(name.capitalize().also { println("Argument for Base: $it") }) {

    init {
        println("Initializing Derived")
    }

    override val size: Int =
        (super.size + lastName.length).also { println("Initializing size in Derived: $it") }
}


class FilledRectangle : Rectangle() {
    fun draw2() { /* …… */
    }

    val borderColor: String get() = "black"

    inner class Filler {
        fun fill() {
            /* …… */
        }

        fun drawAndFill() {
            super@FilledRectangle.draw() // 调用 Rectangle 的 draw() 实现
            fill()
        }
    }
}

open class Rectangle2 {
    open fun draw() { /* …… */
    }
}

interface Polygon {
    fun draw() { /* …… */
    } // 接口成员默认就是“open”的
}

class Square() : Rectangle2(), Polygon {
    // 编译器要求覆盖 draw()
    override fun draw() {
        super<Rectangle2>.draw() // 调用 Rectangle2.draw()
        super<Polygon>.draw() // 调用 Polygon.draw()
    }
}

open class BasePolygon {
    open fun draw() {}

    companion object {

    }
}

abstract class Rectangle3 : BasePolygon() {
    abstract override fun draw()
}

