/**
 * @author Ahmet Batuhan YÜRÜDÜR
 * @since 2024
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Zodiac Sign Finder!");
        System.out.println("Which day did you born? ");

        int day, month;

        Scanner input = new Scanner(System.in);
        day = input.nextInt();
        do {
            if (day > 31){
                System.out.println("No such day. Enter again.");
                day = input.nextInt();
            }else {
                break;
            }
        }while (true);
        System.out.println("Which month? ");
        month = input.nextInt();
        do {
            if (month > 12){
                System.out.println("No such month. Enter again.");
                month = input.nextInt();
            }else {
                break;
            }
        }while (true);

        if (((day >= 21) && (month == 1)) || ((day <= 19) && (month == 2))){
            System.out.println("You are an aquarius! (best one)");
        } else if (((day >= 20) && (month == 2)) || ((day <= 20) && (month == 3))) {
            System.out.println("You are a pisces.");
        } else if (((day >= 21) && (month == 3)) || ((day <= 20) && (month == 4))) {
            System.out.println("You are an aries.");
        } else if (((day >= 21) && (month == 4)) || ((day <= 21) && (month == 5))) {
            System.out.println("You are a taurus.");
        } else if (((day >= 22) && (month == 5)) || ((day <= 21) && (month == 6))) {
            System.out.println("You are a gemini.");
        } else if (((day >= 22) && (month == 6)) || ((day <= 22) && (month == 7))) {
            System.out.println("You are a cancer.");
        } else if (((day >= 23) && (month == 7)) || ((day <= 21) && (month == 8))) {
            System.out.println("You are a leo.");
        } else if (((day >= 22) && (month == 8)) || ((day <= 23) && (month == 9))) {
            System.out.println("You are a virgo");
        } else if (((day >= 24) && (month == 9)) || ((day <= 23) && (month == 10))) {
            System.out.println("You are a libra");
        } else if (((day >= 24) && (month == 10)) || ((day <= 22) && (month == 11))) {
            System.out.println("You are a scorpio");
        } else if (((day >= 23) && (month == 11)) || ((day <= 22) && (month == 12))) {
            System.out.println("You are a sagittarius");
        } else if (((day >= 23) && (month == 12)) || ((day <= 20) && (month == 1))) {
            System.out.println("You are a capricorn.");
        }else {
            System.out.println("You must be a martian.");
        }
    }
}