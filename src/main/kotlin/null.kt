fun main(){
    val days: String = "sunday"         //can be monday or tuesday
    val day2 : String? = null     // null operator (we don't know the value of day2)
    val is_monday : Boolean? = true // it can also accept values as well as null value

    if (day2 != null) {                 // check the day2 value if null nothing will happen
        println(day2.toUpperCase())
    }
                                        // safe call
    println(day2?.toUpperCase())      // same like above command but with the different syntax

    is_monday?.let {
        println("this is not null ")          // can use for null and not null values
        println("value = $is_monday")
        println("value is $it")
    }
                                                        // elvis operator
    var selected_1 : String = day2 ?: "not available"    //if day2 is null then print not available
    println(selected_1)
    var call_1 = day2!!.toUpperCase()                    //if null error raise if not null function call

}