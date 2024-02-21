import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Detecting variables
        Scanner input = new Scanner(System.in);
        int number, power, sum = 1 ;

        // Scanner method for inputs
        System.out.print("Please enter a number: ");
        number = input.nextInt();
        System.out.print("Please enter the power: ");
        power = input.nextInt();

        // Calculating codes
        for(int i=1; i<=power; i++){
            sum *=number;
        }
        System.out.print("Result: "+sum);
    }
}