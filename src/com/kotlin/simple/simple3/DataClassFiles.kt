package com.kotlin.simple.simple3

/*

数据类 代码演示
 */


fun testClassMain(){

    val person1 = Person("张三")
    val person2 = Person("李四")
    person1.age = 10
    person2.age = 20

    println("person1 == person2: ${person1 == person2}")

    println("person1 with age ${person1.age}: ${person1}")
    println("person2 with age ${person2.age}: ${person2}")

    val user = User("张三",23)
    val user2 = user.copy(name = "李四")

    println("user = $user , user2 = $user2")

    // 使用解构声明
    val jane = User("王五", 35)
    val (name, age) = jane

    println("$name, $age years of age") // 输出 "王五, 35 years of age"

    val pair = Pair<String,Long>("李四",23)
    val triple = Triple<Long,String,Int>(4,"init",9)

    // 使用 Pair 初始化map集合
    val map = mapOf(Pair<String,Int>("李四",23),Pair<String,Int>("哈哈",23),Pair<String,Int>("老罗",56))
    println("map $map")


    destruction()

}

// 解构声明
fun destruction(){

    println("destruction start")

    val user = User("李三",23)
    val (name,age) = user

    user.component1()

    println("name $name")
    println("age $age")


    // 迭代
    val userList = listOf(User("李四",4),User("李白",44),User("老白",45))
    for ((name,age) in userList)
        println(" name = $name , age = $age")


    // 使用解构函数做返回值
    val (name1,age1) = getUser()

    println("name1 = $name1 , age1 = $age1")

    // 使用 _ 跳过初始化变量
    val (_,age2) = getUser()

    println("age2 = $age2")

//    map.mapValues {
//            entry -> "${entry.value}!"
//    }
//    map.mapValues {
//            (key, value) -> "$value!"
//    }



}

data class User(val name: String, val age: Int)

data class Person(val name: String) {
    var age: Int = 0
}

// 返回解构声明
fun getUser(): User {
    // 各种计算

    return User("老于", 56)
}


