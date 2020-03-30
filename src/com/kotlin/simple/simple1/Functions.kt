package com.kotlin.simple


/**
 *
 * 函数定义相关
 *
 */

class Functions{

    // 函数定义
    fun double(x: Int): Int {
        return 2 * x
    }


    // 函数参数使用 Pascal 表示法定义，即 name: type。参数用逗号隔开。每个参数必须有显式类型：
    fun powerof(number : Int ,exponent : Int) : Int{
        return number + exponent
    }

    // 在定义函数时可以指定 参数默认值
    fun read(b:Array<Int>,off : Int = 0,len : Int = b.size){

    }


    // 默认参数在 无默认参数之前
    fun foo(bar: Int = 0, baz: Int) { /*……*/ }

    // 如果在默认参数之后的最后一个参数是 lambda 表达式，那么它既可以作为具名参数在括号内传入，也可以在括号外传入：
    fun foo(bar: Int = 0, baz: Int = 1,qux :() -> Unit) { /*……*/ }


    // 定义具名参数
    fun reformat(str: String,
                 normalizeCase: Boolean = true,
                 upperCaseFirstLetter: Boolean = true,
                 divideByCamelHumps: Boolean = false,
                 wordSeparator: Char = ' ') {
        /*……*/
    }


    // 定义无返回函数
    fun printHello(name: String?): Unit {
        if (name != null)
            println("Hello ${name}")
        else
            println("Hi there!")
        // `return Unit` 或者 `return` 是可选的
    }

    // 以下代码等同于上述代码
    //fun printHello(name: String?) { //…… }



    //单表达式函数
    fun double2(x: Int): Int = x * 2

    // 直接当做返回值
    fun double3(x: Int) = x * 2

    // 可变数量参数
    /**
     *
     * 定义一个 添加集合参数 类似于
     *
     * {@link java.util.Arrays#asList
     *
     */
    fun <T> asList(vararg ts: T):List<T>{
        val result = ArrayList<T>()
        for (t in ts)
            result.add(t)
        return result
    }


}

// 使用 open 修饰代表 可以被继承
open class A{
    open fun foo(i : Int = 10){ /*........*/}
}

class B : A(){
    // 盖方法总是使用与基类型方法相同的默认参数值。
//    override fun foo(i: Int = 3) {
//        super.foo(i)
//    }
}



// 内部函数
fun dfs(graph: Int) {
    val visited = HashSet<Int>()

    fun dfs(current: Int, visited: Array<Int>) {
        for (v in visited) {
            // 这里进行递归操作
            dfs(0, visited)
        }
        // 访问外部局部变量
        println("visited $visited")
    }
    //这里可以调用内部函数
    dfs(0, arrayOf(1,2,5))





}


class Sample() {
    fun foo() { print("Foo") }
}



private val eps = 1E-10 // "good enough", could be 10^-15​
tailrec fun findFixPoint(x: Double = 1.0): Double
        = if (Math.abs(x - Math.cos(x)) < eps) x else findFixPoint(Math.cos(x))









