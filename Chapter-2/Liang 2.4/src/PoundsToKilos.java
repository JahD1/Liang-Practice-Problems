// Program converts pounds to kilos based on user input

//Import Scanner class to retrieve user input
import  java.util.Scanner;

//Class to compute conversion
public class PoundsToKilos {

    //Main Method
    public static void main(String[] args) {

        //Constant to represent how many kilos are in a pound
        final double KILOS_IN_A_POUND = 0.454;

        //Declare to read user input from the keyboard
        Scanner keyboard = new Scanner(System.in);

        //Declare variables to compute weight conversion
        double pounds, kilos;

        //Prompt user to enter a number for pounds and reads it as a floating point number
        System.out.println("Enter a weight in pounds to covert to kilos");
        pounds = keyboard.nextDouble();

        //Converts user input(pounds) to kilograms
        kilos = pounds * KILOS_IN_A_POUND;

        //Prints the result of the coversion of pounds to kilos
        System.out.println((pounds + " pounds is equivalent to " + kilos + " kilos"));
    }
}
