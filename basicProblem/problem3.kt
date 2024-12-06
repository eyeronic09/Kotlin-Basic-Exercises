//Write a Kotlin program to display the current date and time.
import java.util.Calendar
fun main() {
    val localTime = Calendar.getInstance()
    val currentTime = localTime.time
    println("$currentTime")
}