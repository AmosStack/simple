// Uses recursion to compute factorial of a user-provided number.
import java.util.Scanner;


public class FactorialRecursionDemo {

    public static int factorial(int x){
        if (x == 0) {
            return 1;
            
        }
        else{
            return x * factorial(x-1);
        }

    }
    public static void main(String[] args) {
        Scanner v  = new Scanner(System.in);

        System.out.println("Enter a number");
        int x = v.nextInt();
        v.close();

        System.out.println("The factorial of " + x + " is " + factorial(x));
        
    }
}
