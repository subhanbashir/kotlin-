fun main(){               // data classes is to save the data like geeter an setters in java

    val a = save(10,"subhan")
    val b = save(10,"bilal")
    val c = save(10,"subhan")
    println(a)
    println(b)
    println(a==b)
    val d =b.copy(id = 5)
    println(d)
    println(b.name)

}

data class save(val id: Int, val name: String)