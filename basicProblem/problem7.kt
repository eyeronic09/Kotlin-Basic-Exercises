//. Write a Kotlin program to find the maximum and minimum of three numbers.
fun main() {
    println(" find the maximum and minimum of three numbers.")
    val number1 = readln()
    val number2 = readln()
    val number3 = readln()

     if (number1 >= number2 && number1 >= number3) {
        println("the number is maximum $number1")
    } else if (number2 >= number1 && number2 >= number3) {
        println("the number is maximum $number2")
    } else {
        println("the number is maximum $number3")
    }
    if (number1 <= number2 && number1 <= number3) {
        println("the number is minimum $number1")
    } else if (number2 <= number1 && number2 <= number3) {
        println("the number  is minimum $number2")
    } else {
        println("the number is minimum $number3")
    }

}