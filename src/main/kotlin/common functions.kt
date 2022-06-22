fun main(){
    val num_1= listOf(1,2,3,4,5,6)
    println("filter function")        // filter function
    val odd=num_1.filter(fun(a:Int):Boolean{
        return a%2!=0
    })                                       // both are same
    val odd_1=num_1.filter{it%2!=0 }
    println(odd)
    println(odd_1)
    println("map function")                     // map function

    val map_1 = num_1.map { it * it }            // map or convert the list of elements to other form
    println(map_1)
    println("for each function")                  // for each is same like loop

    val each= num_1.forEach{println(it+2)}





}