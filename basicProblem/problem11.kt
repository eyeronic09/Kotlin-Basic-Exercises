
//Write a Kotlin program to convert temperature from Celsius to Fahrenheit and vice versa.
fun celsiusToFahrenheit(c: Double) : Double{
    return (c  * 9 / 5) + 32
}
fun fahrenheitToCelsius(f : Double): Double {
    return (f - 32) * 5 / 9
}
fun main() {
    println("choice an option")
    println("1. Convert Celsius to Fahrenheit")
    println("2. Convert Fahrenheit to Celsius")
    val option = readln().toIntOrNull()

    if (option != null && (option == 1 || option == 2 )) {
        println("please enter the temperature ")
        val temperature = readln().toDouble()
        when(option){
            1 -> {
                val fahrenheit = celsiusToFahrenheit(temperature)
                println("Temperature in Celsius: $temperature")
                println("Temperature in Fahrenheit: $fahrenheit")
            }
            2 ->{
                val celsius  = fahrenheitToCelsius(temperature)
                println("Temperature in Celsius: $temperature")
                println("Temperature in Fahrenheit: $celsius")
            }
        }
    }else{
        println("invalid option ")
    }
}