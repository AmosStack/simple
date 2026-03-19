// Reads five integers from input and prints their sum.
import java.util.Scanner;

public class ArraySumFromInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("Enter 5 integers:");
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }
        System.out.println("Sum of elements: " + sum);
        scanner.close();
    }
}