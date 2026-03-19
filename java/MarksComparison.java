import java.util.Scanner;

public class MarksComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter mark 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter mark 2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter mark 3: ");
        int m3 = sc.nextInt();

        int highest = m1;
        int lowest = m1;

        if (m2 > highest) highest = m2;
        if (m3 > highest) highest = m3;

        if (m2 < lowest) lowest = m2;
        if (m3 < lowest) lowest = m3;

        System.out.println("Highest mark: " + highest);
        System.out.println("Lowest mark: " + lowest);

        sc.close();
    }
}