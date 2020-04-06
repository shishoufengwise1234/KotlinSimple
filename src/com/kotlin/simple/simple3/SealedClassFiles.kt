package com.kotlin.simple.simple3

// 定义一个密封类
sealed class Expr {

    // 定义抽象方法
    abstract fun getExprName()

    fun foo() {

    }

}

data class Const(val number: Double) : Expr() {

    override fun getExprName() {

    }
}

data class Sum(val e1: Expr, val e2: Expr) : Expr() {

    override fun getExprName() {

    }

}

object NotANumber : Expr() {
    override fun getExprName() {

    }
}

fun eval(expr: Expr): Double = when (expr) {

    is Const -> expr.number
    is Sum -> eval(expr.e1) + eval(expr.e2)
    NotANumber -> Double.NaN
    // 不再需要 `else` 子句，因为我们已经覆盖了所有的情况
}