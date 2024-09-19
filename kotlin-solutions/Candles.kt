fun main() {
    val number_of_friends: Int = readln().toInt() // Number of friends who want to order with you

    // Each friends needs 9 candles, so for 'x' friends it will be 9x candles
    // And 9 candles for you. In total 9x + 9
    // So total = (x + 1) * 9

    println(9 * (number_of_friends + 1))
}