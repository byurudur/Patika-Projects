import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int lowNumber, highNumber, temp;
        Scanner input = new Scanner(System.in);
        System.out.println( "How many numbers will you enter?" );
        int count = input.nextInt();
        System.out.println("Please enter first number: ");
        int firstNumber = input.nextInt();
        lowNumber = firstNumber;
        highNumber = firstNumber;

        for (int i = 2; i < count ; i++){
            System.out.println("Please enter the " + i + "th number");
            temp = input.nextInt();
            if (temp > highNumber){
                highNumber = temp;
            }
            if (temp < lowNumber){
                lowNumber = temp;
            }
        }
        System.out.println("Lowest number is: " + lowNumber);
        System.out.println("Highest number is: " + highNumber);
    }
}