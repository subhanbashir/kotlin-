fun main(){
    var z=30
    var b=20             // && , || , !

    var c = z>b || z==b             //short circuit becuase the compiler didnot check the second condition
    println(c)
    //not operator just convert your answer
    val ques= false
    val ans = !ques       //not operator
    val answ = !!ques
    println(ans)
    println(answ)


}