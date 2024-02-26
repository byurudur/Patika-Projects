import java.util.Scanner;

public class Main {
    public static void patternMaker(int number1){
        if (number1 < 0){
            System.out.println(number1 + "");
            return;
        }
        System.out.println(number1 + "");
        patternMaker(number1 - 5);
        System.out.println(number1 + "");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int userNumber = input.nextInt();
        patternMaker(userNumber);
    }
}