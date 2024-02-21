/**
 * @author Ahmet Batuhan YÜRÜDÜR
 * @since 2024
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Leap year finder.

        // Determining variables;
        int mod, year, modNegative;

        // Scanner to achieve inputs;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year: ");
        year = input.nextInt();
        mod = year % 4;
        modNegative = year % 400;


        // While loop to find the leap year.
        while (year > 0 ) {
            if (mod == 0) {
                System.out.println(year + " is a leap year.");
                break;
            } else if (mod != 0) {
                System.out.println(year + " is not a leap year.");
                break;
            }
        }
        while (year < 0) {
            if (modNegative == 0) {
                System.out.println(year + " is a leap year.");
                break;
            } else if (modNegative != 0) {
                System.out.println(year + " is not a leap year.");
                break;
            }
        }
    }
}