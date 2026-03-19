import java.util.Scanner;

public class NumberGuesingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int winningNumber = 1000;
        int attempts = 0;
        int maxAttempts = 3;

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            int guess = sc.nextInt();
            attempts++;

            if (guess == winningNumber) {
                System.out.println("Won");
                break;
            } else {
                if (attempts < maxAttempts) {
                    System.out.println("Wrong..! Try again");
                } else {
                    System.out.println("Wrong..! Times up");
                }
            }
        }

        sc.close();
    }
}