// Example 1
interface Shape1 { // interface members are 'open' by default
    val vertexCount: Int
}
// Implementing interfaces
class Rectangle(override val vertexCount: Int = 4) : Shape1 // Always has 4 vertices

class Polygon(val numb: Int) : Shape1 {
    override val vertexCount: Int get() = numb * numb
}

class Triangle : Shape1 {
    override val vertexCount: Int = 3
}

// Example 2
interface Shape {
    val area: Double
    fun draw()
    fun perimeter(): Double
}

class Circle(val radius: Double) : Shape {
    override val area: Double get() = Math.PI * radius * radius

    override fun draw() {
        println("Drawing a circle with radius $radius")
    }

    override fun perimeter(): Double {
        return 2 * Math.PI * radius
    }
}

class Rect(val width: Double, val height: Double) : Shape {
    override val area: Double
        get() = width * height

    override fun draw() {
        println("Drawing a rectangle with width $width and height $height")
    }

    override fun perimeter(): Double {
        return 2 * (width + height)
    }
}


// Example 3
open class Animal(val name: String) {
    open fun makeSound() {
        println("$name makes a sound")
    }
}

class Dog(name: String) : Animal(name) {
    override fun makeSound() {
        println("$name barks")
    }
}

class Cat(name: String) : Animal(name) {
    override fun makeSound() {
        println("$name meows")
    }
}

class Turtle(name: String) : Animal(name) {
    override fun makeSound() {
        super.makeSound()
//        println("$name turtle sound")
    }
}

fun main() {
    println("======== Example 1 =========")
    println(Rectangle().vertexCount)
    println(Polygon(4).vertexCount)
    var a = Triangle().vertexCount
    a= 10
    println(a)

    println("======== Example 2 =========")
    println(Circle(4.0).area)
    println(Circle(4.0).draw())
    println(Circle(4.0).perimeter())
    println(Rect(6.0, 8.0).area)
    println(Rect(6.0, 8.0).draw())
    println(Rect(6.0, 8.0).perimeter())
//    println(Triangle().vertexCount)

    println("======== Example 3 =========")
    val dog = Dog("Buddy")
    val cat = Cat("Fluffy")
    val turtle = Turtle("Chubby")
    println(dog.makeSound())
    println(cat.makeSound())
    println(turtle.makeSound())
}