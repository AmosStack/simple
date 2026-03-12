const readline = require("readline");

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

  const mark1 = Number(await ask("Enter the first mark:\n"));
  const mark2 = Number(await ask("Enter the second mark:\n"));
  const mark3 = Number(await ask("Enter the third mark:\n"));

  const average = (mark1 + mark2 + mark3) / 3.0;
  const roundedAverage = Math.round(average);

  if (roundedAverage >= 40) {
    console.log("PASS");
  } else {
    console.log("FAIL");
  }

  rl.close();
}

main();
