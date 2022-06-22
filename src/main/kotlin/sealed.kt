fun main(){
    val matches : match = wicket("out","pakistan")
    val update = when(matches){
        is runs -> println("how many runs you have")
        is wicket -> println(matches.print())
    }
}

sealed class match()
class runs(val runs: Int, val team: String) : match()
class wicket(val decision: String, val team: String) : match()
{
    fun print(){
        println("$team out")
    }
}