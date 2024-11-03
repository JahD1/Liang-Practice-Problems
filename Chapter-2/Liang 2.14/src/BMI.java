//Program calculates BMI based on weight and height given by user

//Imports Scanner class to retrieve user input
import java.util.Scanner;

//Class to compute the BMI
public class BMI {

    //Main Method
    public static void main(String[] args) {

        //Declare Scanner to retrieve user input
        Scanner keyboard = new Scanner(System.in);

        //Declare constants to convert pounds to kilos and inches to meters
        final double KILOS_IN_A_POUND = 0.45359237;
        final double METERS_IN_AN_INCH = 0.0254;

        //Declare variables to compute BMI
        double weight;
        double height;
        double bmi;

        //Prompt user to enter their weight and read input as a floating point number
        System.out.println("Enter your weight in pounds");
        weight = keyboard.nextDouble();

        //Prompt user to enter their height and read input as a floating point number
        System.out.println("Enter your height in inches");
        height = keyboard.nextDouble();

        //Compute BMI
        bmi = (weight * KILOS_IN_A_POUND) / (Math.pow(height * METERS_IN_AN_INCH,2));

        //Display BMI
        System.out.println ("Your BMI is " + bmi);
    }
}
