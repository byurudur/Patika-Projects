import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] myList = {15, 12, 788, 1, -1, -778, 2, 0, 50};
        int min = 0;
        int max = 0;


        System.out.println("Please enter a number: ");
        int userNumber = input.nextInt();

        System.out.println("List: " + Arrays.toString(myList)); // Outputting the list as a String.
        System.out.println("Given number: " + userNumber); // Given number data.
        System.out.println("------------"); // Bracket for a readable output.


        // Sorting the list from lowest to highest for an easier roam.
        Arrays.sort(myList);

        // Roaming the list, if iterator (i) is lower than given number, the minimum value is the iterator at that point.
        for (int iterator : myList) {
            if (iterator < userNumber) {
                min = iterator;
            }
            // If iterator (i) is higher than given number, the maximum value is the iterator, but a break; command to stop the code at that point.
            if (iterator > userNumber) {
                max = iterator;
                break;
            }
        }

        // Output data.
        System.out.println("The closest number that higher than " + userNumber + " is " + max);
        System.out.println("The closest number that lower than " + userNumber + " is " + min);

    }
}
