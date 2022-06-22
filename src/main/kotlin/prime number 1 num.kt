fun main() {
    val number = 20
    val list__ = ArrayList<Int>()
    for(i in 2..number) {
        val call: Boolean= prime_number_1(i,number)
        if(call){
            list__.add(i)
        }
    }
    println(list__)
}
fun prime_number_1(i: Int, num_1: Int) : Boolean{
    var flag=true
    for (j in 2..i-1) {
        if (i% j == 0) {
            flag = false
            break
        }
    }
    return flag
}