fun main()
{
    val number = readln().toIntOrNull()
    println("Number is $number")
    if (number != null) {
        if (number % 7 == 0) {
            println("The number is divisible by 7.")
        } else {
            println("The number is not divisible by 7.")
        }
    }
}
