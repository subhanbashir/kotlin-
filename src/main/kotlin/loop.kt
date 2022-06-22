fun main(){
    var a=1
    while(a<=10){
        println("2 * $a = " + 2*a)
        a++}
    var b=1
    do{
        println("2 * $b = " + 2*b)
        b++
    }while(b<=10)

//   for(i in 1..5)       1,2,3,4,5
//    for(i in 1..5step 2)    1,3,5
//   for (i in 1 until 5)    1,2,3,4
//   for (i in 5 down to 1)     5,4,3,2,1
//   for (i in 5 down to 1 step 2)   5,3,1

    val num=2
    for(i in 1..10){
       // println(num.toString() + "x + $i = " + num * i)
        println("$num x $i = ${num *i }")                  //string templating
    }


}