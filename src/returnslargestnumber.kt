import java.util.Scanner

fun main() {
    val display = Scanner(System.`in`)
    println("Enter the first number:")
    val first1 =  display.nextInt()

    println("Enter the second number:")
    val first2 = display.nextInt()

    println("Enter the third number:")
    val first3 = display.nextInt()



    // Find the largest number
    val largest = if (first1 >= first2 && first1 >= first3) {
        first1
    } else if (first2 >= first1 && first2 >= first3) {
        first2
    } else {
        first3
    }

    // Output the largest number
    println("The largest number is: $largest")
}
