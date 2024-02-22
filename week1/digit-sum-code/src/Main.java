import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Variables determined;
        // Scanner class imported for inputs.
        Scanner scan = new Scanner(System.in);
        int sum = 0;

        System.out.println("Please enter a number: ");
        int number = scan.nextInt();

        while(number > 0) {
            sum += number % 10;
            number /= 10;
        }
        System.out.println("Sum is: " + sum);
    }
}