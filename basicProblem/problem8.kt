//Write a Kotlin program to find the factorial of a given number.
fun main() {
    println("enter the number to find factorial ")
    val num = readln().toIntOrNull()
    var fact = 1
    if(num == null || num < 1){
        println("Please enter a positive integer.")
        return
    }
      for(i in 1..num){
          fact *= i
          println("Factorial of $num is $fact")
    }
}