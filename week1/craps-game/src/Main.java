/**
 * @author Ahmet Batuhan YÜRÜDÜR, byurudur
 * 2024
 */

import  java.util.Scanner;
import java.util.Random;
public class Main { public static void main(String[] args) {

        //Explaining the craps game to the user.

        System.out.println("Craps is a type of dice game. It is played with two dice. " +
                "The dice are rolled and you win or lose depending on the outcome.\n" +
                "A sum of 7 directly loses the bet.\n");

        System.out.println("To win, you must roll 6-6, 5-5, or 3-3. " +
                "The losing dice are 4-4, 2-2, 1-1. " +
                "Good luck!");

        //Creating a random for dices.


            Random rand = new Random();
        // Determining the computer's dice.
            int rand_dice1 = rand.nextInt(6)+1;
            int rand_dice2 = rand.nextInt(6)+1;
            int rand_dice3 = rand.nextInt(6)+1;
            int rand_dice4 = rand.nextInt(6)+1;


        //Output the dice and win-lose information with if blocks.
        System.out.println("The computer's dices are " + rand_dice1 + " - " + rand_dice2);
        System.out.println("Your dices are " + rand_dice3 + " - " + rand_dice4);

        //Arranging the conditionals due to craps rule.
        if(     rand_dice1 == 3 && rand_dice2 == 3
                || rand_dice1 == 5 && rand_dice2 == 5
                || rand_dice1 == 6 && rand_dice2 == 6){
            System.out.println("Computer wins the bet.");
        } else if (rand_dice3 == 3 && rand_dice4 == 3
                || rand_dice3 == 5 && rand_dice4 == 5
                || rand_dice3 == 6 && rand_dice4 == 6) {
            System.out.println("You win the bet.");
        }else if (rand_dice1 == 1 && rand_dice2 == 1
                || rand_dice1 == 2 && rand_dice2 == 2
                || rand_dice1 == 4 && rand_dice2 == 4){
            System.out.println("You win the bet. ");
        } else if (rand_dice3 == 1 && rand_dice4 == 1
                || rand_dice3 == 2 && rand_dice4 == 2
                || rand_dice3 == 4 && rand_dice4 == 4) {
            System.out.println("You lost the bet. Try again.");
        }else if (rand_dice1 == rand_dice3 && rand_dice2 == rand_dice4
                || rand_dice1 + rand_dice2 == 7 && rand_dice3 + rand_dice4 == 7){
            System.out.println("What a luck, it is a tie.");
        } else if (rand_dice1 + rand_dice2 == 7) {
            System.out.println("You win. Computer had a hard 7.");
        } else if (rand_dice3 + rand_dice4 == 7) {
            System.out.println("Computer wins. It's a seven.");
        } else if (rand_dice1 == 1 && rand_dice2 == 1
                || rand_dice1 == 2 && rand_dice2 == 2
                || rand_dice1 == 4 && rand_dice2 == 4
                && rand_dice3 + rand_dice4 == 7) {
            System.out.println("Computer wins. 7 loses directly.");
        } else if (rand_dice3 == 1 && rand_dice4 == 1
                || rand_dice3 == 2 && rand_dice4 == 2
                || rand_dice3 == 4 && rand_dice4 == 4
                && rand_dice1 + rand_dice2 == 7) {
            System.out.println("You win. 7 loses directly.");
        } else{
            System.out.println("Spent dices. No winners or losers.");
        }
    }
}


