fun main() {
    println("Enter a year to find if it is a leap year or not:")
    val userYear = readln().toIntOrNull()

    if (userYear != null) {
        if ((userYear % 4 == 0 && userYear % 100 != 0) || (userYear % 400 == 0)) {
            println("$userYear is a leap year.")
        } else {
            println("$userYear is not a leap year.")
        }
    } else {
        println("Invalid input. Please enter a valid year.")
    }
}