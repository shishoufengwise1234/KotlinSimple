package com.kotlin.simple.utils

import java.text.SimpleDateFormat
import java.util.*

fun main() {

    timeTest()

}

fun timeTest() {

//    val sm = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    val sm = SimpleDateFormat("yyyy-MM-dd")
//    val time = sm.parse("2021-06-22 14:43:40").time
    val time = sm.parse("2021-06-22 14:43:40").time

    println()

    val timeMillis = System.currentTimeMillis()
    val timeMillsStr = sm.format(timeMillis)

    println(time)
    println(timeMillis)
    println(timeMillsStr)

}
