import 'dart:io';

double add(double a, double b) {
  return a + b;
}

double subtract(double a, double b) {
  return a - b;
}

double multiply(double a, double b) {
  return a * b;
}

double divide(double a, double b) {
  if (b == 0) {
    stdout.writeln('Error: Division by zero is not allowed.');
    return 0;
  }
  return a / b;
}

double performCalculation(double num1, double num2, String operatorSymbol) {
  if (operatorSymbol == '+') {
    return add(num1, num2);
  }
  if (operatorSymbol == '-') {
    return subtract(num1, num2);
  }
  if (operatorSymbol == '*') {
    return multiply(num1, num2);
  }
  if (operatorSymbol == '/') {
    return divide(num1, num2);
  }

  stdout.writeln('Invalid operator! Please use +, -, *, or /.');
  return 0;
}

void main() {
  stdout.write('Enter first number: ');
  final double num1 = double.tryParse(stdin.readLineSync() ?? '') ?? 0;

  stdout.write('Enter an operator (+, -, *, /): ');
  final String operatorInput = stdin.readLineSync() ?? '';

  stdout.write('Enter second number: ');
  final double num2 = double.tryParse(stdin.readLineSync() ?? '') ?? 0;

  final double result = performCalculation(
    num1,
    num2,
    operatorInput.isNotEmpty ? operatorInput[0] : '',
  );

  stdout.writeln('Result: $result');
}
