fun main()
{

    val subhan= student("subhan","456",25)
//    val bilal = student()       this is a default constructor if we don't have properties in the class
    println(subhan.passed())
    subhan.age= 17

}

class student(val name : String, val rollno: String, val subject : String, val classroom: String, age : Int)    // properties
{
    constructor(name: String,rollno: String,age: Int):this(name,rollno,"math","10th",age)    //secondery constructer

    lateinit var department :String          // if initial value is not initiated
    var age :Int = age
    init {
        println("this is initializer block. its always run when the object is created ")
    }

    fun passed(): String {                           // methods
        return("$name is passed in $subject ")
    }
    init {
        println("this is second initializer block. its always run with sequence ")
    }

    fun fail() {
        println("$name is failed in $subject")
    }

}