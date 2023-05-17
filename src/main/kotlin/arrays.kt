fun main(){
    var languages= arrayOf("python","kotlin","java")
    println(languages[0]) //Accessing an element

    languages[0]= "html" //Changing an Element
    println(languages[0])

      // adding a new element in array
    var language = languages.plus("javascript")
    for (lang in language){
        println(lang)
    }

    // to print all element in array
    for (x in languages){
        println(x)
    }
}