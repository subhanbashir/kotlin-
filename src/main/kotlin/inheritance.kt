fun main(){
    val obj = phonebrands.iphone()                       //child class object
    val obj1 = phonebrands("general")                 //parent class object
    println(obj.size)
    println(obj1.black_or_color)
    println(obj.display())
    println(obj1.display())
    println(obj.type)
}

open class phonebrands(val type : String){               //parent class
    open val name : String =""                    //can override
    open val size : Int = 0
    val makecall : String= "you can call with this phone"
    val playgame : String = "you can play games"
    open val black_or_color : String = " "
    open fun display(){                                  // function can be override
        println("display function")
    fun touch_buttons(){
        println("only Touch screen ")
    }
    }
class iphone : phonebrands("smartphone"){                  //child class
    override val name : String ="iphone"
    override val size: Int = 6
    override val black_or_color: String = "colored"

    override fun display() {
        super.display()                          //call the parent class function from child class
        println("display is colored ")
    }

// polymorphism is useful when you want to run all the override function from all classes but you have to use the reference
// of parent class

}
}