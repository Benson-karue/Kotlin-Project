class Pet(var breed:String,var size:String,var age:Int,var color:String) {

    // ways to pass functions
    fun Eat() {
        println("The dog loves food")
    }

    fun Sleep (nap:String){
        println("The dog is"+nap)

    }

    fun Sit() {
        println("the dog likes sitting around guests")
    }
}

fun main() {
    var Dog1 = Pet("Nelpolitan","Large",5 ,"black")
    println(Dog1.breed )
    Dog1.Eat()
    Dog1.Sleep("sleeping ")

    var Dog2 = Pet("maltese","Large",5 ,"black")
    println(Dog2.breed)

    var Dog3 = Pet("Nelpolitan","Large",5 ,"black")
    println(Dog3.breed)
}