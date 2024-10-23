/*Program computes the average acceleration given the starting velocity,
ending velocity, and the timespan given to the user
*/

//Imports Scanner class that retrieves input from the user
import java.util.Scanner;

//Class to compute the average acceleration
public class AverageAcceleration {

    //Main Method
    public static void main(String[] args) {

        //Declares Scanner to read user input
        Scanner keyboard = new Scanner(System.in);

        //Declares variables to compute the average acceleration
        double startingVelocity;
        double endingVelocity;
        double timeSpan;
        double averageAcceleration;

       //Prompts user to enter the starting velocity and reads it as a floating point number
        System.out.println("Enter the starting velocity: ");
        startingVelocity = keyboard.nextDouble();

        //Prompts user to enter the ending velocity and reads it as a floating point number
        System.out.println("Enter the ending velocity");
        endingVelocity = keyboard.nextDouble();

        //Prompts user to enter the time span and reads it as a floating point number
        System.out.println("Enter the timespan");
        timeSpan = keyboard.nextDouble();

        //Computes the average acceleration given user input
        averageAcceleration = (endingVelocity - startingVelocity) / timeSpan;

        //Prints average acceleration
        System.out.println("The average acceleration is: " + averageAcceleration);
    }
}
