// Reads commodity details and prints a one-line summary.
import java.util.Scanner;

public class CommodityInputSummary {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Commodity");
        String s = scanner.nextLine();

        System.out.println("quantity");
        int x = scanner.nextInt();

        System.out.println("price");
        double y = scanner.nextDouble();

        scanner.close();
         
        System.out.println("your commodity: " + s +" quantity: " + x +" price: " + y);

    }
}