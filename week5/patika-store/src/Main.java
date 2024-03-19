/**
    @author Ahmet Batuhan YÜRÜDÜR
    @since March, 2024
 */

import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static void bracketEquals() {
        System.out.println("===================");
    }

    public static void outputSleeper() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Error occurred, rerun the program.");
        }
    }

    public static void main(String[] args) {

        BrandsListManager brandsListManager = new BrandsListManager();
        SmartPhoneManager smartPhoneManager = new SmartPhoneManager();
        LaptopManager laptopManager = new LaptopManager();
        System.out.println("Welcome to PathStore... How may we help you?");
        outputSleeper();
        bracketEquals();
        while (true) {
            System.out.println("I want to check:\n1- Notebook Operations\n2- Smartphone Operations\n3- List the brands\n4- Exit");
            bracketEquals();
            Scanner input = new Scanner(System.in);
            System.out.println("Choice:");
            byte userChoice = input.nextByte();
            switch (userChoice) {
                case 1:
                    bracketEquals();
                    boolean isSelect1 = false;
                    while (!isSelect1) {
                        System.out.println("1- List All:\n2- Add NoteBook\n3- Delete NoteBook\n4- Back to main menu. ");
                        System.out.println("Your Choice: ");
                        byte userChoiceSC1 = input.nextByte();
                        switch (userChoiceSC1) {
                            case 1:
                                laptopManager.laptopLister();
                                bracketEquals();
                                break;
                            case 2:
                                laptopManager.laptopAdd();
                                break;
                            case 3:
                                laptopManager.laptopDelete();
                                break;
                            case 4:
                                isSelect1 = true;
                        }
                    }
                    break;
                case 2:
                    bracketEquals();
                    boolean isSelect2 = false;
                    while (!isSelect2) {
                        System.out.println("1- List All:\n2- Add Smartphone\n3- Delete Smartphone\n4- Back to main menu. ");
                        System.out.println("Your Choice: ");
                        byte userChoiceSC2 = input.nextByte();
                        switch (userChoiceSC2) {
                            case 1:
                                smartPhoneManager.smartPhoneLister();
                                bracketEquals();
                                break;
                            case 2:
                                smartPhoneManager.smartPhoneAdd();
                                break;
                            case 3:
                                smartPhoneManager.smartPhoneDelete();
                                break;
                            case 4:
                                isSelect2 = true;
                        }
                    }
                    break;
                case 3:
                    brandsListManager.brandsList();
                    outputSleeper();
                    bracketEquals();
                    continue;
                case 4:
                    System.out.println("We'd like to see you again!");
                    System.out.println("Exiting the application...");
                    System.exit(0);
            }
        }
    }
}