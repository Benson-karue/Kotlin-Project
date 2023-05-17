open class Living(){
    var age: Int=3
    var gender: String ="cat"

    fun species(){
        println("mammal")
    }
}
 class Duck:Living(){
     var color = "red"
     fun  swim(){
         println("freestyle")
     }
 }
class Fish:Living(){
    var canEat: Boolean= true
    fun swim(){
        println("swimming by fins")
    }
}

fun main() {
    var d=Duck()
    d.swim()
    println(d.age)
    println("the fish is  ${d.age}")

}