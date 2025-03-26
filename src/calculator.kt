import java.util.Scanner

fun main() {


    val calc = Scanner(System.`in`)

    println("Enter the first number : ")
    val num1 = calc.nextDouble()

    println("Enter operator (+,-,*,/): ")
    val operator = calc.next()

    println("Enter the second number : ")
    val num2 = calc.nextDouble()

    val result = when(operator){
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> if (num2 != 0.0) num1 /num2 else "cannot divide by zero"
        else -> "invalid operator"

    }
    println("The result is : $result ")
}