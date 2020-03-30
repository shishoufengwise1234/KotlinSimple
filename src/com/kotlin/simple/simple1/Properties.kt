package com.kotlin.simple

// 编译期常量
const val SUBSYSTEM_DEPRECATED: String = "This subsystem is deprecated"



open class Address {
    var name: String = ""
        set(value) {
        field = value+"_set"
        }
        get() = "get_$field"

    var street: String = "Baker"
    var city: String = "London"
    var state: String? = null
    var zip: String = "123456"

    //var allByDefault: Int? // 错误：需要显式初始化器，隐含默认 getter 和 setter
    var initialized = 1 // 类型 Int、默认 getter 和 setter

    //val simple: Int? // 类型 Int、默认 getter、必须在构造函数中初始化
    val inferredType = 1 // 类型 Int 、默认 getter

    var isEmpty : Boolean
        get() = false
        set(value) {
            isEmpty = value
        }

    var setterVisibility: String = "abc"
        private set // 此 setter 是私有的并且有默认实现



    constructor()

    constructor(name: String, street: String, city: String, state: String?, zip: String) {
        this.name = name
        this.street = street
        this.city = city
        this.state = state
        this.zip = zip
    }


    // 幕后属性
    private var _table: Map<String, Int>? = null
    public val table: Map<String, Int>
        get() {
            if (_table == null) {
                _table = HashMap() // 类型参数已推断出
            }
            return _table ?: throw AssertionError("Set to null by another thread")
        }



    // 在伴生对象中定义常量
    companion object{

        const val APP_ID : Int = 34

    }

    override fun toString(): String {
        return "Address(name='$name', street='$street', city='$city', state=$state, zip='$zip')"
    }


}

fun copyAddress(address: Address): Address {
    val result = Address() // Kotlin 中没有“new”关键字
    result.name = address.name // 将调用访问器
    result.street = address.street
    // ……
    return result
}


// 位于 object定义之内
object PropertiesSingle{

    const val state = 34
}


public class MyTest {
    lateinit var subject: String
    lateinit var address : Address

    fun setup() {
        subject = "init subject "
    }


    fun toChar() {
        val char = subject.toCharArray()    //可以直接使用

        for (c in char)
            println("test -> $c")
    }

    fun isAddressInitialized() : Boolean{
        return MyTest()::address.isInitialized
    }
}


// 覆盖属性
open class Shape {
    open val vertexCount: Int = 0
}

class Rectangle : Shape() {
    override val vertexCount = 4
}

interface IShape {
    val vertexCount: Int
}

// 在构造器中 使用 override 修饰需要覆盖的属性
open class Rectangle2(override val vertexCount: Int = 4) : IShape

class Polygon : IShape {
    override var vertexCount: Int = 0  // 以后可以设置为任何数
}

class Polygon2(vertexCount: Int) : Rectangle2(vertexCount) {

}

