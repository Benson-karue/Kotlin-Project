import java.util.Scanner

fun main(){
    var read = Scanner(System.`in`)

    println("Enter num:")
    var number = read.nextFloat()

    if (number>0){
        println("its a Positive")
    }
    else if (number <0){
        println("its a negative")
    }

    else{
        println("0 is a neutral")
    }
}