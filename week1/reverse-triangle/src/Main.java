import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Detecting variables;
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Please enter place value: ");
        n = input.nextInt();

        // Output data and calculating codes;
        for(int i=n; i>=1;i--){
            for(int j=1; j<=2*i-1;j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}