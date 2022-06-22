fun main() {
    val cars = arrayOf(ferrari("ferrari"),lambo("lamborgani"), mechanic("subhan"))
    all_names(cars)
    println("+++++++")

// smart casting
    for (obj3 in cars)
        if(obj3 is lambo){
            println(obj3.driving())
        }
        else{
            println("this is not a lambo function")
        }
}
fun all_names(obj: Array<work>){
    for(i in obj){
        println(i.driving())
    }
}
interface work{
    fun driving()
}
abstract class car1(): work{
    abstract val name: String
}
class lambo(name1: String) : car1()    {
    override val name =name1
    override fun driving(){
        println("car is driving")
    }
}
class ferrari(name1: String) : car1(){
    override val name = name1
    override fun driving(){
        println("$name is running")
    }
}
class mechanic(name1: String): work{
    val name =name1
    override fun driving(){
        println("$name is driving a car")
    }
}