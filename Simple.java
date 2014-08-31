/**
 * Created by alex on 29.08.2014.
 */
public class Simple {
    public static void main(String[] args) {
        Simple simple = new Simple();

        double[] valDoubles = {1.0, 2.0, 1.1, 5.6, 5.0, 2.3};
        double avg = simple.getAvgInArray(valDoubles);
        System.out.println("Average value in array is " + avg);

        int[][] valInts = {
                {1, 2, 3},
                {0, 0, 0},
                {0, 2, 0}
        };
        double[][] array2d = {
                {1, 2, 3, 4},
                {1, 2, 3},
                {1, 2, 3}
        };

        double avg2d = simple.getAvgInArray(array2d);
        System.out.println("Average value in 2d array is " + avg2d);
        System.out.println("Sum of all elements in 2d array is " + simple.getSumArray2d(valInts));
        simple.printArray(valInts);
        int a[] = {1,2,3};
        simple.maxMinSwapArray(a);
        System.out.println();
        simple.printArray(a);
    }

    public double getAvgInArray(double[] values) {
        double sum = 0.0;

        for (double i : values) {
            sum += i;
        }
        return sum / values.length;
    }

    public double getAvgInArray(double array2d[][]) {
        int sum = 0;
        int count = 0;
        for(int row = 0 ; row < array2d.length; row++) {
            for (int column = 0; column < array2d[row].length; column++) {
                sum += array2d[row][column];
                count++;
            }
        }
        return sum / count;
    }

    public int getSumArray2d(int array2d[][]) {
        int sum = 0;
        for(int row = 0 ; row < array2d.length; row++)
            for(int column = 0; column < array2d[row].length; column++)
                sum += array2d[row][column];
        return sum;
    }

    public void maxMinSwapArray(int array[]) {
        int temp = 0;
        int max = 0;
        int min = 0;
        for(int i = 0; i < array.length; i++) {
            if (array[i] < array[i + 1]) {
                min = array[i];
            }
        }
        System.out.println("Min value in array is " + min);
    }

    public void maxMinSwapArray(int array2d[][]) {

    }

    public void printArray(int array2d[][]) {
        System.out.println("2D Array: ");
        for(int row = 0 ; row < array2d.length; row++)
            for(int column = 0; column < array2d[row].length; column++)
                System.out.print(array2d[row][column] + " ");
    }

    public void printArray(int array[]) {
        System.out.println("Array: ");
        for(int i : array) {
            System.out.print(i + " ");
        }
    }
}
