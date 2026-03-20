import java.util.Scanner;

public class UnitConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\nUnit Converter Menu:   \n1. Convert cm to m");
           
            System.out.println("2. Convert m to cm");
            System.out.println("3. Quit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();

            if (choice == 3) {
                System.out.println("Program terminated.");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter value in centimeters: ");
                    double cm = input.nextDouble();
                    double meters = cm / 100;
                    System.out.println("Converted value in meters: " + meters);
                    break;

                case 2:
                    System.out.print("Enter value in meters: ");
                    double m = input.nextDouble();
                    double centimeters = m * 100;
                    System.out.println("Converted value in centimeters: " + centimeters);
                    break;

                default:
                    System.out.println("Invalid choice! Please select 1, 2, or 3.");
            }
        }

        input.close();
    }
}