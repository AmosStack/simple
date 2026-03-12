const readline = require("readline");

let subjects = [];
let studentNames = [];
let marks = [];

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

async function registerSubjects(ask) {
  console.log("\nRegister subjects:");
  for (let i = 0; i < subjects.length; i += 1) {
    subjects[i] = await ask(`Enter subject ${i + 1} name: `);
  }
}

async function registerStudentsAndMarks(ask, numStudents, numSubjects) {
  for (let i = 0; i < numStudents; i += 1) {
    studentNames[i] = await ask(`\nEnter student ${i + 1} name: `);

    for (let j = 0; j < numSubjects; j += 1) {
      marks[i][j] = Number(await ask(`Enter marks for ${subjects[j]}: `));
    }
  }
}

function calculateAverage(studentMarks, numSubjects) {
  let total = 0;
  for (const mark of studentMarks) {
    total += mark;
  }
  return total / numSubjects;
}

function determineGrade(avgMarks) {
  if (avgMarks >= 90) return "A";
  if (avgMarks >= 80) return "B";
  if (avgMarks >= 70) return "C";
  if (avgMarks >= 60) return "D";
  return "F";
}

function displayReport(numStudents, numSubjects) {
  console.log("\nStudent Report:");
  console.log("------------------------------------");
  console.log(`${"Student Name".padEnd(15)} ${"Avg Marks".padEnd(10)} ${"Grade".padEnd(10)}`);
  console.log("------------------------------------");

  for (let i = 0; i < numStudents; i += 1) {
    const avgMarks = calculateAverage(marks[i], numSubjects);
    const grade = determineGrade(avgMarks);
    console.log(`${studentNames[i].padEnd(15)} ${avgMarks.toFixed(2).padEnd(10)} ${grade.padEnd(10)}`);
  }
}

async function main() {
  const { rl, ask } = askFactory();

  const numStudents = Number(await ask("Enter the number of students: "));
  const numSubjects = Number(await ask("Enter the number of subjects: "));

  subjects = Array(numSubjects).fill("");
  studentNames = Array(numStudents).fill("");
  marks = Array.from({ length: numStudents }, () => Array(numSubjects).fill(0));

  await registerSubjects(ask);
  await registerStudentsAndMarks(ask, numStudents, numSubjects);
  displayReport(numStudents, numSubjects);

  rl.close();
}

main();
