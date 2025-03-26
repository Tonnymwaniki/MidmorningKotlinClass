fun main() {

    var dog1 =Dog("Billy","Chihuahua","brown")
    println(dog1.breed)
    var dog2 =Dog("mike","kienyeji","brown")
    println(dog2.name)
    var dog3 =Dog("joseph","german shepherd","brown")
    println(dog3.color)
    var dog4 =Dog("Ian","siberian husky","white")
}

class Dog(var name:String,var breed:String,var color:String){

}
