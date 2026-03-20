// Demonstrates average and grade calculation for multiple students.
class Student {
    private String name;
    private int regNumber;
    private double[] marks;

    public Student(String name, int regNumber, double[] marks) {
        this.name = name;
        this.regNumber = regNumber;
        this.marks = marks;
    }

    public double calculateAverage() {
        double sum = 0;
        for (double mark : marks) {
            sum += mark;
        }
        return sum / marks.length;
    }

    public char getGrade() {
        double avg = calculateAverage();
        if (avg >= 90) return 'A';
        else if (avg >= 75) return 'B';
        else if (avg >= 50) return 'C';
        else return 'F';
    }

    public void displayDetails() {
        System.out.println("Name: " + name + ", Reg Number: " + regNumber + ", Grade: " + getGrade());
    }
}

public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student("John", 101, new double[]{85, 90, 84});
        Student s2 = new Student("Amos", 102, new double[]{85, 97, 80});
        Student s3 = new Student("Peter", 104, new double[]{69, 90, 80});

        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
    }
}

