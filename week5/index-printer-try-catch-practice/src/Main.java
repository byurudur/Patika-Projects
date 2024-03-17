/**
 * @author Ahmet Batuhan YÜRÜDÜR
 * @since 2024
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {


    // Method for eye comfort on the output;
    public static void bracketEquals() {
        System.out.println("==================");
    }

    public static void main(String[] args) {

        // A manually created single-dimensioned list;

        int[] list = new int[10];
        list[0] = 10;
        list[1] = 20;
        list[2] = 30;
        list[3] = 40;
        list[4] = 50;
        list[5] = 60;
        list[6] = 70;
        list[7] = 80;
        list[8] = 90;
        list[9] = 100;

        // Collecting data from the user;
        // do-while loop for continuous inputs;
        // try-catch blocks for exception handling;
        // Exiting mechanism has assigned on #99;

        System.out.println("To quit, type the number 99 (No item on index #99)");
        bracketEquals();
        int itemIndex = 0;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("I want to learn the item at the index of: ");

                try {
                    itemIndex = input.nextInt();
                    if (itemIndex == 99) {
                        bracketEquals();
                        System.out.println("Exiting...");
                        bracketEquals();
                        break;
                    } else {
                    System.out.println("The item at the index " + itemIndex + " is: " + list[itemIndex]);
                    System.out.println("Another?");
                    bracketEquals();
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Index " + itemIndex + " is out of bounds for a list length of 10.");
                    System.out.println("Try again.");
                    bracketEquals();
                } catch (InputMismatchException e){
                    System.out.println("Whoops!" + "Please enter an integer.");
                } catch (Exception e){
                    System.out.println("An error occurred: " + e.getMessage());
                    // Log codes.
                }
        } while (true);
    }
}