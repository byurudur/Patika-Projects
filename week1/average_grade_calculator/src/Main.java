/**
 * @author Ahmet Batuhan YÜRÜDÜR, 2024
 */

import java.util.Scanner;

class Main{

    public static void main(String[] args) {

        // Average grade calculator, works with the inputs from the user.
        // Value assignments.
        Scanner input = new Scanner(System.in);
        double grade1, grade2, grade3, passGrade ;
        double percent1, percent2, percent3;
        // Taking the needed values.
        System.out.println("Please insert your first grade; ");
        grade1 = input.nextInt();
        System.out.println("What is the determined percentage for " + grade1);
        percent1 = input.nextInt();
        System.out.println("Please insert your second grade; ");
        grade2 = input.nextInt();
        System.out.println("What is the determined percentage for " + grade2);
        percent2 = input.nextInt();
        System.out.println("Please insert your third grade; ");
        grade3 = input.nextInt();
        System.out.println("What is the determined percentage for " + grade3);
        percent3 = input.nextInt();
        System.out.println("Please insert the pass grade; ");
        passGrade = input.nextInt();

        // Calculating the percentages and finding the actual grade.
        double realGrade1, realGrade2, realGrade3, averageGrade;
        realGrade1 = grade1 * (percent1 / 100);
        realGrade2 = grade2 * (percent2/ 100);
        realGrade3 = grade3 * (percent3 / 100);

        // For average value, we determine the "averageGrade" and calculate.
        averageGrade = (realGrade1 + realGrade2 + realGrade3)/3;

        //Print output to the user.
        System.out.println( "Your average grade is " + (averageGrade)/3 + "." );

        //Tell if it is a success or a fail.
        if(averageGrade>=passGrade){
            System.out.println("You have pass the class. Awesome! ");
        }else{
            System.out.println("You have failed, good luck next time. ");
        }
    }
}