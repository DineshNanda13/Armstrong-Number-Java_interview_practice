package armstrong;

import java.util.Scanner;

/**
 *
 * @author Dinesh Nanda
 */
public class ArmstrongNumber {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = s.nextInt(); //153

        int temp = number;
        int sum = 0;

        while (number > 0) {
            int last = number % 10;
            sum = sum + (last * last * last);
            number = number / 10;
        }
        if (sum == temp) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
    }

}
