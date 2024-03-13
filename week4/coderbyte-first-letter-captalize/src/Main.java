import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String[] words = word.split(" ");
        String addTogether = "";

        for (String trying : words) {
            if (!trying.isEmpty()) {
                char firstLetter = Character.toUpperCase(trying.charAt(0));
                addTogether += firstLetter + trying.substring(1) + " ";
            }
        }

        addTogether = addTogether.trim();
        System.out.println(addTogether);

    }
}