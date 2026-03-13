import Foundation

var subjects: [String] = []
var studentNames: [String] = []
var marks: [[Int]] = []

extension String {
    func padded(to length: Int) -> String {
        if count >= length {
            return self
        }
        return self + String(repeating: " ", count: length - count)
    }
}

func registerSubjects() {
    print("\nRegister subjects:")
    for index in subjects.indices {
        print("Enter subject \(index + 1) name: ", terminator: "")
        subjects[index] = readLine() ?? ""
    }
}

func registerStudentsAndMarks(numStudents: Int, numSubjects: Int) {
    for studentIndex in 0..<numStudents {
        print("\nEnter student \(studentIndex + 1) name: ", terminator: "")
        studentNames[studentIndex] = readLine() ?? ""

        for subjectIndex in 0..<numSubjects {
            print("Enter marks for \(subjects[subjectIndex]): ", terminator: "")
            marks[studentIndex][subjectIndex] = Int(readLine() ?? "") ?? 0
        }
    }
}

func calculateAverage(studentMarks: [Int], numSubjects: Int) -> Double {
    let total = studentMarks.reduce(0, +)
    return Double(total) / Double(numSubjects)
}

func determineGrade(avgMarks: Double) -> String {
    if avgMarks >= 90 { return "A" }
    if avgMarks >= 80 { return "B" }
    if avgMarks >= 70 { return "C" }
    if avgMarks >= 60 { return "D" }
    return "F"
}

func displayReport(numStudents: Int, numSubjects: Int) {
    print("\nStudent Report:")
    print("------------------------------------")
    print("\("Student Name".padded(to: 15)) \("Avg Marks".padded(to: 10)) \("Grade".padded(to: 10))")
    print("------------------------------------")

    for index in 0..<numStudents {
        let avgMarks = calculateAverage(studentMarks: marks[index], numSubjects: numSubjects)
        let grade = determineGrade(avgMarks: avgMarks)
        let avgText = String(format: "%.2f", avgMarks)
        print("\(studentNames[index].padded(to: 15)) \(avgText.padded(to: 10)) \(grade.padded(to: 10))")
    }
}

print("Enter the number of students: ", terminator: "")
let numStudents = Int(readLine() ?? "") ?? 0

print("Enter the number of subjects: ", terminator: "")
let numSubjects = Int(readLine() ?? "") ?? 0

subjects = Array(repeating: "", count: numSubjects)
studentNames = Array(repeating: "", count: numStudents)
marks = Array(repeating: Array(repeating: 0, count: numSubjects), count: numStudents)

registerSubjects()
registerStudentsAndMarks(numStudents: numStudents, numSubjects: numSubjects)
displayReport(numStudents: numStudents, numSubjects: numSubjects)
