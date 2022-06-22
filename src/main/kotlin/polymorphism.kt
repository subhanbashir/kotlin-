fun main(){
    val obj =  arrayOf(circle(4.0),square(5.0),ellipse(4.0,5.0))
    val obj2 = arrayOf(circle(4.0),square(5.0),square(5.0))
    calculatearea(arrayOf(circle(4.0),square(5.0),square(5.0)))   // another way of function call
    calculatearea(obj2)
}

fun calculatearea(obj1: Array<shape>){
    for(shape in obj1){
        println(shape.area())

    }
}

open class shape(){
    open fun area(): Double{
        return 0.0
    }
}

class circle(val radius : Double):shape(){
    override fun area(): Double {
        return Math.PI * radius*radius
    }
}
class square(val side : Double):shape(){
    override fun area():Double{
        return side * side
    }
}
class ellipse(val x_axis : Double, val y_axis: Double) : shape(){
    override fun area():Double{
        return Math.PI * x_axis * y_axis
    }
}

