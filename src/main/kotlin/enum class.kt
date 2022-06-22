fun main(){
    val gender =Gender.female
    val man =Gender.male
    println(gender.format())
    println(man)
    println(gender)
    println(gender.number)

    for(i in Gender.values()) {
        println("${i.number}-> $i")
    }
}
enum class Gender(val number: Int){
    male(1),
    female(2),
    others(3);

    fun format(){
        println("gender is $this")
    }
}