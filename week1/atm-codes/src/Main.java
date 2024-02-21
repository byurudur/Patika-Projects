import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // Determining variables;
        int  loan, select, money, balance, password, password1;
        String name, name2;
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        balance = rand.nextInt(100000) +100000;

        // Welcoming the customer;
        System.out.println("WELCOME TO JAVABANK");
        System.out.println("___________________");
        System.out.println("PLEASE TYPE YOUR NAME: ");
        name = input.nextLine();
        System.out.println(name + "," + " please type your password: ");
        // Collecting inputs;
        while (true) {
            password = input.nextInt();
            System.out.println("Please log in with your password.");
            password1 = input.nextInt();
            do {
                System.out.println("Please reenter your password: ");
                password1 = input.nextInt();

            }while (password != password1);
            if (password1 == password){
                System.out.println("Login success!");
                System.out.println("Welcome dear " + name + ".");
                break;
            }
        }


        // Other actions;
        while (true) {
            System.out.println("How can JAVABANK help you today?");
            System.out.println("________________________________");
            System.out.println("1) I want to see my balance.");
            System.out.println("2) I want to see the loan advantages.");
            System.out.println("3) I want to send money.");
            System.out.println("4) I want to see my debt.");
            System.out.println("___________________________");
            System.out.println("Enter your decision: ");


            // Other input;
            select = input.nextInt();
            if (select == 1) {
                System.out.println("Your balance is: $" + balance);
                continue;

            } else if (select == 2) {
                System.out.println("We have many advantages.");
                System.out.println(balance + "$" + " is your yearly income.");
                System.out.println("How much loan do you desire?: ");
                loan = input.nextInt();

                if (loan > 12345 && balance > 200000) {
                    System.out.println("For you peerless customer of ours, we can loan you $100,000 ");
                    System.out.println("Your new balance is $" + balance);
                } else if (loan < 12345 && loan > 0 && balance > 150000 && balance < 400000) {
                    System.out.println("For you peerless customer of ours, we can loan you " + loan);
                } else {
                    System.out.println("Sorry, your credit is not enough.");
                }
                continue;

            } else if (select == 3) {


                    System.out.println("To whom you want to send money?");
                    name2 = input.nextLine();
                    input.nextLine();
                    System.out.println("How much money do you want to send?");
                    money = input.nextInt();
                    System.out.println(money + " corrected...");



                while (true) {
                    if (balance > money){
                        System.out.println("$" + money + " has been send to " + name2 + ".");
                        System.out.println("Your new balance is: $" + (balance - money) );
                        break;
                    }else {
                        System.out.println("You do not have enough money.");
                        break;
                    }
                }
            } else if (select == 4) {
                System.out.println("You have no debt to JAVABANK. Thank you for that. ");
                continue;
            } else {
                System.out.println("You have entered an undefined character.");
                continue;
            }
        }
    }
}
