/**
 * @author Ahmet Batuhan YÜRÜDÜR
 * 2024
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Code for inputs.
        Scanner input = new Scanner(System.in);

        // Determining the variables and types.
        double answer, number1, number2;
        int choice;

        // Explain the code and collect inputs.
        System.out.println("Welcome to the calculator.");
        System.out.println("__________________________");
        System.out.println("Instructions; "  );
        System.out.println("__________________________");
        System.out.println("Enter first number. ");
        number1 = input.nextInt();
        System.out.println("Enter second number. ");
        number2 = input.nextInt();
        // We can apply a try-catch method here to determine if they are real numbers, later.
        //--------------------------------------------
        System.out.println("To sum: type 1");
        System.out.println("To extract: type 2");
        System.out.println("To divide: type 3");
        System.out.println("To multiplation: type 4");
        choice = input.nextInt();

        // Switch - Case block for answer.
        switch (choice){
            case 1:
                choice = 1;
                System.out.println("Your answer is " + (number1 + number2));
                break;
            case 2:
                choice = 2;
                System.out.println("Your answer is " + (number1 - number2));
                break;
            case 3:
                choice = 3;
                if (number2 != 0 && number1 != 0){
                    System.out.println("Your answer is " + (number1 / number2));
                }else if ( number1 != 0 && number2 == 0){
                    System.out.println("That's undefined.");
                }else {
                    System.out.println("That's uncertain.");
                }break;
            case 4:
                choice = 4;
                System.out.println("Your answer is " + (number1 * number2));
                break;
        }
    }
}