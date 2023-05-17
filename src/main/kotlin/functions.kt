
// predefined functions
fun main() {
    var squareroot = Math.sqrt(144.0)
    println(squareroot)

    var round = Math.ceil(4.23)
    println(round)

    var round1 = Math.round(4.67)
    println(round1)

    // user defined function calling
    myFunction()
    add()
    myDetails()
    myProfile("steve",34)
    myProfile("josee",21)

}

// user defined functions

fun myFunction(){
    println("Today is Friday")
}

fun add(){
    var num1=56
    var num2=20
    println(num1+num2)
}

fun myDetails(){
    var name="mike"
    var age=20
    println("my name is $name,am $age")
}

// creating a function for many subjects

fun myProfile(name:String,age:Int){
    println("my name is $name,$age")

}
