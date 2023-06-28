fun containsEven(collection: Collection<Int>): Boolean =
    collection.any { it % 2 == 0 }

fun main() {
    val collection1 = listOf(1, 3, 5, 7)
    val collection2 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    println(containsEven(collection1)) // Output: false
    println(containsEven(collection2)) // Output: true

    val evenNumbers = collection2.filter { it % 2 == 0 }
    println(evenNumbers)

}
