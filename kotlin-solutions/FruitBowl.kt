fun main() {
    val numberOfFruits: Int = readln().toInt() // Number of fruit pieces in the bowl

    // As the number of fruits is even and half of them are apples and the other half are bananas
    
    val numberOfApples: Int = numberOfFruits / 2

    // Now for each pie we have three apples
    println(numberOfApples / 3)
}