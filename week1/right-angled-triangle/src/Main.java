/**
 * @author Ahmet Batuhan YÜRÜDÜR
 * @since 2024
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double  longRim, shortRim, thirdRim, area, perimeter, helper;



        while (true){

            // Collecting inputs;
            System.out.println("Please enter the first rim: ");
            shortRim = input.nextDouble();
            System.out.println("Please enter the second rim: ");
            longRim = input.nextDouble();
            System.out.println("Please enter the third rim: ");
            thirdRim = input.nextDouble();

            // Clearing the mathematical errors;
            if (shortRim <= 0 || longRim <= 0 || thirdRim <= 0) {

                System.out.println("Mathematical error, rims can not be negative.");

            } else {

                // Equations of area and perimeter;
                perimeter = (longRim + shortRim + thirdRim);
                System.out.println("Perimeter: " + perimeter);
                helper = perimeter/2;
                area = Math.sqrt(helper * (helper-shortRim) * (helper - longRim) * (helper * thirdRim));
                System.out.println("Area: " + area);

                break;

            }
        }
    }
}