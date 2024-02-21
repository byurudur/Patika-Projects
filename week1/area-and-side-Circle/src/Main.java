import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // Let's calculate the both area and sideline.
        System.out.println("This code calculates the area and sideline" +
                            "of a circle.");

        // Input datas from user
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a radius: ");

        // Determine the type and variable names
        double radius, pi, area, sideline;
        pi = 3.14159;

        radius = input.nextInt();

        // Numerical calculations
        area = pi * (radius * radius);
        sideline = (2 * pi * radius);

        // Output to the user.
        System.out.println("Your circle has an area of " + area + " cm2" +
                " and a sideline of " + sideline +  " ." );


    }
}