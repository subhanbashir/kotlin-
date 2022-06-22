fun main() {
    val obj3 = object {
        val a: Int = 10
        fun testfun() {
            println("this is an object")
        }
    }
    println(obj3.testfun())

    val obj6 = object : Object("subhan") {
        override fun testobject(){
        println("called")
    }}
    val obj4 = object : Object("subhan") {
        override fun testobject() {
            println("called")
        }
    }
    println(obj4.testobject())
    println(obj4.name)
}

open class Object(val name : String) {
    private val a = name
    open fun testobject() {
        println("$a is my name")
    }
}
