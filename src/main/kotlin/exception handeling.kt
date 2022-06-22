fun main() {
    val arr_1 = arrayOf(1, 2, 3, 4, 5)
    try {
        println(arr_1[7])                          // try block check the code
        // always come with catch or finally not alone
    } catch (e: Exception) {                         //  if error then execute the catch block
        println(" This index is not available in the list")
    } catch (ex: NullPointerException) {              // we can write more than one catch block
        println("is it null")

    } finally {                                        // always run, raise error or not
        println("Please write the correct index")
    }
    ////throw error
    println(count1(-1))

}
    fun count1(count : Int){
        if(count<0){
            throw IllegalArgumentException("count cannot be negative")
        }
        else{
            println("count= $count")
        }
    }






