import java.util.Scanner;

public class Main {
    static int summation(){
        Scanner input = new Scanner((System.in));
        System.out.println("Keep entering the numbers you want to sum, to exit type '0': ");
        int result = 0;
        while (true){
            int counter = input.nextInt();
            result += counter;
            if (counter == 0){
                System.out.println("Exiting...");
                break;
            }
            System.out.println("TOTAL :" + result);
        }
        return result;
    }

    static int extraction(){
        Scanner input = new Scanner(System.in);
        int number1, number2, result, option;

            System.out.println("Enter the high number: " );
            number1 = input.nextInt();
            System.out.println("Enter the low number: ");
            number2 = input.nextInt();
            result = number1 - number2;
            System.out.println("Result: " + result);
            do {
                System.out.println("Again?\n 1-YES\n 2-NO\n");
                option = input.nextInt();
                if (option == 1){
                    System.out.println("Enter the high number: " );
                    number1 = input.nextInt();
                    System.out.println("Enter the low number: ");
                    number2 = input.nextInt();
                    result = number1 - number2;
                    System.out.println("Result: " + result);
                }else {
                    System.out.println("Exiting...");
                    break;
                }
            }while (option == 1);

            return result;
    }
    static int division(){

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the dividend: ");
        int dividend = input.nextInt();
        System.out.println("Please enter the divider: ");
        int divider = input.nextInt();
        int result = dividend/divider;
        System.out.println(dividend + "/" + divider + " = " +result);

        do {
            System.out.println("Again?\n 1-YES\n 2-NO\n");
            int option = input.nextInt();
                if (option == 1){
                    System.out.println("Please enter the dividend: ");
                    int dividend2 = input.nextInt();
                    System.out.println("Please enter the divider: ");
                    int divider2 = input.nextInt();
                    int result2 = dividend2/divider2;
                    System.out.println(dividend2 + "/" + divider2 + " = " +result2);
                }else {
                    System.out.println("Exiting...");
                    break;
                }
        }while(true);

        return result;
    }


    static int multiplication(){

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the multiplier 1: ");
        int multiplier1 = input.nextInt();
        System.out.println("Please enter the multiplier 2: ");
        int multiplier2 = input.nextInt();
        int result = multiplier1 * multiplier2;
        System.out.println(multiplier1 + " X " + multiplier2 + " = " +result);

        do {
            System.out.println("Again?\n 1-YES\n 2-NO\n");
            int option = input.nextInt();
            if (option == 1){
                System.out.println("Please enter the multiplier 1: ");
                int multiplier11 = input.nextInt();
                System.out.println("Please enter the multiplier 2: ");
                int multiplier22 = input.nextInt();
                int result2 = multiplier11 * multiplier22;
                System.out.println(multiplier11 + " X " + multiplier22 + " = " +result2);
            }else {
                System.out.println("Exiting...");
                break;
            }
        }while(true);

        return result;
    }
    static int mod(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int number = input.nextInt();
        System.out.println("Please enter the modder 2: ");
        int modder = input.nextInt();
        int result = number % modder;
        System.out.println("The remainder of " + number + " divided by " + modder + " is " + result);
        do {
            System.out.println("Again?\n 1-YES\n 2-NO\n");
            int option = input.nextInt();
            if (option == 1){
                System.out.println("Please enter the number: ");
                number = input.nextInt();
                System.out.println("Please enter the modder 2: ");
                modder = input.nextInt();
                result = number % modder;
                System.out.println("The remainder of " + number + " divided by " + modder + " is " + result);
            }else {
                System.out.println("Exiting...");
                break;
            }
        }while(true);

        return result;
    }

    static int rectangle(){

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the rectangle short sideline: ");
        int sideLine1 = input.nextInt();
        System.out.println("Please enter the long sideline: ");
        int sideLine2 = input.nextInt();
        int result = sideLine2 * sideLine1;
        System.out.println("Area of the rectangle is: " + result);
        System.out.println("Sum of sideline of the rectangle is: " + ((sideLine2*2) + (sideLine1*2) ));
        do {
            System.out.println("Again?\n 1-YES\n 2-NO\n");
            int option = input.nextInt();
            if (option == 1){
                System.out.println("Please enter the rectangle short sideline: ");
                sideLine1 = input.nextInt();
                System.out.println("Please enter the long sideline: ");
                sideLine2 = input.nextInt();
                result = sideLine2 * sideLine1;
                System.out.println("Area of the rectangle is: " + result +
                        "Sum of sideline of the rectangle is: " + ((sideLine2*2) + (sideLine1*2) ));
            }else {
                System.out.println("Exiting...");
                break;
            }
        }while (true);

        return result;
    }
    public static void main(String[] args) {
        // Methods;
        System.out.println("Welcome to the 'CalcuLaidor 2024.exe'");
        System.out.println("--------------------------------------");
        System.out.println(     "1- Summation\n" +
                                "2- Extraction\n" +
                                "3- Division\n" +
                                "4- Multiplication\n" +
                                "5- Take Mod\n" +
                                "6- Rectangle Calculations\n" +
                                "0- EXIT\n ");
        System.out.println("Please enter your decision: ");
        Scanner input = new Scanner(System.in);
        int decision = input.nextInt();

        switch (decision){
            case 1:
                System.out.println(summation());
                break;
            case 2:
                extraction();
                break;
            case 3:
                division();
                break;
            case 4:
                multiplication();
                break;
            case 5:
                mod();
                break;
            case 6:
                rectangle();
                break;
            case 0:
                System.out.println("Exiting...");
                break;
        }
    }
}