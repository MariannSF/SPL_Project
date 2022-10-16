fun main() {
    var arrayBMI = doubleArrayOf()
    var arrayWeight = doubleArrayOf()
    var arrayHeight = doubleArrayOf()
    do {
        //reading in user input


        println("Enter your Name: ")
        var userInputName = readLine()

        // input validation
        while (userInputName == "") {
            println("Invalid input: Enter name again")
            userInputName = readLine()
        }

        println("Enter your weight in pounds: ")
        var userInputW = readLine()?.toDoubleOrNull() ?: error("enter a number")

        // input validation
        while (userInputW < 0) {
            println("Invalid input: Enter a Weight that is 0 or Greater")
            userInputW = readLine()?.toDoubleOrNull() ?: error("enter a number")
        }

        println("Enter your height in inches: ")
        var userInputH = readLine()?.toDoubleOrNull() ?: error("enter a number")

        // input validation
        while (userInputH < 0) {
            println("Invalid input: Enter a Height that is 0 or Greater")
            userInputH = readLine()?.toDoubleOrNull() ?: error("enter a number")
        }

        val c1 = User()


        c1.name = userInputName.toString()
        c1.weight = userInputW
        c1.height = userInputH
        c1.onDiet = true

        val bmiArray = doubleArrayOf()
        println(c1.name)
        println(c1.weight)
        println(c1.onDiet)
        println(c1.calculateBMI())
        println(c1.result())


        arrayBMI += c1.calculateBMI()
        arrayWeight += c1.weight
        arrayHeight += c1.height

        // for (i in  arrayBMI){
        //    println("array $i")
        // }

        println("Do you want to input other data? y/n")
        val iteratorInput: String? = readLine()
        val chr = iteratorInput?.subSequence(0,1)

        var it = ""

        // Two built-in functions used on data type 'CharSequence'
        if (chr?.count() == 1) {
            it = chr.get(0).toString()
        }
    // Two built-in functions used on data type 'Char'
    } while (it.equals('y'.toString(), true))

    println("BMI Array: ")
    for (i in arrayBMI) {
        print(" $i")
    }
    println()
    println("Weight Array: ")
    for (i in arrayWeight) {
        print(" $i")
    }
    println()
    println("Height Array: ")
    for (i in arrayHeight) {
        print(" $i")
    }

    // Two built-in functions used on data type 'Double'
    println("\n")
    println("Average height of all people: ${arrayHeight.average()}")
    println()
    println("The max weight of all people: ${arrayWeight.max()}")
}