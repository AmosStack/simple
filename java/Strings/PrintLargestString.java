/*
*Write a Java program to find and print the largest string from a given array of strings based on dictionary order. 
Given the array {"apple", "mango", "banana"}, 
*the program should output the string that comes last in dictionary order.
*
 *    For a given set of Strings, Print the largest String.
 *    array => "apple", "mango", "banana". 
 */

public class PrintLargestString {
    public static void main(String[] args) {
        String strs[] = {"apple", "mangoes", "banana"};
        String largeString = strs[0];
        for (int i = 1; i < strs.length; i++) {
            if (largeString.compareTo(strs[i]) < 0) {
                largeString = strs[i];
            }
        }
        System.out.println("Largest String : "+ largeString);
    }
}

/*
 *   Output:
 *   Largest String : mango
 */