// example 1
data class PersonExample(val name: String?, val age: Int?)


fun person() {
    val person1 = PersonExample("John", 30)
    val person2 = PersonExample(null, null)

    println(person1.name?.length) // Output: 4
    println(person2.name?.length) // Output: null

    val nameLength = person2.name?.length ?: 0
    println(nameLength) // Output: 0
}

// example 2
class Client(val personalInfo: PersonalInfo?)
class PersonalInfo(val email: String?)
interface Mailer {
    fun sendMessage(email: String, message: String)
}

fun sendMessageToClient(
    client: Client?, message: String?, mailer: Mailer
) {
    val email = client?.personalInfo?.email
    if (email != null && message != null) {
        mailer.sendMessage(email, message)
    }
}


fun main() {
    person()

    val personalInfo = PersonalInfo("john@example.com")
    val client = Client(personalInfo)
    val mailer = object : Mailer {
        override fun sendMessage(email: String, message: String) {
            println("Sending message '$message' to email '$email'")
        }
    }
    val message = "Hello, John"
    sendMessageToClient(client, message, mailer)
}