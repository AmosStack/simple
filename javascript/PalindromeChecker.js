const readline = require("readline");

function isPalindrome(str) {
  let left = 0;
  let right = str.length - 1;

  while (left < right) {
    if (str.charAt(left) !== str.charAt(right)) {
      return false;
    }
    left += 1;
    right -= 1;
  }

  return true;
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

  const input = await ask("Enter a string to check if it's a palindrome: ");
  const processedString = input.replace(/\s+/g, "").toLowerCase();

  if (isPalindrome(processedString)) {
    console.log(`\"${input}\" is a palindrome.`);
  } else {
    console.log(`\"${input}\" is not a palindrome.`);
  }

  rl.close();
}

main();
