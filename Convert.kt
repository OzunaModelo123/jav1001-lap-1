fun main() {
    println("Welcome to the Measurement Conversion Program!")

    // Collect a numeric value from the user
    print("Enter the numeric value: ")
    val value = readLine()?.toDoubleOrNull()

    // Check if the value is valid
    if (value == null) {
        println("Invalid input. Exiting the program.")
        return
    }

    
}