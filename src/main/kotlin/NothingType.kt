import java.lang.IllegalArgumentException

// Example 1
fun failWithWrongAge(age: Int?): Nothing {
    throw IllegalArgumentException("Wrong age: $age")
}
fun checkAge(age: Int?) {
    if (age == null || age !in 0..150) failWithWrongAge(age)
    println("Congrats! Next year you'll be ${age + 1}.")
}

// Example 2
class Example(val name: String?)

fun fail(message: String) {
    throw IllegalArgumentException(message)
}

fun main() {
//    checkAge(10)
//    checkAge(null)

    val p1 = Example("John")
    val p2 = Example(null)
    val s1 = p1.name ?: fail("Name required")
    val s2 = p2.name ?: fail("Name required")

    println(s1)     // 's1' is known to be initialized at this point
    println(s2)
}