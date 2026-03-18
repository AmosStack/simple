// Prints multiplication table using a while loop.
import java.util.Scanner;

public class MultiplicationTableWhileLoop {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.print("Enter a number to generate its multiplication table: ");
            int number = scanner.nextInt();
    
            int i = 1;
            while (i <= 10) {
                System.out.println(number + " x " + i + " = " + (number * i));
                i++;
            }
    
            scanner.close();
        }
    
    }

