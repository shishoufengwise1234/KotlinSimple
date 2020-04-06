package com.kotlin.simple.simple3

/*
    内联类
 */



fun testInlineClassMain(){

    // 不存在 'Password' 类的真实实例对象
    // 在运行时，'securePassword' 仅仅包含 'String'
    val securePassword = Password("Don't try this in production")

    println("securePassword.value = ${securePassword.value}")
}


inline class Password(val value: String)

