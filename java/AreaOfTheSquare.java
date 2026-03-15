/*
    In a program, input the side of a square. You have to output the area of the square. */

import java.util.Scanner;

public class AreaOfTheSquare {

    public static void main(String[] args) {

        System.out.print("Enter the side of a square: ");
        Scanner scanner = new Scanner(System.in);
        float r = scanner.nextFloat();
        scanner.close();

        Double area = Math.pow(r,r);

        System.out.println("Area of the square: " + area);

    }
}


/*
 *  
 *   Output:
 *   Enter the side of a square: 5
 *   Area of the square: 25.0
 * 
 */