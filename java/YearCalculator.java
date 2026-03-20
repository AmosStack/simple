// Calculates a past year by subtracting a fixed number of years.
public class YearCalculator {
    public static void main(String[] args) {

        // Predefined current year
        int currentYear = 2024; 

        // Years to go back
        int yearsAgo = 10;     

        int resultYear = currentYear - yearsAgo;

        System.out.println("The year 10 years ago was: " + resultYear);
    }
}