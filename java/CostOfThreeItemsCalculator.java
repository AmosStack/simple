/*
     Enter cost of 3 items from the user (using float data type) - a pencil, a pen and
     an eraser. You have to output the total cost of the items back to the user as their bill.  */

import java.util.Scanner;

// Calculates total bill and bill with 18% tax for three item costs.
public class CostOfThreeItemsCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the cost of pencil: ");
        float a = scanner.nextFloat();
        System.out.print("Enter the cost of pen: ");
        float b = scanner.nextFloat();
        System.out.print("Enter the cost of eraser: ");
        float c = scanner.nextFloat();

        scanner.close();
        float total = (a + b + c);
        System.out.println("Bill is : " + total);
        // Add on - with 18% tax
        float newTotal = total + (0.18f * total);
        System.out.println("Bill with 18% tax : " + newTotal);
        
    }
}

/*
 *    Output:
 *    Enter the cost of pencil: 5
 *    Enter the cost of pen: 8
 *    Enter the cost of eraser: 5
 *    Bill is : 18.0
 *    Bill with 18% tax : 21.24
 */