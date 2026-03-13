fun main() {
    println("Enter the first mark:")
    val mark1 = readLine()?.toIntOrNull() ?: 0

    println("Enter the second mark:")
    val mark2 = readLine()?.toIntOrNull() ?: 0

    println("Enter the third mark:")
    val mark3 = readLine()?.toIntOrNull() ?: 0

    val average = (mark1 + mark2 + mark3) / 3.0
    val roundedAverage = kotlin.math.round(average).toInt()

    if (roundedAverage >= 40) {
        println("PASS")
    } else {
        println("FAIL")
    }
}
