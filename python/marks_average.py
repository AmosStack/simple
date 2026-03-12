def main():
    mark1 = int(input("Enter the first mark:\n"))
    mark2 = int(input("Enter the second mark:\n"))
    mark3 = int(input("Enter the third mark:\n"))

    average = (mark1 + mark2 + mark3) / 3.0
    rounded_average = round(average)

    if rounded_average >= 40:
        print("PASS")
    else:
        print("FAIL")


if __name__ == "__main__":
    main()
