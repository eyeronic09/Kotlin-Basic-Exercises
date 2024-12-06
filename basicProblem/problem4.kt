//Write a Kotlin program to take user input and display it.
fun main() {
    print("Enter text: ")

    val stringInput = readlnOrNull()
    println("You entered: $stringInput")
}