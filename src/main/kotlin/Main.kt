fun main(args: Array<String>) {

    //reading in user input

    println("Enter your Name: ")
    val userInputName = readLine() 
    // input validation (Written by Maggie Roma)
    while (userInputName = “”) {
        println(“Invalid input: Enter your Name Again”)
        userInputName = readLine()
    }  
    
    println("Enter your weight : ")
    val userInputW = readLine()?.toDoubleOrNull() ?: error("enter a number")
    // input validation
    while (userInputW < 0) {
        println(“Invalid input: Enter a Weight that is 0 or Greater”)
        userInputW = readLine()?.toDoubleOrNull() ?: error("enter a number")
    }   
    
    println("Enter your height : ")
    val userInputH = readLine()?.toDoubleOrNull() ?: error("enter a number")
    // input validation
    while (userInputH < 0) {
        println(“Invalid input: Enter a Height that is 0 or Greater”)
        userInputH = readLine()?.toDoubleOrNull() ?: error("enter a number")
    }

    val c1 = User()

    c1.name = userInputName.toString()
    c1.weight = userInputW
    c1.height= userInputH
    c1.onDiet = true
    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println(c1.name)
    println(c1.weight)
    println(c1.onDiet)
    println(c1.calculateBMI())
    println(c1.result())
}
