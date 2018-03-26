package kg.jedi

import java.util.logging.Logger

class App {

    companion object {
        val LOG = Logger.getLogger(App::class.simpleName)
    }

}

fun main(args: Array<String>) {
    val appInstance1 = AppInstance
    val appInstance2 = AppInstance

    App.LOG.info("Fist instance: ${appInstance1.value}")
    App.LOG.info("Second instance: ${appInstance2.value}")

    appInstance1.value = "NEW INSTANCE"

    App.LOG.info("Fist instance: ${appInstance1.value}")
    App.LOG.info("Second instance: ${appInstance1.value}")
}