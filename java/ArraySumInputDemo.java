// Takes five user inputs, stores them in an array, and prints their sum.
import java.util.Scanner;

public class ArraySumInputDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        int sum = 0;

        System.out.println("Enter 5 integers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }

        System.out.println("The sum of the entered numbers is: " + sum);
        scanner.close();
    }
}
