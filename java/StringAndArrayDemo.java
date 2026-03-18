// Demonstrates basic String operations and array traversal.
public class StringAndArrayDemo {
    public static void main(String[] args){
        String ism = "hello class";

        int length = ism.length();
        char x = ism.charAt(8);
        int index = ism.indexOf('o');

        int[] arry = {1,2,3,4,5,6,7};

        //accessing our array

        for (int i = 0; i < arry.length; i++) {
            
            System.out.println(arry[i]);
            
        }

        int len = arry.length;
        int secElement = arry[1];

        System.out.println("index of char \'o\' is: " + index);
        System.out.println("String length is: " + length);
        System.out.println("Character at index 8 : " + x);

        System.out.println("Array length is: " + len);
        System.out.println("Second element is: " + secElement);


    }
}
