import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: pylkevych
 * Date: 9/1/14
 * Time: 12:08 PM
 * To change this template use File | Settings | File Templates.
 */
public class Intermediate {
    public static void main(String[] args) {
        Intermediate intermediate = new Intermediate();
        intermediate.sumDigits();
        intermediate.countLuckyTickets();
    }

    private void countLuckyTickets() {
    }

    private void sumDigits() {
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
