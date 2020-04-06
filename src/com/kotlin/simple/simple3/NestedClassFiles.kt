package com.kotlin.simple.simple3

import javax.swing.text.View

/*

嵌套类相关演示代码
 */


fun testNestedMain(){

    val nested = Others.Nested()
    nested.foo()

    // 先创建外部类对象 在创建内部类对象
    val inner = Others().Inner()
    inner.getBar()


    // 创建匿名内部类
    setOnViewClicker(object :OnViewClickener{
        override fun onClick(view: View) {

        }
    })

    // 使用lambda 表达式创建匿名内部类
    setOnViewListener(OnViewListener {
        name -> name+""
    })


}

class Others {

    private val bar: Int = 1

    // 嵌套类
    class Nested {
        fun foo() = 2
    }

    // 内部类
    inner class Inner{

        fun getBar() = bar
    }
}

// 创建接口
public interface OnViewClickener{

    fun onClick(view:View)
}

// 创建一个接受接口的函数
fun setOnViewClicker(onViewClickener: OnViewClickener){
    //......
}

fun setOnViewListener(onViewListener: OnViewListener){
    //......
}