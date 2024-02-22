import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Determining variables;
        int hcf = 1, lcm, count = 1, valueFs, valueSc;

        // Taking inputs;
        System.out.print("Enter the first number: ");
        valueFs = input.nextInt();

        System.out.print("Enter the second number: ");
        valueSc = input.nextInt();

        // Calculating area;
        while (true) {
            if (valueFs % count == 0 && valueSc % count == 0) {
                hcf = count;
            }
            if (count == valueFs || count == valueSc) {
                break;
            }
            count++;
        }
        lcm = (valueFs * valueSc) / hcf;

        // Outputs;
        System.out.println("Highest common factor: " + hcf);
        System.out.println("Lowest common multiple: " + lcm);
    }
}