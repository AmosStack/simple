def add(a, b):
    return a + b


def subtract(a, b):
    return a - b


def multiply(a, b):
    return a * b


def divide(a, b):
    if b == 0:
        print("Error: Division by zero is not allowed.")
        return 0
    return a / b


def perform_calculation(num1, num2, operator):
    if operator == "+":
        return add(num1, num2)
    if operator == "-":
        return subtract(num1, num2)
    if operator == "*":
        return multiply(num1, num2)
    if operator == "/":
        return divide(num1, num2)

    print("Invalid operator! Please use +, -, *, or /.")
    return 0


def main():
    num1 = float(input("Enter first number: "))
    operator = input("Enter an operator (+, -, *, /): ")[0]
    num2 = float(input("Enter second number: "))

    result = perform_calculation(num1, num2, operator)
    print(f"Result: {result}")


if __name__ == "__main__":
    main()
