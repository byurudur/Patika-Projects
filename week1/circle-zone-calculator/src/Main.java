/**
 * @author Ahmet Batuhan YÜRÜDÜR
 * @since 2024
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Calculating a decided zone of a circle.

        // Determining the variables;
        double pi = 3.14, alpha, formula, radius;

        // Collecting input data;
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.println("Please enter the radius (r): ");
            radius = input.nextDouble();
            if (radius <= 0){
                System.out.println("No such circle.");
                continue;
            }
            System.out.println("Please enter the angle (a): ");
            alpha = input.nextDouble();
            if (alpha <= 0){
                System.out.println("No such angle. ");
                continue;
            }

            // Giving the output data.
            formula = ( (pi * (radius * radius) * alpha) / 360 );
            System.out.println("The area of the zone: " + formula);
            break;
        }
    }
}