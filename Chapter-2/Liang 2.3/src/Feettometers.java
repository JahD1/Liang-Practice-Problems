// Program coverts feet to meters given users input

//Imports Scanner class to read user input
import java.util.Scanner;

//Class to perform conversion
public class Feettometers
{
    //Main Method
    public static void main(String args[])
    {
        //Constant variable used to represent how many meters are in a foot
        final double METERS_IN_A_FOOT = 0.305;

        //Declare scanner to read user input
        Scanner keyboard = new Scanner(System.in);

        //Declare variables for length conversion
        double feet, meters;

        //Prompt user to enter a number for feet and read the input as a floating point number
        System.out.println("Enter a value in feet to be converted to meters");
        feet = keyboard.nextDouble();

        //Coverts feet to meters
        meters = feet * METERS_IN_A_FOOT;

        //Prints the results of feet to meter conversion
        System.out.println(feet+ " feet is equivalent to "+meters+ " meters");
    }
}
