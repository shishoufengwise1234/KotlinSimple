package com.kotlin.simple.collection

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

}