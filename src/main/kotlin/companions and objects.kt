fun main() {
    val obj6 = stud.detail("Subhan", 832903, "information")
    val obj7 = stud.file.detail("Bashir", 832903, "Tech")
}
class stud(){
     companion object file{
        fun detail(name: String, number: Int, department: String){
            println("Name = $name , Rollnumber= $number , department = $department")

        }
    }
    object file2{
        fun detail(name: String, number: Int, department: String){

        println("Name = $name , Rollnumber= $number , department = $department")

    }
}
}