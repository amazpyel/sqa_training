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
}
