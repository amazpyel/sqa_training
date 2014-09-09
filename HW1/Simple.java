package HW1;

/**
 * Created with IntelliJ IDEA.
 * Author: Oleksandr Pylkevych o.pylkevych@gmail.com
 * Date: 9/1/14
 * Time: 10:58 AM
 * <p/>
 * Description:
 * - Find the average of the one-dimensional array consisting of the numbers
 * - Find the sum of the elements in a two dimensional array
 * - Find the average of a two-dimensional array
 * - The maximum and minimum value in the one-dimensional array, and swap them
 * - Find the maximum and minimum values ​​in a two-dimensional array, and swap them.
 */
public class Simple {
    public static void main(String[] args) {

        int[] array = {1, 2, 1, 5, 5, 2};
        int[][] array2d = {
                {1, 2, 3, 4},
                {1, 2, 3},
                {1, 2, 100}
        };

        printArray(array);
        System.out.println();
        printArray(array2d);
        double avg = getAvgInArray(array);
        System.out.println("Average value in array is " + avg);

        double avg2d = getAvgInArray(array2d);
        System.out.println("Average value in 2d array is " + avg2d);
        System.out.println("Sum of all elements in 2d array is " + getSumArray2d(array2d) + "\n");

        int arrayResult[] = maxMinSwapArray(array);
        System.out.print("After swap ");
        printArray(arrayResult);
        System.out.println("\n");
        int array2dResult[][] = maxMinSwapArray(array2d);
        System.out.print("After swap ");
        printArray(array2dResult);
    }

    public static double getAvgInArray(int[] values) {
        double sum = 0.0;

        for (double i : values) {
            sum += i;
        }
        return sum / values.length;
    }

    public static double getAvgInArray(int array2d[][]) {
        int sum = 0;
        int count = 0;
        for (int row = 0; row < array2d.length; row++) {
            for (int column = 0; column < array2d[row].length; column++) {
                sum += array2d[row][column];
                count++;
            }
        }
        return sum / count;
    }

    public static int getSumArray2d(int array2d[][]) {
        int sum = 0;
        for (int row = 0; row < array2d.length; row++)
            for (int column = 0; column < array2d[row].length; column++)
                sum += array2d[row][column];
        return sum;
    }

    public static int[] maxMinSwapArray(int array[]) {
        int temp;
        int minIndex = 0;
        int maxIndex = 0;
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }

        }
        temp = array[minIndex];
        array[minIndex] = array[maxIndex];
        array[maxIndex] = temp;
        System.out.println("Min value in array is " + min + "[index:" + minIndex + "]");
        System.out.println("Max value in array is " + max + "[index:" + maxIndex + "]");
        return array;
    }

    public static int[][] maxMinSwapArray(int array2d[][]) {
        int temp;
        int minIndexColumn = 0;
        int minIndexRow = 0;
        int maxIndexColumn = 0;
        int maxIndexRow = 0;
        int min = array2d[0][0];
        int max = array2d[0][0];
        for (int row = 0; row < array2d.length; row++) {
            for (int column = 0; column < array2d[row].length; column++) {
                if (array2d[row][column] < min) {
                    min = array2d[row][column];
                    minIndexColumn = column;
                    minIndexRow = row;

                }
                if (array2d[row][column] > max) {
                    max = array2d[row][column];
                    maxIndexColumn = column;
                    maxIndexRow = row;
                }
            }
        }
        temp = array2d[minIndexRow][minIndexColumn];
        array2d[minIndexRow][minIndexColumn] = array2d[maxIndexRow][maxIndexColumn];
        array2d[maxIndexRow][maxIndexColumn] = temp;
        System.out.println("Min value in array is " + min + "[" + minIndexRow + "][" + minIndexColumn + "]");
        System.out.println("Max value in array is " + max + "[" + maxIndexRow + "][" + maxIndexColumn + "]");
        return array2d;
    }

    public static void printArray(int array2d[][]) {
        System.out.println("2D Array: ");
        for (int row = 0; row < array2d.length; row++) {
            for (int column = 0; column < array2d[row].length; column++) {
                System.out.print(array2d[row][column] + " ");
            }
            System.out.println();
        }
    }

    public static void printArray(int array[]) {
        System.out.println("Array: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
