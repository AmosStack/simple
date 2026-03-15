// Converts a decimal number to base-3 and returns a 5-digit padded result.
public class Base3PaddedConverter {

    public static String processNumber(int number) {
        StringBuilder remainders = new StringBuilder();

        while (number > 0) {
            int remainder = number % 3;
            remainders.append(remainder);
            number /= 3;
        }

        // Reverse to start with the last remainder obtained (LCB)
        remainders.reverse();

        // Pad with leading zeros to make exactly 5 digits
        while (remainders.length() < 5) {
            remainders.insert(0, "0");
        }

        // Ensure final result is exactly 5 digits
        if (remainders.length() > 5) {
            remainders = new StringBuilder(remainders.substring(remainders.length() - 5));
        }

        return remainders.toString();
    }

    // Optional test main method
    public static void main(String[] args) {
        System.out.println(processNumber(10)); // Example
    }
}
