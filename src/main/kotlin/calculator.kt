import java.util.Scanner

fun main() {
    var read = Scanner(System.`in`)

    println("Enter first number:")
    var num1 = read.nextInt()

    println("Enter first number:")
    var num2 = read.nextInt()

    println("Enter the operator:")
    var operator = readLine()

    var answer = when(operator){
        "1"-> num1+num2
        "2"-> num1-num2
        "3"-> num1*num2
        "4"-> num1/num2
        else->"maths error"
    }
    println(answer)
}


