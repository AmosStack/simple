import Foundation

print("Enter the first mark:")
let mark1 = Int(readLine() ?? "") ?? 0

print("Enter the second mark:")
let mark2 = Int(readLine() ?? "") ?? 0

print("Enter the third mark:")
let mark3 = Int(readLine() ?? "") ?? 0

let average = Double(mark1 + mark2 + mark3) / 3.0
let roundedAverage = Int(average.rounded())

if roundedAverage >= 40 {
    print("PASS")
} else {
    print("FAIL")
}
