import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int i, k, number, j, l, m;
        System.out.println("Sayi giriniz");
        number = input.nextInt();

        // Upper diamond;

        for (i = 1; i <= number; i++)
        {
            for (k = number; k > i; k--)
            {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++)
            {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

        // Lower diamond;

        for (k = 1; k <= number; k++) {
            for (l = 1; l <= k; l++)
            {
                System.out.print(" ");
            }
            for (m = number; m > k; m--)
                System.out.print("*" + " ");
            }
            System.out.println();
        }

    }
}