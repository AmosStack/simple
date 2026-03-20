// Fills and prints a 2D array with incremental numbers.
public class TwoDimensionalArrayDemo {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 2;

        int[][] array = new int[rows][cols];

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                array[i][j] = i * cols + j + 1;

                System.out.print(array[i][j] + " ");

            }
            System.out.println();
        }
        //accessing element at certain index
        System.out.println(array[1][1]);
    }
}
