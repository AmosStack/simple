def is_palindrome(text):
    left = 0
    right = len(text) - 1

    while left < right:
        if text[left] != text[right]:
            return False
        left += 1
        right -= 1
    return True


def main():
    user_input = input("Enter a string to check if it's a palindrome: ")
    processed = "".join(user_input.split()).lower()

    if is_palindrome(processed):
        print(f'"{user_input}" is a palindrome.')
    else:
        print(f'"{user_input}" is not a palindrome.')


if __name__ == "__main__":
    main()
