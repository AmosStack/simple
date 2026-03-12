subjects = []
student_names = []
marks = []


def register_subjects():
    print("\nRegister subjects:")
    for i in range(len(subjects)):
        subjects[i] = input(f"Enter subject {i + 1} name: ")


def register_students_and_marks(num_students, num_subjects):
    for i in range(num_students):
        student_names[i] = input(f"\nEnter student {i + 1} name: ")

        for j in range(num_subjects):
            marks[i][j] = int(input(f"Enter marks for {subjects[j]}: "))


def calculate_average(student_marks, num_subjects):
    total = 0
    for mark in student_marks:
        total += mark
    return total / num_subjects


def determine_grade(avg_marks):
    if avg_marks >= 90:
        return "A"
    if avg_marks >= 80:
        return "B"
    if avg_marks >= 70:
        return "C"
    if avg_marks >= 60:
        return "D"
    return "F"


def display_report(num_students, num_subjects):
    print("\nStudent Report:")
    print("------------------------------------")
    print(f"{'Student Name':<15} {'Avg Marks':<10} {'Grade':<10}")
    print("------------------------------------")

    for i in range(num_students):
        avg_marks = calculate_average(marks[i], num_subjects)
        grade = determine_grade(avg_marks)
        print(f"{student_names[i]:<15} {avg_marks:<10.2f} {grade:<10}")


def main():
    num_students = int(input("Enter the number of students: "))
    num_subjects = int(input("Enter the number of subjects: "))

    global subjects, student_names, marks
    subjects = ["" for _ in range(num_subjects)]
    student_names = ["" for _ in range(num_students)]
    marks = [[0 for _ in range(num_subjects)] for _ in range(num_students)]

    register_subjects()
    register_students_and_marks(num_students, num_subjects)
    display_report(num_students, num_subjects)


if __name__ == "__main__":
    main()
