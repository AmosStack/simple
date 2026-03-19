import java.util.Scanner;

public class CalculatorMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\n1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            if (choice == 3) {
                System.out.println("Exiting...");
                break;
            }

            else if (choice == 1 || choice == 2) {
                System.out.print("Enter first number: ");
                double a = sc.nextDouble();

                System.out.print("Enter second number: ");
                double b = sc.nextDouble();

                switch (choice) {
                    case 1:
                        System.out.println("Sum: " + (a + b));
                        break;
                    case 2:
                        System.out.println("Defference: " + (a - b));
                        break;
                }
            } else {
                System.out.println("Invalid choice");
            }
        }

        sc.close();
    }
}