fun isPalindrome(text: String): Boolean {
    var left = 0
    var right = text.length - 1

    while (left < right) {
        if (text[left] != text[right]) {
            return false
        }
        left++
        right--
    }

    return true
}

fun main() {
    print("Enter a string to check if it's a palindrome: ")
    val input = readLine().orEmpty()
    val processed = input.replace("\\s+".toRegex(), "").lowercase()

    if (isPalindrome(processed)) {
        println("\"$input\" is a palindrome.")
    } else {
        println("\"$input\" is not a palindrome.")
    }
}
