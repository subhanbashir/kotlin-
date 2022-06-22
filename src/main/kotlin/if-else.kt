fun main(){
    val a= 11
    val b= if(a%2==0) "even" else "odd"
    println(b)

    val c =10
    if(c<0) {
        println("number is negative")
    }
    else{
        println("$c is zero or positive")
    }

    var z= -3
    if(z>0){
        z--
        println(z)}
    else if(z<0){
        z++
            println(z)
        }
    else{
        println("this is zero")
    }

//range and when operator

    val ra= 1 in 1..5            //5 is included
    println(ra)
    val s= 4 in 1 until 5   //5 is not included
    println(s)

    val number= 200
    val result= when(number){
        in 1..99 -> "1 to 99"
        100 -> "hundred"
        in 101..200 -> "101 to 200"
        else -> "not found"
    }
    println(result)
}
