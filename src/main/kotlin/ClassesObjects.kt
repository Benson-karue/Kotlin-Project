class Person{
    // variables / attributes
    var name:String = "carson"
    var age:Int = 20
    var location:String = "westlands"
    var yearOfBirth:Int = 1989

    //functions or Methods
    fun eat(){
        println("am Eating")
    }

    fun sleep(){
        println("am sleeping")
    }
}

fun main() {
    var teacher= Person()
    println(teacher.age)

    teacher.eat()

    var vehicles = Car()
    println(vehicles.make +" "+ vehicles.model+""+vehicles.color )

    vehicles.drive()

}

class Car {
    var make = "sedan"
    var model = "BMW"
    var color = "silver"
    var drivingSpeed = 90


    fun drive() {
        println("maximum speed is 230")
    }

    fun turn() {
        println("turn left on exit lane")
    }

    fun stop() {
        println("stop at the round about")
    }
}