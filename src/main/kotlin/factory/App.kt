package factory


interface Car {
    fun start()
    enum class Brand { MERCEDES, BMW }
}

class Bmw : Car {
    override fun start() {
        println("I am a Bmw")
    }
}

class Mercedes : Car {
    override fun start() {
        println("I am a Mercedes")
    }
}

class CarFactory {
    fun createACar(brand: Car.Brand) = when (brand) {
        Car.Brand.BMW -> Bmw()
        Car.Brand.MERCEDES -> Mercedes()
    }
}


fun main(args: Array<String>) {
    val factory = CarFactory()

    val aCar1 = factory.createACar(Car.Brand.MERCEDES)
    val aCar2 = factory.createACar(Car.Brand.BMW)
    aCar1.start()
    aCar2.start()
}