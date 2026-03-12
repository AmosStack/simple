ROWS = 20
COLUMNS = 8
seats = [["Available" for _ in range(COLUMNS)] for _ in range(ROWS)]


def display_seats():
    print("\nSeating Chart:")
    for i in range(ROWS):
        for j in range(COLUMNS):
            print("[ ]" if seats[i][j] == "Available" else "[X]", end=" ")
        print()


def book_seat():
    row = int(input("Enter row number (1-20): ")) - 1
    col = int(input("Enter column number (1-8): ")) - 1

    if row < 0 or row >= ROWS or col < 0 or col >= COLUMNS:
        print("Invalid seat selection. Please choose a valid seat.")
        return

    if seats[row][col] == "Available":
        passenger_name = input("Enter passenger name: ")
        seats[row][col] = passenger_name
        print(f"Seat successfully booked for {passenger_name}")
    else:
        print("Seat already taken! Choose another seat.")


def main():
    while True:
        print("\nAirplane Ticket Booking System")
        print("1. View Seats")
        print("2. Book a Seat")
        print("3. Exit")
        print("Enter your choice: ", end="")
        print("---------------------------")
        print("Developed by masterplan jr.")

        choice = int(input())

        if choice == 1:
            display_seats()
        elif choice == 2:
            book_seat()
        elif choice == 3:
            print("Exiting the system. Have a nice flight!")
            return
        else:
            print("Invalid choice. Please try again.")


if __name__ == "__main__":
    main()
