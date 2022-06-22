fun main(){
    val radius = circles(4.0)
    println(radius.area())

}

abstract class abst() {
    val name: String= " "
    abstract fun display(): String
    abstract fun area(): Double
}

class circles(val radius : Double): abst(){
    override fun display(): String{
        return "display area"
    }

    override fun area(): Double {
        return Math.PI * radius * radius
    }

}