package com.kotlin.simple


fun testInstance() {

    val rectangle = RectangleBean(5.0, 2.0)
    val triangle = Triangle(3.0, 4.0, 5.0)

    println(" rectangle = $rectangle")
    println(" triangle = $triangle")

    println("Area of rectangle is ${rectangle.calculateArea()}, its perimeter is ${rectangle.perimeter}")
    println("Area of triangle is ${triangle.calculateArea()}, its perimeter is ${triangle.perimeter}")
}

// 创建抽象类
private abstract class BaseShape(val sides: List<Double>) {

    val perimeter: Double get() = sides.sum()
    abstract fun calculateArea(): Double
}

// 创建接口
interface RectangleProperties {
    val isSquare: Boolean
}

private class RectangleBean(
    var height: Double,
    var length: Double ) : BaseShape(listOf(height, length, height, length)), RectangleProperties {

    override val isSquare: Boolean get() = length == height

    override fun calculateArea(): Double = height * length


    override fun toString(): String {
        return "RectangleBean(height=$height, length=$length)"
    }


}

private class Triangle(
    var sideA: Double,
    var sideB: Double,
    var sideC: Double
) : BaseShape(listOf(sideA, sideB, sideC)) {

    override fun calculateArea(): Double {
        val s = perimeter / 2
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC))
    }

    override fun toString(): String {
        return "Triangle(sideA=$sideA, sideB=$sideB, sideC=$sideC)"
    }


}