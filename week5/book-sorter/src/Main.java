import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<>();
        TreeSet<Book> books2 = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        books.add(new Book(112, "Vatan Yahut Silistre", "Namık Kemal"));
        books.add(new Book(300, "Eylül", "Mehmet Rauf"));
        books.add(new Book(256, "Ateşten Gömlek", "Halide Edib Adıvar"));
        books.add(new Book(548, "Ince Memed", "Yaşar Kemal"));
        books.add(new Book(192, "Türkçülüğün Esasları", "Ziya Gökalp"));

        books2.add(new Book(112, "Vatan Yahut Silistre", "Namık Kemal"));
        books2.add(new Book(300, "Eylül", "Mehmet Rauf"));
        books2.add(new Book(256, "Ateşten Gömlek", "Halide Edib Adıvar"));
        books2.add(new Book(548, "Ince Memed", "Yaşar Kemal"));
        books2.add(new Book(192, "Türkçülüğün Esasları", "Ziya Gökalp"));


        System.out.println("I want to see the books sorted by:\n" + " 1- Alphabetically: \n" + " 2- Numerically: \n" + " 3- I want to quit: \n");
        System.out.println("Your choice: ");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Books sorted alphabetically (A - Z): ");
                for (Book B2 : books2) {
                    System.out.println(B2);
                }
                break;
            case 2:
                Collections.sort(books);
                System.out.println("Books sorted by page number (Lower to higher): ");

                for (Book B : books) {
                    System.out.println(B);
                }
                break;
            case 3:
                System.out.println("Exiting...");
                System.exit(0);
            default:
                System.out.println("An error occurred. Please rerun.");
        }
    }
}