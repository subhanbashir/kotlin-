fun main(){
    val a_1= add_1(1,2,3,4,5,6,7,8,9)
    println(a_1)
}
fun add_1(vararg values:Int): Int{
    var sum=0
    for(i in values){
        sum+=i
    }
    return sum
}