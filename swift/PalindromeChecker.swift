import Foundation

func isPalindrome(_ text: String) -> Bool {
    let characters = Array(text)
    var left = 0
    var right = characters.count - 1

    while left < right {
        if characters[left] != characters[right] {
            return false
        }
        left += 1
        right -= 1
    }

    return true
}

print("Enter a string to check if it's a palindrome: ", terminator: "")
let input = readLine() ?? ""
let processed = input.replacingOccurrences(of: "\\s+", with: "", options: .regularExpression).lowercased()

if isPalindrome(processed) {
    print("\"\(input)\" is a palindrome.")
} else {
    print("\"\(input)\" is not a palindrome.")
}
