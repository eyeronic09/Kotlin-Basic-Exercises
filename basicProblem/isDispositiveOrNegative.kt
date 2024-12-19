fun main() {
    println("enter the number if weather is positive or negative , zero ")
    val number = readln().toIntOrNull()
    if (number != null) {
        if (number == 0){
            println("is zero")
        }
        else if (number >= 1  ) {
            println("it is positive")
        }else if (number <= -1){
            println("it is negative")
        }

    }
}