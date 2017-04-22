/**
 * Created by deveshshetty on 22/04/17.
 */

fun main(args: Array<String>){
    println("Hello, World!")

    val doubleQuotes = "A string with \t tab space";
    val tripleQuotes = """ RAW STRING
                         Line no 2
                        """
    println(doubleQuotes)
    println(tripleQuotes)

    val perfectSquares = Array(10, {k -> k * k})
    //using String templates
    println("Array has ${perfectSquares.size} numbers")
    for (no in perfectSquares){
        print(no.toString() + " ")
    }
    println()

    //Arrays have an extension function called indices that can be used to iterate over the index of an array
    for(index in perfectSquares.indices){
        print("$index: ${perfectSquares[index]}")
    }
    println()

    val oneToTen = 1 .. 10
    for (entry in oneToTen){
        print(entry.toString() + " ")
    }
    println()

    //create a range from 10 to 1
    val tenToOne = 10.downTo(1)
    for (entry in tenToOne){
        print("$entry ")
    }
    println()

    //create a range from 1 to 100
    val threeToHundred = 3.rangeTo(100)
    //use step() function to modify each successive term in the range
    val multiplesOfThree = threeToHundred.step(3)
    for (entry in multiplesOfThree){
        print("$entry ")
    }
    println()

    //Ranges can be reversed using reversed() function
    val countingTenToOne = (1 .. 10).step(2).reversed()
    for (entry in countingTenToOne){
        print("$entry ")
    }
    println()




}
