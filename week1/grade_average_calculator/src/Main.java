import java.util.Scanner;

class Main{

    public static void main(String[] args) {

        //Average grade calculator, works with the inputs from the user.
        Scanner input = new Scanner(System.in);

        //Taking the values.
        System.out.println("Please insert your first grade; ");
        int grade1 = input.nextInt();
        System.out.println("Please insert your second grade; ");
        int grade2 = input.nextInt();
        System.out.println("Please insert your third grade; ");
        int grade3 = input.nextInt();
        System.out.println("Please insert the pass grade; ");
        int passGrade = input.nextInt();

        //For average value, we determine the "averageGrade" and calculate.
        int averageGrade = (grade1+grade2+grade3)/3;

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