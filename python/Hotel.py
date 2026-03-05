import os

FILE_NAME = "rooms.txt"

# Initialize rooms if file doesn't exist
def initialize_rooms():
    if os.path.exists(FILE_NAME):
        return

    with open(FILE_NAME, "w") as file:
        for i in range(101, 116):  # Rooms 101–115
            file.write(f"{i}, available,\n")

# Load rooms from file
def load_rooms():
    rooms = []
    with open(FILE_NAME, "r") as file:
        for line in file:
            room_number, status, booked_by = line.strip().split(",")
            rooms.append({
                "room_number": room_number,
                "status": status,
                "booked_by": booked_by
            })
    return rooms

# Save rooms to file
def save_rooms(rooms):
    with open(FILE_NAME, "w") as file:
        for room in rooms:
            file.write(f"{room['room_number']},{room['status']},{room['booked_by']}\n")

# View room status
def view_rooms():
    rooms = load_rooms()
    print("\nRoom Status:")
    for room in rooms:
        print(f"Room {room['room_number']} - {room['status']}")

# Book a room
def book_room():
    rooms = load_rooms()
    room_no = input("Enter room number to book: ")
    name = input("Enter your name: ")

    for room in rooms:
        if room["room_number"] == room_no:
            if room["status"] == "available":
                room["status"] = "booked"
                room["booked_by"] = name
                save_rooms(rooms)
                print("Room booked successfully.")
                return
            else:
                print("Room already booked.")
                return

    print("Room not found.")

# Cancel a booking
def cancel_booking():
    rooms = load_rooms()
    room_no = input("Enter room number to cancel booking: ")

    for room in rooms:
        if room["room_number"] == room_no:
            if room["status"] == "booked":
                room["status"] = "available"
                room["booked_by"] = ""
                save_rooms(rooms)
                print("Booking cancelled successfully.")
                return
            else:
                print("Room is not booked.")
                return

    print("Room not found.")

# Main menu
def main():
    initialize_rooms()

    while True:
        print("\n=== Room Booking System ===")
        print("1. View Rooms")
        print("2. Book Room")
        print("3. Cancel Booking")
        print("4. Exit")

        choice = input("Choose an option (1-4): ")

        if choice == "1":
            view_rooms()
        elif choice == "2":
            book_room()
        elif choice == "3":
            cancel_booking()
        elif choice == "4":
            print("Exiting system.")
            break
        else:
            print("Invalid choice.")

if __name__ == "__main__":
    main()
