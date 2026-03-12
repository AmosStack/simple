import 'dart:io';

bool isPalindrome(String text) {
  int left = 0;
  int right = text.length - 1;

  while (left < right) {
    if (text[left] != text[right]) {
      return false;
    }
    left++;
    right--;
  }

  return true;
}

void main() {
  stdout.write("Enter a string to check if it's a palindrome: ");
  final String input = stdin.readLineSync() ?? '';
  final String processed = input.replaceAll(RegExp(r'\s+'), '').toLowerCase();

  if (isPalindrome(processed)) {
    stdout.writeln('"$input" is a palindrome.');
  } else {
    stdout.writeln('"$input" is not a palindrome.');
  }
}
