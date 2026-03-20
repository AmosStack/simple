// Reads and prints basic user profile details.
import java.util.Scanner;

public class UserProfileInput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Enter your salary: ");
        double salary = scanner.nextDouble();

        scanner.close();

        System.out.println("your name is: "+ name + " your age is: " + age +" your salary is: " + salary);
    }
    
}
