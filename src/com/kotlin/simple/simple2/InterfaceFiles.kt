package com.kotlin.simple.simple2

interface MyInterface {

    val prop: Int // 抽象的

    val property: String
        get() = "foo"

    fun bar()
    fun foo() {
        // 可选的方法体
        println(" interface - foo")
    }
}

class Child : MyInterface {

    override val prop: Int
        get() = 3

    override val property: String
        get() = "Child"

    override fun bar() {
        // 方法体
    }

    // 可以选择性覆盖 foo()
    override fun foo() {
        super.foo()

    }
}

interface Man {
    val name: String
}

interface WoMan : Man {

    val firstName: String
    val lastName: String

    override val name: String get() = "$firstName $lastName"
}

data class Employee(
    // 不必实现“name”
    override val firstName: String,
    override val lastName: String, val index:Long) : WoMan


interface A {
    fun foo() {
        print("A")
    }

    fun bar()
}

interface B {
    fun foo() {
        print("B")
    }

    fun bar() {
        print("bar")
    }
}

class C : A {
    override fun bar() {
        print("bar")
    }
}

class D : A, B {
    override fun foo() {
        super<A>.foo()
        super<B>.foo()
    }

    override fun bar() {
        super<B>.bar()
    }
}