public class Main {
    public static void main(String[] args) {

        int counter = 0;
        for(int value=2; value<=100; value++) {
            int check = 0;
            for (int i = 2; i < value; i++) {
                if (value % i == 0) {
                    check = 1;
                    break;
                }
            }

            if (check == 0) {
                System.out.print(value + " ");
                counter++;
            }
        }
    }
}