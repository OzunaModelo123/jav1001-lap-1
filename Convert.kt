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

    // Collect the current unit of measurement
    print("Enter the current unit of measurement: ")
    val unit = readLine()?.toLowerCase()

     // Perform the appropriate conversion
    val result = when (unit) {
        "km" -> value * 0.62
        "mi" -> value * 1.61
        "cm" -> value * 0.39
        "in" -> value * 2.54
        "kg" -> value * 2.2
        "lb" -> value * 0.45
        "g" -> value * 0.04
        "oz" -> value * 28.35
        "c" -> (value * (9 / 5)) + 32
        "f" -> (value - 32) * (5 / 9)
        "k" -> value + 273.15
        "l" -> value * 4.17
        "cup" -> value * 0.24
        else -> {
            println("Invalid unit of measurement. Exiting the program.")
            return
        }
    }
}