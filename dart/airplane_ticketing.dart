import 'dart:io';

const int rows = 20;
const int columns = 8;
final List<List<String>> seats = List.generate(
  rows,
  (_) => List.filled(columns, 'Available'),
);

void displaySeats() {
  stdout.writeln('\nSeating Chart:');
  for (int i = 0; i < rows; i++) {
    final String rowText = seats[i]
        .map((seat) => seat == 'Available' ? '[ ]' : '[X]')
        .join(' ');
    stdout.writeln(rowText);
  }
}

void bookSeat() {
  stdout.write('Enter row number (1-20): ');
  final int row = (int.tryParse(stdin.readLineSync() ?? '') ?? 0) - 1;

  stdout.write('Enter column number (1-8): ');
  final int col = (int.tryParse(stdin.readLineSync() ?? '') ?? 0) - 1;

  if (row < 0 || row >= rows || col < 0 || col >= columns) {
    stdout.writeln('Invalid seat selection. Please choose a valid seat.');
    return;
  }

  if (seats[row][col] == 'Available') {
    stdout.write('Enter passenger name: ');
    final String passengerName = stdin.readLineSync() ?? '';
    seats[row][col] = passengerName;
    stdout.writeln('Seat successfully booked for $passengerName');
  } else {
    stdout.writeln('Seat already taken! Choose another seat.');
  }
}

void main() {
  while (true) {
    stdout.writeln('\nAirplane Ticket Booking System');
    stdout.writeln('1. View Seats');
    stdout.writeln('2. Book a Seat');
    stdout.writeln('3. Exit');
    stdout.write('Enter your choice: ');
    stdout.writeln('---------------------------');
    stdout.writeln('Developed by masterplan jr.');

    final int choice = int.tryParse(stdin.readLineSync() ?? '') ?? -1;

    if (choice == 1) {
      displaySeats();
    } else if (choice == 2) {
      bookSeat();
    } else if (choice == 3) {
      stdout.writeln('Exiting the system. Have a nice flight!');
      return;
    } else {
      stdout.writeln('Invalid choice. Please try again.');
    }
  }
}
