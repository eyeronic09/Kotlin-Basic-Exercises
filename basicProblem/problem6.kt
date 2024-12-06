//Write a Kotlin program to check if a given number is even or odd.
fun main() {
    print("check if your give me old and even")
    val number = readln().toIntOrNull()
    if (number != null){
    if(number % 2  == 0){
        println("it even")
    }else{
        println("odd")
    }
} else{ println("No input provided. Please provide a number as a command-line argument.")
    }
}