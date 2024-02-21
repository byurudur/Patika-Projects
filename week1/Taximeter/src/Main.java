/**
 * @author Ahmet Batuhan YÜRÜDÜR
 * @since 2024
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Taximeter program;
        // Fee per KM = $2,20
        // Minimum fee = $20
        // Opening fee = $10

        // Creating variables;
        double distance, finalFee;


        while (true) {

            // Collecting input data;
            Scanner input = new Scanner(System.in);
            System.out.println("Please enter your distance in KM: ");
            distance = input.nextDouble();
            finalFee = distance * 2.20;

            // Cleaning mathematical errors and arranging code requirements.
            if (distance <= 0){
                System.out.println("Get outta my cab");
                break;
            } else if (distance > 0 && distance < 4.5454545455) {
                System.out.println("Fee: " + "$"+20);
                break;
            }else if (distance >= 4.5454545455){
                finalFee += 10;
            }

            // Giving output data;
            System.out.println("Fee: $" + finalFee);
            break;
        }
    }
}