open class shape{
    open fun draw(){
        println("Drawing a shape")
    }
}

class circle:shape(){
    override fun draw(){
        println("Drawing a circle")
    }
}

class square:shape(){
    override fun draw(){
        println("Drawing a square")
    }
}

fun main() {
    var sh = shape()
    sh.draw()
    var ci = circle()
    ci.draw()
    var sq = square()
    sq.draw()
}