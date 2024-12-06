//Write a Kotlin program to perform addition, subtraction, multiplication and division of two numbers.
fun main() {
    println("plese enter the frist number")
    var numberOne = readln().toDoubleOrNull()
    println("plese enter the second number")
    var numberTwo = readln().toDoubleOrNull()
    if (numberOne != null && numberTwo != null){
        val sum  = numberOne + numberTwo
        val difference = numberOne - numberTwo
        val product = numberOne * numberTwo
        val quotient = numberOne / numberTwo

        println("Sum: $sum")
        println("Difference: $difference")
        println("Product: $product")
        println("Quotient: $quotient")
    }else{
        println("invaild number")
    }

    }