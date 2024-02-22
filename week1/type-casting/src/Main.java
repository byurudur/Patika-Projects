import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer value: ");
        int number = input.nextInt();

        double numberCastedDouble = number;
        float numberCastedFloat = number;
        long numberCastedLong = number;
        short numberCastedShort = (short) number;
        byte numberCastedByte = (byte) number;
        System.out.println("Your number as a Double: " + numberCastedDouble );
        System.out.println("Your number as a Float: " + numberCastedFloat );
        System.out.println("Your number as a Long: " + numberCastedLong );
        System.out.println("Your number as a Short: " + numberCastedShort );
        System.out.println("Your number as a Byte: " + numberCastedByte );
    }
}