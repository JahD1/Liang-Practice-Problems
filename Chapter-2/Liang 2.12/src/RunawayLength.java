//Program calculates runaway length for an airplane given takeoff speed and acceleration by  user

// Import scanner class that allows you retrieve user input
import java.util.Scanner;

// Class that computes the runaway length
public class RunawayLength {

    /Main Method
    public static void main(String[] args) {

        //Declare Scanner to retrieve user input from keyboard
        Scanner keyboard = new Scanner(System.in);

        //Declare varibales to complete the calculations of the runaway length
        double takeoffSpeed;
        double acceleration;
        double runawayLength;

        //Prompts user to enter takeoff speed and reads it as a floating point number
        System.out.println("Enter the takeoff speed ");
        takeoffSpeed = keyboard.nextDouble();

        //Prompts user to enter acceleration and reads it as a floating point number
        System.out.println("Enter the acceleration");
        acceleration = keyboard.nextDouble();

        //Caluculates runaway length for airplane usiing the takeoff spped and acceleration
        runawayLength = (Math.pow(takeoffSpeed, 2))/ (2*acceleration);

        //Displays the runaway length
        System.out.println ("The minimum runaway length for this airplane is " + runawayLength );
    }
}
