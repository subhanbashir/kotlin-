fun main(){
    val c= add(4.6,5.4)  //arguments
    val d= multiply(4.6,5.4)
    val e= negative(4.6,5.4)
    val f= divide(4,5)
    println(c)
    println(d)
    println(e)
    println(f)
    println(fn(4,5))
}

fun add_2(a :Int , b: Int): Int    // parameters
{
    return (a + b)
// fun add(a :Int , b: Int): Int = a+b
}

fun add(num1: Double= 3.2, num2 :Double=2.2): Double= num1 + num2  // default arguments
fun negative(num1: Double, num2: Double) : Double = num1 - num2
fun multiply(num1: Double=2.2 , num2: Double=3.2) : Double = num1 * num2   // default arguments
fun divide(num1: Int , num2: Int) : Int = num1 / num2

fun divide(num1 : Double, num2 : Double): Double =num1/num2    // function overloading same fun name but para different

var fn = ::add_2   // function saved in a variable
