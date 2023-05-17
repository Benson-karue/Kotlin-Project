fun main() {

    for(number in 10..15)
        println(number)

    for(letter in 'c'..'f')
        println("letter is $letter")

    // range loops in numbers
    for (num in 1..10) {
        if (num == 6) {
            break
        }
        println("number :$num")
    }

//  range loops in letters
for( letts in 'a'..'k'){
        if (letts =='c')
            continue
    println(letts)
    }

}