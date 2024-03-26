/**
 * @author Ahmet Batuhan YÜRÜDÜR
 * @since 2024
 */

import java.io.*;
import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);
    public static FileWriter fileWriter = null;

    public static void add() {

        try {
            fileWriter = new FileWriter("src/saveDoc.txt", true);
            System.out.println("If you want to quit, type 'exit sys'.");
            System.out.println("Write here: ");
            int counter = 0;
            String note = input.nextLine();

            while (true) {

                counter++;
                fileWriter.write(counter + " - " + note + "\n");

                if (note.equals("exit sys")) {
                    System.out.println("Exiting the system...");
                    System.out.println("Please check the document");
                    fileWriter.write("------------------------");
                    break;
                }
            }
        } catch (IOException e) {
            System.out.println("An error has been occurred while file is processing.");
        } finally {
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    System.out.println("Exiting ERR");
                    ;
                }
            }
        }
    }

    public static void read() {
        int row = 0;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("src/saveDoc.txt"))) {
            System.out.println("Your notes: ");
            boolean isLine = true;
            while (isLine) {
                row++;
                System.out.println("Line " + row + ": " + bufferedReader.readLine());
                if ((bufferedReader.read()) == -1) {
                    System.out.println("------------");
                    isLine = false;
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");;
        } catch (IOException e) {
            System.out.println("An error has been occurred while file is processing.");
        }

    }

    public static void main(String[] args) {
        System.out.println("1 - Take notes.");
        System.out.println("2 - Check notes.");
        System.out.println("Choice: ");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                add();
                break;
            case 2:
                read();
                break;
        }
    }
}