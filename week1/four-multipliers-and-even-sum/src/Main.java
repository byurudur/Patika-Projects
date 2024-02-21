/**
 * @author Ahmet Batuhan YÜRÜDÜR
 * @since 2024
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // This code sums up the even and 4-multiplier numbers until an odd number input.

        // Importing scanner class for inputs and determining the variables;
        Scanner input = new Scanner(System.in);
        int number;
        int sum = 0;

        do {
            System.out.println("Please enter a number: ");
            number = input.nextInt();
            if (number % 2 != 0){
                System.out.println("Program is ending...");
                break;
            } else if (number % 4 == 0) {
                sum += number;
            }
        }while (true);

        // Output of given even and 4-multiplier numbers.
        System.out.println(sum);
    }
}