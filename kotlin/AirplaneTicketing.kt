const val ROWS = 20
const val COLUMNS = 8
val seats = MutableList(ROWS) { MutableList(COLUMNS) { "Available" } }

fun displaySeats() {
    println("\nSeating Chart:")
    for (row in seats) {
        println(row.joinToString(" ") { if (it == "Available") "[ ]" else "[X]" })
    }
}

fun bookSeat() {
    print("Enter row number (1-20): ")
    val row = (readLine()?.toIntOrNull() ?: 0) - 1

    print("Enter column number (1-8): ")
    val col = (readLine()?.toIntOrNull() ?: 0) - 1

    if (row !in 0 until ROWS || col !in 0 until COLUMNS) {
        println("Invalid seat selection. Please choose a valid seat.")
        return
    }

    if (seats[row][col] == "Available") {
        print("Enter passenger name: ")
        val passengerName = readLine().orEmpty()
        seats[row][col] = passengerName
        println("Seat successfully booked for $passengerName")
    } else {
        println("Seat already taken! Choose another seat.")
    }
}

fun main() {
    while (true) {
        println("\nAirplane Ticket Booking System")
        println("1. View Seats")
        println("2. Book a Seat")
        println("3. Exit")
        print("Enter your choice: ")
        println("---------------------------")
        println("Developed by masterplan jr.")

        when (readLine()?.toIntOrNull() ?: -1) {
            1 -> displaySeats()
            2 -> bookSeat()
            3 -> {
                println("Exiting the system. Have a nice flight!")
                return
            }
            else -> println("Invalid choice. Please try again.")
        }
    }
}
