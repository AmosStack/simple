/*
     In a program, input 3 numbers : compute the average of three numbers...
                                                                */

import java.util.Scanner;

// Computes and prints the average of three input numbers.
public class AverageOfThreeNumbers {

    public static void average(float a, float b, float c) {
        float avg = (a + b + c) / 3;
        System.out.println("Average of three numbers: " + avg);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the three number: ");
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        float c = scanner.nextFloat();

        scanner.close();
        // float sum = (a + b + c) / 3;
        // System.out.println("Average of three no: " + sum);

        average(a, b, c);

    }
}

/*
 *   Output:
 *   Enter the three number: 78.5 75.5 86.9
 *   Average of three no: 80.299995
 */