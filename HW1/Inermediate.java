package HW1;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Author: Oleksandr Pylkevych o.pylkevych@gmail.com
 * Date: 9/1/14
 * Time: 12:08 PM
 * <p/>
 * Description:
 * - How many lucky tickets in the tickets package with numbers
 * from 000001 till 999999 where the number is six decimal digits,
 * and lucky is when the sum of the first three digits is equal to
 * the sum of the last three digits?
 * <p/>
 * - User inputs natural number. Calculate sum of digits.
 */
public class Intermediate {
    public static void main(String[] args) {
        sumDigits();
        System.out.println();
        countLuckyTickets();
    }

    private static void countLuckyTickets() {
        int count = 0;
        for (int i = 1; i <= 999999; i++) {
            int left = i / 100000 + i % 100000 / 10000 + i % 10000 / 1000;
            int right = i % 1000 / 100 + i % 100 / 10 + i % 10;
            if (left == right) {
                count++;
            }
        }
        System.out.println("Quantity of lucky tickets is " + count);
    }

    private static void sumDigits() {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        String number = userInput.next();
        System.out.println("You entered " + number);
        int sumDigits = 0;
        int[] numberArray = new int[number.length()];
        for (int i = 0; i < number.length(); i++) {
            numberArray[i] = number.charAt(i) - '0';
            sumDigits += numberArray[i];
        }
        System.out.println();
        System.out.println("Sum of digits is " + sumDigits);
    }
}
