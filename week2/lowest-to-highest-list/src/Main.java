import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("Please enter the array size: ");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] userList = new int[size];
        int[] codeList = new int[userList.length];
        int startingIndex = 0;
        System.out.println("Please enter the array elements below: ");

        for (int i = 1; i <= userList.length; i++) {
            System.out.println("Element #" + i +  ":");
            int element = input.nextInt();
                codeList[startingIndex++] = element;
        }

        System.out.println("Here is your list arranged by lowest to highest: ");
        Arrays.sort(codeList);
        System.out.println(Arrays.toString(codeList));
    }
}