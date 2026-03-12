const readline = require("readline");

const ROWS = 20;
const COLUMNS = 8;
const seats = Array.from({ length: ROWS }, () => Array(COLUMNS).fill("Available"));

function askFactory() {
  const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout,
  });

  const ask = (question) =>
    new Promise((resolve) => {
      rl.question(question, (answer) => resolve(answer));
    });

  return { rl, ask };
}

function displaySeats() {
  console.log("\nSeating Chart:");
  for (let i = 0; i < ROWS; i += 1) {
    let rowText = "";
    for (let j = 0; j < COLUMNS; j += 1) {
      rowText += `${seats[i][j] === "Available" ? "[ ]" : "[X]"} `;
    }
    console.log(rowText.trimEnd());
  }
}

async function bookSeat(ask) {
  const row = Number(await ask("Enter row number (1-20): ")) - 1;
  const col = Number(await ask("Enter column number (1-8): ")) - 1;

  if (
    Number.isNaN(row) ||
    Number.isNaN(col) ||
    row < 0 ||
    row >= ROWS ||
    col < 0 ||
    col >= COLUMNS
  ) {
    console.log("Invalid seat selection. Please choose a valid seat.");
    return;
  }

  if (seats[row][col] === "Available") {
    const passengerName = await ask("Enter passenger name: ");
    seats[row][col] = passengerName;
    console.log(`Seat successfully booked for ${passengerName}`);
  } else {
    console.log("Seat already taken! Choose another seat.");
  }
}

async function main() {
  const { rl, ask } = askFactory();

  while (true) {
    console.log("\nAirplane Ticket Booking System");
    console.log("1. View Seats");
    console.log("2. Book a Seat");
    console.log("3. Exit");
    process.stdout.write("Enter your choice: ");
    console.log("---------------------------");
    console.log("Developed by masterplan jr.");

    const choice = Number(await ask(""));

    if (choice === 1) {
      displaySeats();
    } else if (choice === 2) {
      await bookSeat(ask);
    } else if (choice === 3) {
      console.log("Exiting the system. Have a nice flight!");
      rl.close();
      return;
    } else {
      console.log("Invalid choice. Please try again.");
    }
  }
}

main();
