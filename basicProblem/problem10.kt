//Kotlin program: Calculate circle area and perimeter
fun main() {
    println("enter your radius value ")
    val radius = readln().toInt()
    val area = Math.PI * radius * radius
    println("circle of area is $area")

    val circumference  = 2 * Math.PI * radius
    println("circle of perimeter is $circumference")
}