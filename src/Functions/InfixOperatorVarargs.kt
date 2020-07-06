package Functions

fun main() {
   infix fun Int.times(str:String) = str.repeat(this)//Int class ın içinde sanki times diye bir method tanımladık this anahtar kelimeside Int e eşdeğer
    println(2 times "Bye")//2.times("Bye") da yazabilirdik ama method un başına infix eklediğimiz için böyle de yazabildik





    val pair = "Ferrari" to "Katrina"
    println(pair)

    infix fun String.onto(other:String) = Pair(this,other)
    val myPair = "Mclaren" onto "Lucas"                     //üstteki to yu kendimiz onto şeklinde tanımladık.
    println(myPair)

    


}

