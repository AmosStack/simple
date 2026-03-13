import Foundation

func add(_ a: Double, _ b: Double) -> Double {
    a + b
}

func subtract(_ a: Double, _ b: Double) -> Double {
    a - b
}

func multiply(_ a: Double, _ b: Double) -> Double {
    a * b
}

func divide(_ a: Double, _ b: Double) -> Double {
    if b == 0 {
        print("Error: Division by zero is not allowed.")
        return 0
    }
    return a / b
}

func performCalculation(_ num1: Double, _ num2: Double, _ operatorSymbol: Character) -> Double {
    switch operatorSymbol {
    case "+":
        return add(num1, num2)
    case "-":
        return subtract(num1, num2)
    case "*":
        return multiply(num1, num2)
    case "/":
        return divide(num1, num2)
    default:
        print("Invalid operator! Please use +, -, *, or /.")
        return 0
    }
}

print("Enter first number: ", terminator: "")
let num1 = Double(readLine() ?? "") ?? 0

print("Enter an operator (+, -, *, /): ", terminator: "")
let operatorInput = readLine() ?? ""
let operatorSymbol = operatorInput.first ?? " "

print("Enter second number: ", terminator: "")
let num2 = Double(readLine() ?? "") ?? 0

let result = performCalculation(num1, num2, operatorSymbol)
print("Result: \(result)")
