// Program find the area and the volume of a cylinder based on user input.
// User enters the radius and the length

// Imports Scanner to retrieve users input
import java.util.Scanner;

// Class to calculate the area and the volume of the cylinder
public class Cylinder
{
    // Main Method
    public static void main(String args[])
    {
        // Creates a constanst for PI
        final double PI = 3.141592;

        // Declares Scanner to read users input
        Scanner keyboard = new Scanner(System.in);

        // Declare varibles for user input and area and volume calculations
        double radius, length, area, volume;

        // Prompt user to enter a radius and read the input (radius) as a floating point number
        System.out.println("Enter a value for the radius");
        radius = keyboard.nextDouble();

        //Prompts user to enter a length and read the input (length) as a floating point number
        System.out.println("Enter a value for the length");
        length = keyboard.nextDouble();

        // Calculates the area of the cylinder using radius given from user
        area = radius * radius * PI;

        // Calculates the volume of a cylinder using area provided from radius given from user and length given from user
        volume = area * length;

        // Print the area of the cylinder
        System.out.println("The area of a cylinder with a radius of "+radius+ " is "+area);

        //Prints the volume of the cylinder
        System.out.println("The volume of a cylinder with an area of "+area+ " and a length of "+length+ " is "+volume);
    }
}
