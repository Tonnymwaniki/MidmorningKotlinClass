//parent class/super class/base class
open class Animal{

    var age = 3
    var gender = "male"

    fun makesound(){
        println("Animal is speaking")
    }

}

//child class/derived class/sub class
class dog:Animal(){
    fun bark(){
        println("woof! woof!")
    }
}

class cat{
    var color = "white"
    var hasfur = true
    fun meow(){
        println("meow! meow!")
    }
}

fun main() {

    var a = Animal()

    var d = dog()
    d.bark()
    println(d.age)
    var c = cat()

}