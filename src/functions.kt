fun main() {

    //standard library functions/predefined functions

    var x = Math.sqrt(144.0)
    println("The square root of 144 is $x ")

    var y = Math.round(45.45)
    println("The output is $y")

    school() //calling a function
    student("Joseph",21)
    student("Ian",19)
    employee("mark",80000,false)
    employee("ann",70000,true)
}

//user-defined functions

fun school(){
    println("emobilis")

}
//parameter/variable and argument/value
fun student(name:String,age :Int){
    println("$name is $age years old")


}

fun employee(name: String,salary:Int,disability:Boolean ){
    println("$name is earning $salary. Disability: $disability")

}