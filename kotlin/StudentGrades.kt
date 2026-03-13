var subjects = mutableListOf<String>()
var studentNames = mutableListOf<String>()
var marks = mutableListOf<MutableList<Int>>()

fun registerSubjects() {
    println("\nRegister subjects:")
    for (index in subjects.indices) {
        print("Enter subject ${index + 1} name: ")
        subjects[index] = readLine().orEmpty()
    }
}

fun registerStudentsAndMarks(numStudents: Int, numSubjects: Int) {
    for (studentIndex in 0 until numStudents) {
        print("\nEnter student ${studentIndex + 1} name: ")
        studentNames[studentIndex] = readLine().orEmpty()

        for (subjectIndex in 0 until numSubjects) {
            print("Enter marks for ${subjects[subjectIndex]}: ")
            marks[studentIndex][subjectIndex] = readLine()?.toIntOrNull() ?: 0
        }
    }
}

fun calculateAverage(studentMarks: List<Int>, numSubjects: Int): Double {
    val total = studentMarks.sum()
    return total.toDouble() / numSubjects
}

fun determineGrade(avgMarks: Double): Char {
    return when {
        avgMarks >= 90 -> 'A'
        avgMarks >= 80 -> 'B'
        avgMarks >= 70 -> 'C'
        avgMarks >= 60 -> 'D'
        else -> 'F'
    }
}

fun pad(value: String, width: Int): String {
    return if (value.length >= width) value else value + " ".repeat(width - value.length)
}

fun displayReport(numStudents: Int, numSubjects: Int) {
    println("\nStudent Report:")
    println("------------------------------------")
    println("${pad("Student Name", 15)} ${pad("Avg Marks", 10)} ${pad("Grade", 10)}")
    println("------------------------------------")

    for (index in 0 until numStudents) {
        val avgMarks = calculateAverage(marks[index], numSubjects)
        val grade = determineGrade(avgMarks)
        println("${pad(studentNames[index], 15)} ${pad(String.format("%.2f", avgMarks), 10)} ${pad(grade.toString(), 10)}")
    }
}

fun main() {
    print("Enter the number of students: ")
    val numStudents = readLine()?.toIntOrNull() ?: 0

    print("Enter the number of subjects: ")
    val numSubjects = readLine()?.toIntOrNull() ?: 0

    subjects = MutableList(numSubjects) { "" }
    studentNames = MutableList(numStudents) { "" }
    marks = MutableList(numStudents) { MutableList(numSubjects) { 0 } }

    registerSubjects()
    registerStudentsAndMarks(numStudents, numSubjects)
    displayReport(numStudents, numSubjects)
}
