import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Input data and variables;
        Scanner value = new Scanner(System.in);
        int elementValue, valueStack, firstValue = 0, secondValue = 1;
        System.out.println("Fibonacci Calculator");
        System.out.print("Enter element value: ");
        elementValue = value.nextInt();

        // Calculate fibonacci numbers
        for (int fbCal = 0; fbCal <= elementValue; fbCal++) {
            System.out.print(firstValue + " ");
            valueStack = firstValue + secondValue;
            firstValue = secondValue;
            secondValue = valueStack;
        }
    }
}