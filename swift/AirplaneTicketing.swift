import Foundation

let rows = 20
let columns = 8
var seats = Array(repeating: Array(repeating: "Available", count: columns), count: rows)

func displaySeats() {
    print("\nSeating Chart:")
    for row in seats {
        let rowText = row.map { $0 == "Available" ? "[ ]" : "[X]" }.joined(separator: " ")
        print(rowText)
    }
}

func bookSeat() {
    print("Enter row number (1-20): ", terminator: "")
    let row = (Int(readLine() ?? "") ?? 0) - 1

    print("Enter column number (1-8): ", terminator: "")
    let col = (Int(readLine() ?? "") ?? 0) - 1

    if row < 0 || row >= rows || col < 0 || col >= columns {
        print("Invalid seat selection. Please choose a valid seat.")
        return
    }

    if seats[row][col] == "Available" {
        print("Enter passenger name: ", terminator: "")
        let passengerName = readLine() ?? ""
        seats[row][col] = passengerName
        print("Seat successfully booked for \(passengerName)")
    } else {
        print("Seat already taken! Choose another seat.")
    }
}

while true {
    print("\nAirplane Ticket Booking System")
    print("1. View Seats")
    print("2. Book a Seat")
    print("3. Exit")
    print("Enter your choice: ", terminator: "")
    print("---------------------------")
    print("Developed by masterplan jr.")

    let choice = Int(readLine() ?? "") ?? -1

    if choice == 1 {
        displaySeats()
    } else if choice == 2 {
        bookSeat()
    } else if choice == 3 {
        print("Exiting the system. Have a nice flight!")
        break
    } else {
        print("Invalid choice. Please try again.")
    }
}
