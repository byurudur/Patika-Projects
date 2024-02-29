import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("Fortune teller skills? Let's see. ");
        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        int guess, pick, choice;
        pick = rand.nextInt(1, 101);
        System.out.println("What is your guess?");
        guess = input.nextInt();

        while (true) {

            if (guess == pick) {
                System.out.println("FINALLY! YESSSSS");
            } else if (guess <= 0 || guess > 100){
                System.out.println("It is between 0 and 100. Try again: ");
                guess = input.nextInt();
            }else {
                System.out.println("Try again:");
                guess = input.nextInt();
            }
        }
    }
}