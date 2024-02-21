/**
 * @author Ahmet Batuhan YÜRÜDÜR
 * @since 2024
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Powers of four and five until the given number;
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number; ");
        number = input.nextInt();
        int need1 = 4, need2 = 5, counter1 = 1, counter2 = 1;

        while (need1 < number){
            need1 = need1 *4;
            counter1++;
            if (need1 > number){
                break;
            }
            System.out.println(counter1 + "." + " power of 4 are: " + need1);
        }
        while (need2 < number){
            need2 = need2 *5;
            if (need2 > number){
                break;
            }
            counter2++;
            System.out.println(counter2 + "." + " power of 5 are: " + need2);
        }
    }
}