import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String userName, userSurname, firstEight, lastThree, userLastThree, exit;


        System.out.println("Welcome to entry. ");
        System.out.println("Please enter your name, surname and last 3 digit of your SSN.");
        String[] userDataBase = {"Batuhan", "Yürüdür", "12345678910"};


        firstEight = userDataBase[2].substring(0,8);
        lastThree = userDataBase[2].substring(0,11);

        System.out.println("Please enter your name: ");
        userName = input.nextLine();

        System.out.println("Please enter your surname: ");
        userSurname = input.nextLine();

            while (true)
            {
                if ((userName.equals(userDataBase[0].toLowerCase())) && (userSurname.equals(userDataBase[1].toLowerCase())))
                {

                    System.out.println("Welcome " + userName + " " +  userSurname);
                    System.out.println("SSN: " + firstEight + "***");
                    System.out.println();
                    System.out.println("Please enter last three digits: ");
                    userLastThree = input.nextLine();

                    if (userLastThree.equals(lastThree))
                    {
                        System.out.println("CORRECTED");
                        System.out.println("press 'Q' to exit.");
                        exit = input.nextLine();

                        if (exit.equals("q") || exit.equals("Q"))
                        {
                            System.out.println("Exit progress...");
                            break;
                        }
                        else
                        {
                            continue;
                        }
                    }else
                    {
                        System.out.println("Entry is not valid.");
                        break;
                    }
                }
                else if((userName.equals(userDataBase[1].toUpperCase())) && (userSurname.equals(userDataBase[1].toUpperCase())))
                {

                    System.out.println("Welcome " + userName + " " +  userSurname);
                    System.out.println("SSN: " + firstEight + "***");
                    System.out.println();
                    System.out.println("Please enter last three digits: ");
                    userLastThree = input.nextLine();

                    if (userLastThree.equals(lastThree))
                    {
                        System.out.println("CORRECTED");
                        System.out.println("press 'Q' to exit.");
                        exit = input.nextLine();
                        if (exit.equals("q") || exit.equals("Q"))
                        {
                            System.out.println("Exit progress...");
                            break;
                        }
                        else
                        {
                            continue;
                        }
                    }
                    else
                    {
                        System.out.println("Entry is not valid.");
                        break;
                    }
                }
                else
                {
                    System.out.println("Entry is not valid.");
                    System.out.println("press 'Q' to exit.");
                    exit = input.nextLine();
                    if (exit.equals("q") || exit.equals("Q"))
                    {
                        System.out.println("Exit progress...");
                        break;
                    }
                }
            }
        }
    }