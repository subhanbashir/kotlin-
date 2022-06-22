fun main(){
    var arr = arrayOf("one","two","three")
    for(i in arr){
        println(i)
    }
    for((i,e) in arr.withIndex()) {
        println("$i - $e")
    }
    println(arr[2])
    println(arr.get(1))
    arr.set(0,"hello")
    print(arr[0])

}
