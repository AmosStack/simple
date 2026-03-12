import 'dart:io';

void main() {
  stdout.writeln('Enter the first mark:');
  final int mark1 = int.tryParse(stdin.readLineSync() ?? '') ?? 0;

  stdout.writeln('Enter the second mark:');
  final int mark2 = int.tryParse(stdin.readLineSync() ?? '') ?? 0;

  stdout.writeln('Enter the third mark:');
  final int mark3 = int.tryParse(stdin.readLineSync() ?? '') ?? 0;

  final double average = (mark1 + mark2 + mark3) / 3.0;
  final int roundedAverage = average.round();

  if (roundedAverage >= 40) {
    stdout.writeln('PASS');
  } else {
    stdout.writeln('FAIL');
  }
}
