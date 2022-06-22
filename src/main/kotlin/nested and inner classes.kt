fun main(){
    val obj_10 = outer()    // outer class object
    println(obj_10.a_3)
    val inn = outer().nested()   // inner class object
    inn.print_1()

}
class outer(){
    val a_3: Int= 10
    inner class nested(){
        fun print_1(){
        println("i am a nested class")
            println("$a_3")
    }
    }
}