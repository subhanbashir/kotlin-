fun main() {
    val number = 20
    val list_1 = ArrayList<Int>()
    prime_number(list_1,number)
    println(list_1)
}
fun prime_number(list_1: ArrayList<Int>, num_1: Int) {
    for (i in 1..num_1) {
        for (j in 2..i - 1) {
            if (i % j == 0) {
                list_1.add(i)
                break
            }

            }
        }
    }
