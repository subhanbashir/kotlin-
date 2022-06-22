fun main(){
    val fn: (a: Double, b: Double) -> Double =::sum1         //sum function stored in variable
    println(fn(1.0,2.0))
    println(cal(2.0,4.0,::sum1))                    // function as an argument

    // high order function means that you get a function as an argument or return function
    // data type should be same
    // lambda functions
    val lambda1 ={x:Int,y:Int -> x+y}      //single line lambda function
    val lambda2 ={
        println("start lambda function")

        val x: Int= 4
        val y: Int =5
        val a: Int= x+y
        println(a)

    }
    println(lambda1(3,4))
    println(lambda2())
    println(cal(1.0,4.0,{a,b -> a+b}))
}
fun sum1(a:Double, b: Double): Double{
    return a+b
}

fun cal(a: Double,b:Double,gn:(Double,Double) ->Double) : Double{
    val result=gn(a,b)
    return result
}