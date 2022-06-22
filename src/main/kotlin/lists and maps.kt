fun main(){
    val list_1 = listOf(1,2,3)              // immutable lists
                                        // we cannot modify immutable list
    println(list_1.indexOf(1))
    println(list_1.contains(11))

    val list_2 = mutableListOf(1,2,3,4,5)   //mutable list
    println(list_2.indexOf(1))
    println(list_2.contains(11))              // we can modify mutable lists
    list_2.add(5)
    list_2[3]=11
    list_2.remove(1)
    println(list_2)

    // maps are simple key values pairs
    val student_2 = mutableMapOf<Int,String>()           // mutable map
    student_2.put(1,"subhan")
    student_2.put(2,"Bilal")
    student_2.put(3,"subhan")
    student_2[4]="abubakar"               //another method to insert the value
    println(student_2)
    println(student_2.get(2))
    println(student_2.get(11))
    println(student_2[3])             // get values
    for ((i,j) in student_2) {
        println("$i -> $j")
    }
    val student_3= mapOf<Int, String>(1 to "subhan",2 to "bilal")     // immutable map
    println(student_3)







}