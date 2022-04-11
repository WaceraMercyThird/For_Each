// invoking all the strings in an array using index with one code
fun main(){
    var interestingThings = arrayOf("Kotlin", "Programming", "Comic Books")
    println(interestingThings.size)
    println(interestingThings[0])
    println(interestingThings.get(2))

    interestingThings.forEachIndexed{index, interestingThing ->
        println("$interestingThing is at index $index")
    }
}