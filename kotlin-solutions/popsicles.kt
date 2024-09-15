fun main() {
    val siblings: Int = readln().toInt(); // Take input for number of siblings
    val popsicles: Int = readln().toInt(); // Take input for number of popsicles
    
    if (popsicles % siblings == 0) {
        println("give away");
    } else {
        println("eat them yourself");
    }
}