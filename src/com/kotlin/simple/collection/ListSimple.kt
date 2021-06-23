package com.kotlin.simple.collection

import java.util.*
import kotlin.collections.ArrayList

class ListSimple {


    fun index() {
        val urlList = ArrayList<String>()
        urlList.add("https://wwww.baidu.com")
        urlList.add("https://wwww.goolge.com")
        urlList.add("https://wwww.lagou.com")
        urlList.add("https://wwww.hh.com")
        urlList.add("http://wwww.hh.com")

        println(urlList.indexOf("https://wwww.hh.com"))

        val list = arrayListOf(
            "https://wwww.baidu.com",
            "https://wwww.goolge.com",
            "https://wwww.lagou.com",
            "https://wwww.hh.com",
            "http://wwww.hh.com"
        )

        val index = list.indexOfFirst {
            it == "https://wwww.lau.com"
        }

        println(index)
    }


    fun remove(){
        val netList = mutableListOf<String>("1","2","3","4","5","6")

        val localList = mutableListOf("3","4","-1")

        netList.removeIf { localList.contains(it) }

        // 翻转集合
        netList.reverse()
        localList.reverse()

        println(netList)
        println(localList)



    }

}