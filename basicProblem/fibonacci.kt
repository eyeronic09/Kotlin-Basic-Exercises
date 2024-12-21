fun main(){
    val number = 4
    var count = 1
    var f1 = 0
    var f2 =  1
    var  nextNumber =  f2
    while (count <= number){
        println("$nextNumber");
        count+=1
        f1  = f2
        f2 = nextNumber
        nextNumber = f1 + f2
    }
}