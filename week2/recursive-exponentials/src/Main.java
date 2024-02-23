import java.util.Scanner;

public class Main {

    static double exponential(double base, double power) {
           double result;
//        for (int iterator = 1; iterator <= power; iterator++){
//            result *= base;
        if (power == 0){
            return 1;
        } else if (power < 0) {
            return (1 / base *  exponential(base, power+1));
        } else {
            result = base * exponential(base, (power-1));
            return result;
        }
    }

    public static void main(String[] args) {
        // Methods;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter base: ");
        int base = input.nextInt();
        System.out.println("Enter power: ");
        int power = input.nextInt();
        System.out.println("Result: " + exponential(base, power));
    }
}