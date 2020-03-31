package com.kotlin.simple.simple2

// null 值检测

class NPECheck {

    // 使用 ？ 标识 可以返回 null
    fun parseInt(str: String): Int? {
        // ……
        return null
    }

    // 使用 可能为 null的值
    fun printProduct(arg1: String, arg2: String) {
        val x = parseInt(arg1)
        val y = parseInt(arg2)

        //println(x * y) 直接使用 `x * y` 会导致编译错误，因为它们可能为 null
        if (x != null && y != null) {
            // 在空检测后，x 与 y 会自动转换为非空值（non-nullable）
            println(x * y)
        } else {
            println("'$arg1' or '$arg2' is not a number")
        }

        // 或者


        // ……
        if (x == null) {
            println("Wrong number format in arg1: '$arg1'")
            return
        }
        if (y == null) {
            println("Wrong number format in arg2: '$arg2'")
            return
        }

        // 在空检测后，x 与 y 会自动转换为非空值
        println(x * y)
    }

    fun testNPE(){

        var a: String = "abc"
        //a = null // 编译错误 不能显示赋 null

        var str : String? = "abc"
        str = null

        println("str = $str")


        val l = a.length
        println("l = $l")


        //val c = str.length  // 编译报错

        // 显示判断
        val d = if (str != null) str.length else -1

        println("d = $d")

        val k = "Kotlin"
        val p: String? = null
        println("k = ${k?.length}") // 无需安全调用
        println("p = ${p?.length}")

        // 使用 let 函数
        val list = listOf("java","kotlin",null,"c++")

        for (li in list){
            li?.let { println(li) }
        }
        // java kotlin c++ 忽略 null


        funElvis()

        // !! 操作符
        val s : String = "2398"

//        val len = str!!.length
//        println(" len = $len")

        val i = 34

        // as 安全类型转换
        val sInt: Int? = s as? Int
        val iInt : String? = i as? String
        println(" sint = $sInt")
        println(" iint = $iInt")

        // 过滤集合中的null
        filterList()

    }

    fun getUserName(){

        // Kotlin 版本
        val school = School()
        val userNameLength = school?.classData?.user?.name?.length


        // 赋值时使用 安全调用
        school?.classData?.user?.name = "小明"
    }

    // Elvis 操作符
    fun funElvis(){

        println(" funElvis -------")

        val b : String? = null
        val l: Int = if (b != null) b.length else -1

        println(" l = $l")

        // 使用 ?: Elvis 表达式
        val j = b?.length ?: getDefLength()

        println(" j = $j")

        val ren = renElvis()
        println(" ren = $ren")

    }

    fun renElvis():String?{
        val user :User? = null
        val parent = user?.name ?: return null
        val name = user.name ?: throw IllegalArgumentException("name expected")

        return null
    }


    fun getDefLength():Int{
        return -4
    }

    fun filterList(){
        val nullableList: List<Int?> = listOf(1, 2, null, 4)
        val intList: List<Int> = nullableList.filterNotNull()

        println("intList = $intList")
    }


}

class School{

    var classData : ClassData? = null
}


class ClassData{

    var user : User? = null

}

class User{

    var name : String? = null

}