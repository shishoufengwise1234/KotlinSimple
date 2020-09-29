package com.kotlin.simple

fun logCurrentThread() {
    println("this thread : ${Thread.currentThread().name}")
}