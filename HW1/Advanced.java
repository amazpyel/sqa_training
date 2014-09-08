import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: pylkevych
 * Date: 9/1/14
 * Time: 12:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class Advanced {
    public static void main(String[] args) {
        Advanced advanced = new Advanced();
        int[][] array2d = {
                {3, 2, 1},
                {4, 5, 3}
        };

        int[] array = advanced.array2dToArray(array2d);
        System.out.println();
        int[] arraySorted = advanced.sortAscArray(array);
        System.out.println();
        System.out.println();
        System.out.println("Fibonacci numbers:");
        advanced.fibonacci(10);
        System.out.println();
        System.out.println();
        advanced.multiplyMatrix();
    }

    private int[] array2dToArray(int[][] array2d) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int row = 0; row < array2d.length; row++) {
            for (int column = 0; column < array2d[row].length; column++) {
                arrayList.add(array2d[row][column]);
            }
        }
        int[] ret = new int[arrayList.size()];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = arrayList.get(i).intValue();
            System.out.print(ret[i] + " ");
        }
        return ret;
    }

    //TODO: finish method
    public int[][] arrayToArray2d(int[] arrayList, int row, int column) {
        int[][] array2d = new int[row][column];
        return array2d;
    }

    private int[] sortAscArray(int[] array) {
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
        System.out.println("Sorted array:");
        for (int h = 0; h < array.length; h++) {
            System.out.print(array[h] + " ");
        }
        return array;
    }

    private void fibonacci(int n) {
        int[] fibonacci = new int[n];
        for (int i = 0; i < fibonacci.length; i++) {
            if(i < 2) {
                fibonacci[i] = 1;
            }
            else {
                fibonacci[i] = fibonacci[i - 2] + fibonacci[i - 1];
            }
            System.out.print(fibonacci[i] + " ");
        }
    }

    private void multiplyMatrix() {
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

        for(int r = 0; r < n; r++) {
            for(int i = 0; i < m; i++) {
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
