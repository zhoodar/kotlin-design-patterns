package singleton

object AppInstance {
    var value: String = "INITIATE INSTANCE"
}

fun main(args: Array<String>) {
    val appInstance1 = AppInstance
    val appInstance2 = AppInstance

    println("Initial state:")
    println("Fist instance: ${appInstance1.value}")
    println("Second instance: ${appInstance2.value}")

    appInstance1.value = "NEW INSTANCE"
    println("State changed:")

    println("Fist instance: ${appInstance1.value}")
    println("Second instance: ${appInstance1.value}")
}