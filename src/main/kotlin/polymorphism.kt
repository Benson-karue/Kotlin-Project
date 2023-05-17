open class Shape{
    open fun draw(){
        println("Drawing")
    }
}

class Rectangle:Shape(){
    override fun draw(){
        println("Drawing a rectangle")
    }
}

class Square:Shape(){
    override fun draw(){
        println("Drawing a square")
    }
}

fun main(){
    var r=Rectangle()
    r.draw()
    var s=Square()
    s.draw()
}