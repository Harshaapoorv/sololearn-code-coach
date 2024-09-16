fun main() {
//   This problem is a classic case of probability
//   Let's consider 4 houses out of which 1 would be candy, 2 would be dollar bills 
//   and 1 would be toothbrush

//   So the probability of dollar bills is 2 in 4 (number_of_houses)

    val number_of_houses: Int = readln().toInt()

    val a: Int = Math.ceil(2.0 / number_of_houses * 100).toInt()

    println(a)

}