import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Detecting variables;
        Scanner input = new Scanner(System.in);
        int number, sum = 1;

        // Input data;
        System.out.print("Please enter number: ");
        number = input.nextInt();

        // Calculating codes;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        // Output data;
        if (sum == number) {
            System.out.print(number + " is a perfect number.");
        } else {
            System.out.print(number + " is not a perfect number.");
        }
    }
}