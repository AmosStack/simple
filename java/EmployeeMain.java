// Demonstrates inheritance with Employee and Manager classes.
class Employee {
    protected int id;
    protected String name;
    protected double salary;
    protected String department;

    public Employee(int id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: $" + salary + ", Department: " + department);
    }
}

class Manager extends Employee {
    private double bonus;

    public Manager(int id, String name, double salary, String department, double bonus) {
        super(id, name, salary, department);
        this.bonus = bonus;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Bonus: $" + bonus);
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "Alice", 50000, "IT");
        Manager mgr1 = new Manager(201, "Joh", 80000, "HR", 10000);

        emp1.displayDetails();
        System.out.println();
        mgr1.displayDetails();
    }
}