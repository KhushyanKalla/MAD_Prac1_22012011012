
class Car(val type: String, val model: String, var price: Double, var owner: String? = null, var milesDriven: Int = 0) {

    fun getCarInfo(): String {
        return "Car: $type $model, Owner: ${owner ?: "N/A"}, Miles Driven: $milesDriven"
    }

    fun originalPrice(): Double {
        return price
    }

    fun currentPrice(): Double {
        val depreciationRate = 0.001 // 1 dollar per mile
        return price - (milesDriven * depreciationRate)
    }

    fun displayCarInfo() {
        println(getCarInfo())
    }
}


fun main(){
    val myCar = Car("Sedan", "Toyota Corolla", 20000.0, "Aman")
    myCar.displayCarInfo()
    myCar.milesDriven = 10000
    println("Current price: ${myCar.currentPrice()}")
    val myCar2 = Car("SUV", "Range Rover", 2000000.0, "Santanu")
    myCar.displayCarInfo()
    myCar.milesDriven = 1000
    println("Current price: ${myCar.currentPrice()}")
    val myCar3 = Car("Sports Car", "Supra", 5000000.0, "Joe biden")
    myCar.displayCarInfo()
    myCar.milesDriven = 100000
    println("Current price: ${myCar.currentPrice()}")
    val myCar4 = Car("Sport Car", "Lamborgini", 56000000.0, "Stone Cold")
    myCar.displayCarInfo()
    myCar.milesDriven = 100000
    println("Current price: ${myCar.currentPrice()}")
}
