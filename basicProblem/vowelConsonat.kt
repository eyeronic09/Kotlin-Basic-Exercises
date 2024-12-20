fun main() {
    val vowel = listOf("a" , "e" , "i" , "o" , "u")
    val user = readlnOrNull()
    if (user in vowel ){
        println("it is vowel")
    }else{
        println("it is consonant")
    }
}