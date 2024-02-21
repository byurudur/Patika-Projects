/**

 * @author Ahmet Batuhan Yürüdür, byurudur
 * @since 2024,

 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // This code determines the multiplier numbers of the given number.

        Scanner input = new Scanner(System.in);

        System.out.println("Please type the number you want to split to it's multipliers. ");

        // number is the data that the code takes from user.
        int number = input.nextInt();
        if (number < 2){
            System.out.println("Please insert a number that has a bigger value than 1");
        }

        // Assume the given number is already a prime number.
        boolean isPrime = true;

        // The number is not prime if it can be divided by numberDivider to itself without a remainder.
        // Changing the value of our assume.
        for (int numberDivider = 2; numberDivider < number; numberDivider++) {
            if(number % numberDivider == 0){
                isPrime = false;

                // Output information of dividers.
                System.out.println(number + " can be divided by " + numberDivider+".");
            }
        }
        // Output codes.
        if (isPrime){
            System.out.println(number + " is a prime number.");
        }else{
            System.out.println(number + " is not a prime number.");
        }
    }
}