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
    }

    public void sumDigits() {
        Scanner userInput = new Scanner( System.in );
        System.out.print("Please enter a number: ");
        int number = userInput.nextInt();
        System.out.println("You entered " + number);
    }
}
