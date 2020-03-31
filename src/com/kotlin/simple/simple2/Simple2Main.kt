package com.kotlin.simple.simple2

fun main(args:Array<String>){

    val npe = NPECheck()

    npe.testNPE()

    println("hashCode = ${npe.parseInt("23").hashCode()}")






}