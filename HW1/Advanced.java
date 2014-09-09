package HW1;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * Author: Oleksandr Pylkevych o.pylkevych@gmail.com
 * Date: 9/1/14
 * Time: 12:09 PM
 * <p/>
 * Description:
 * - Multiply two matrices.
 * - Sort two-dimensional array (in ascending order).
 * - Print Fibonacci numbers (in a certain amount of a given variable).
 */
public class Advanced {
    public static void main(String[] args) {
        int[][] array2d = {
                {3, 2, 1},
                {4, 5, 3}
        };

        int[] array = array2dToArray(array2d);
        int[] arraySorted = sortAscArray(array);
        int[][]arraySorted2d = arrayToArray2d(arraySorted, array2d.length, array2d[0].length);
        System.out.println("Sorted 2D Array: ");
        for (int row = 0; row < arraySorted2d.length; row++) {
            for (int column = 0; column < arraySorted2d[row].length; column++) {
                System.out.print(arraySorted2d[row][column] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Fibonacci numbers:");
        fibonacci(10);
        System.out.println();
        System.out.println();
        multiplyMatrix();
    }

    private static int[] array2dToArray(int[][] array2d) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int row = 0; row < array2d.length; row++) {
            for (int column = 0; column < array2d[row].length; column++) {
                arrayList.add(array2d[row][column]);
            }
        }
        int[] ret = new int[arrayList.size()];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = arrayList.get(i).intValue();
        }
        return ret;
    }

    public static int[][] arrayToArray2d(int[] array, int rows, int columns) {
        if (array.length != (rows*columns))
            throw new IllegalArgumentException("Invalid array length");
        int[][] array2d = new int[rows][columns];
        for ( int i = 0; i < rows; i++ )
            System.arraycopy(array, (i*columns), array2d[i], 0, columns);
        return array2d;
    }

    private static int[] sortAscArray(int[] array) {
        boolean swapped = true;
        int temp;
        do {
            swapped = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
        return array;
    }

    private static void fibonacci(int n) {
        int[] fibonacci = new int[n];
        for (int i = 0; i < fibonacci.length; i++) {
            if (i < 2) {
                fibonacci[i] = 1;
            } else {
                fibonacci[i] = fibonacci[i - 2] + fibonacci[i - 1];
            }
            System.out.print(fibonacci[i] + " ");
        }
    }

    //algorithm from Wikipedia
    private static void multiplyMatrix() {
        int m = 3;
        int n = 4;
        int q = 5;
        int[][] A;
        A = new int[][]{
                {1, 2, 3, 4},
                {1, 2, 3, 4},
                {1, 2, 3, 4}};
        int[][] B;
        B = new int[][]{
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5}
        };
        int[][] C = new int[m][q];
        for (int r = 0; r < n; r++) {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < q; j++) {
                    C[i][j] += A[i][r] * B[r][j];
                }
            }
        }
        System.out.println("Product of matrices: ");
        for (int row = 0; row < C.length; row++) {
            for (int column = 0; column < C[row].length; column++) {
                System.out.print(C[row][column] + " ");
            }
            System.out.println();
        }
    }
}
