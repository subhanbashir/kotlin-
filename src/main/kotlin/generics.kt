// class without any type, we have to pass the type when function call
fun main(){
    val obj_6= container<Int>(5)
    val obj_7= container<String>("subhan")
    println(obj_6.set(10))
    println(obj_6.get())
    println(obj_7.set("Bilal"))
    println(obj_7.get())

}
class container<T>(var data:T){
    fun set(value:T){
        data= value
    }
    fun get():T{
        return data
    }
}