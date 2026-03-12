import 'dart:io';

late List<String> subjects;
late List<String> studentNames;
late List<List<int>> marks;

void registerSubjects() {
  stdout.writeln('\nRegister subjects:');
  for (int i = 0; i < subjects.length; i++) {
    stdout.write('Enter subject ${i + 1} name: ');
    subjects[i] = stdin.readLineSync() ?? '';
  }
}

void registerStudentsAndMarks(int numStudents, int numSubjects) {
  for (int i = 0; i < numStudents; i++) {
    stdout.write('\nEnter student ${i + 1} name: ');
    studentNames[i] = stdin.readLineSync() ?? '';

    for (int j = 0; j < numSubjects; j++) {
      stdout.write('Enter marks for ${subjects[j]}: ');
      marks[i][j] = int.tryParse(stdin.readLineSync() ?? '') ?? 0;
    }
  }
}

double calculateAverage(List<int> studentMarks, int numSubjects) {
  int total = 0;
  for (final int mark in studentMarks) {
    total += mark;
  }
  return total / numSubjects;
}

String determineGrade(double avgMarks) {
  if (avgMarks >= 90) return 'A';
  if (avgMarks >= 80) return 'B';
  if (avgMarks >= 70) return 'C';
  if (avgMarks >= 60) return 'D';
  return 'F';
}

void displayReport(int numStudents, int numSubjects) {
  stdout.writeln('\nStudent Report:');
  stdout.writeln('------------------------------------');
  stdout.writeln(
    '${'Student Name'.padRight(15)} ${'Avg Marks'.padRight(10)} ${'Grade'.padRight(10)}',
  );
  stdout.writeln('------------------------------------');

  for (int i = 0; i < numStudents; i++) {
    final double avgMarks = calculateAverage(marks[i], numSubjects);
    final String grade = determineGrade(avgMarks);
    stdout.writeln(
      '${studentNames[i].padRight(15)} ${avgMarks.toStringAsFixed(2).padRight(10)} ${grade.padRight(10)}',
    );
  }
}

void main() {
  stdout.write('Enter the number of students: ');
  final int numStudents = int.tryParse(stdin.readLineSync() ?? '') ?? 0;

  stdout.write('Enter the number of subjects: ');
  final int numSubjects = int.tryParse(stdin.readLineSync() ?? '') ?? 0;

  subjects = List.filled(numSubjects, '');
  studentNames = List.filled(numStudents, '');
  marks = List.generate(numStudents, (_) => List.filled(numSubjects, 0));

  registerSubjects();
  registerStudentsAndMarks(numStudents, numSubjects);
  displayReport(numStudents, numSubjects);
}
