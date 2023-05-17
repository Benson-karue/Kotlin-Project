import java.util.Scanner

fun main() {
    var letter = Scanner(System.`in`)

    println(""" Enter your letter: """.trimIndent())

    var read = readln()
    if (read == "a" || read == "e" || read == "i" || read == "o" || read == "u")

        println("letter is a vowel")
    else {
        println("letter is a consonant")
    }
}