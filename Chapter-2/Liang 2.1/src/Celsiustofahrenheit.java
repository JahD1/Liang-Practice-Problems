// Program coverts Celsuis to Fahrenheit

//Imports Scanner class to get user input
import java.util.Scanner;

// Class to perform Celsius to Fahrenheit conversion
public class Celsiustofahrenheit
{
    //Main Method to run the program
    public static void main(String[] args)
    {
        //Declare Scanner for user input
        Scanner keyboard = new Scanner(System.in);

        //Declare variables for temperature conversion
        double celsius, fahrenheit;

        //Prompts user and reads floating point number from the keyboard
        System.out.println ("Enter a number in celsius to convert to fahrenheit.");
        celsius = keyboard.nextDouble();

        // Converts users input (Celsius) into Fahrenheit
        fahrenheit = (9.0/5.0) * celsius + 32;

        //Print the results of the conversion
        System.out.println(celsius + " degrees in celsius = " +fahrenheit+ " degrees in fahrenheit");

    }
}

