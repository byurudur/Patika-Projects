import java.util.Scanner;

public class Main {
    public static boolean isPrime(int num, int divisor) {
        if (num <= 2) {
            return (num == 2) ? true : false;
        }
        else if (num % divisor == 0) {
            return false;
        }
        else if (divisor * divisor > num) {
            return true;
        }
        return isPrime(num, divisor + 1);
    }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter a number: ");
            int number = scanner.nextInt();

            if (isPrime(number, 2)){
                System.out.println(number + " is a prime number.");}
            else {
                System.out.println(number + " is NOT a prime number.");
                scanner.close();
            }
    }
}


