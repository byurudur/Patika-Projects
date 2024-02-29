import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word: :");
        String word = input.nextLine();

        if (isPalindrome(word)) {
            System.out.println("'" + word + "' is a palindrome.");
        } else {
            System.out.println("'" + word + "' is not a palindrome.");
        }
    }
    public static boolean isPalindrome(String word) {
        int length = word.length();
        for (int i = 0; i < length / 2; i++) {
            if (word.charAt(i) != word.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
