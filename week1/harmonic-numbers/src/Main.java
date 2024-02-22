import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Scanner for inputs
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the N number: ");
        double number;
        number  = input.nextDouble();
        double harmonic = 0.0;
        double result = 0.0;
        while ( number >0 ){

            harmonic += 1/number;
            number--;

        }
        System.out.println(harmonic);
    }
}