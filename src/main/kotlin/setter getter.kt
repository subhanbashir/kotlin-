fun main(){
    var corolla = car("toyota",2020)
    corolla.model=1990
    println(corolla.carname)

}

class car(name: String, model: Int){

    val carname : String = name
    get(){                         // getter
        return field.toUpperCase()
    }
    var model :Int = model
    set(value) {                       //setter
        if(value > 2000){
            field=value
        }
        else{
            println("car is too old")
        }
    }

}