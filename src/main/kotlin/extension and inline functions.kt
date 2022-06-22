fun main(){
    println("Hey Subhan ".formatstring())
    calculate_time{loop_1(10000000)}
}
fun String.formatstring():String{
    return "******$this********"
}
// inline is just a keyword it is important for the performance of the code
fun loop_1(n:Long){
    for(i in 1..n){}
}
inline fun calculate_time(fn:() -> Unit){
    val start= System.currentTimeMillis()
    fn()
    val end = System.currentTimeMillis()
    println("time taken ${end-start} ms")
}

// inline is just a keyword it is important for the performance of the code