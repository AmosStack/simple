const readline = require("readline");

function add(a, b) {
  return a + b;
}

function subtract(a, b) {
  return a - b;
}

function multiply(a, b) {
  return a * b;
}

function divide(a, b) {
  if (b === 0) {
    console.log("Error: Division by zero is not allowed.");
    return 0;
  }
  return a / b;
}

function performCalculation(num1, num2, operator) {
  if (operator === "+") {
    return add(num1, num2);
  }
  if (operator === "-") {
    return subtract(num1, num2);
  }
  if (operator === "*") {
    return multiply(num1, num2);
  }
  if (operator === "/") {
    return divide(num1, num2);
  }

  console.log("Invalid operator! Please use +, -, *, or /.");
  return 0;
}

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

async function main() {
  const { rl, ask } = askFactory();

  const num1 = Number(await ask("Enter first number: "));
  const operator = (await ask("Enter an operator (+, -, *, /): ")).charAt(0);
  const num2 = Number(await ask("Enter second number: "));

  const result = performCalculation(num1, num2, operator);
  console.log(`Result: ${result}`);

  rl.close();
}

main();
