/**
 * @author Ahmet Batuhan YÜRÜDÜR
 * @since 2024
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Importing Scanner class for inputs & determining variables;
        double sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        double number = input.nextDouble();

        // For loop to determine the dividends;
        for (int dividend = 1; dividend<number; dividend++){
            if ((dividend % 4 == 0) || (dividend % 3 == 0)){
                sum += dividend;
            }
        }


        // Output data of 3 & 4 dividends;
        System.out.println("Average of 3 & 4 dividends is: " + sum/number);
    }
}