fun add(a: Double, b: Double): Double = a + b

fun subtract(a: Double, b: Double): Double = a - b

fun multiply(a: Double, b: Double): Double = a * b

fun divide(a: Double, b: Double): Double {
    if (b == 0.0) {
        println("Error: Division by zero is not allowed.")
        return 0.0
    }
    return a / b
}

fun performCalculation(num1: Double, num2: Double, operatorSymbol: Char): Double {
    return when (operatorSymbol) {
        '+' -> add(num1, num2)
        '-' -> subtract(num1, num2)
        '*' -> multiply(num1, num2)
        '/' -> divide(num1, num2)
        else -> {
            println("Invalid operator! Please use +, -, *, or /.")
            0.0
        }
    }
}

fun main() {
    print("Enter first number: ")
    val num1 = readLine()?.toDoubleOrNull() ?: 0.0

    print("Enter an operator (+, -, *, /): ")
    val operatorSymbol = readLine().orEmpty().firstOrNull() ?: ' '

    print("Enter second number: ")
    val num2 = readLine()?.toDoubleOrNull() ?: 0.0

    val result = performCalculation(num1, num2, operatorSymbol)
    println("Result: $result")
}
