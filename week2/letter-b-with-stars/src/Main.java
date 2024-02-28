public class Main {
    public static void main(String[] args) {

        String[][] letterB = new String[7][4];


        for (int i = 0; i < letterB.length; i++) {
            for (int j = 0; j < letterB[i].length; j++) {
                if (i == 0 || i == 3 || i == 6) {
                    letterB[i][j] = " * ";
                } else if (j == 0 || j == 3) {
                    letterB[i][j] = " * ";
                } else {
                    letterB[i][j] = "   ";
                }
            }
        }

        for (String[] row : letterB) {
            for (String column : row) {
                System.out.print(column);
            }
            System.out.println();
        }
    }
}