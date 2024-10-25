/* Program computes the energy in joules you need to heat water given
starting temp, ending temp and the final temp
 */

//Imports Scanner class to read users input
import java.util.Scanner;

//Class to compute the needed energy in joules to heat water up
public class HeatWaterEnergy {

    //Main method
    public static void main(String[] args) {

        //Declares Scanner variable to retrieve input from the keyboard
        Scanner keyboard = new Scanner (System.in);

        //Declares varibles to complete conversion
        double waterWeightInKilos;
        double initialWaterTemp;
        double finalWaterTemp;
        double energyInJoules;

        //Prompts user to enter an amount of water and reads it as a floating point number
        System.out.println("Enter the amount of water to be heated in kilos");
        waterWeightInKilos = keyboard.nextDouble();

        //Prompt user to enter an initial water temp and reads it as a floating point number
        System.out.println("Enter the initial water temperature");
        initialWaterTemp = keyboard.nextDouble();

        //Prompts user to enter an final water temp and reads it as a floating point number
        System.out.println("Enter the final water temperature");
        finalWaterTemp = keyboard.nextDouble();

        //Calculates the energy in joules needed to heat water up
        energyInJoules = waterWeightInKilos *(finalWaterTemp - initialWaterTemp) * 4184;

        //Prints the calculation (the amount energy in joules)
        System.out.println("The energy needed is " + energyInJoules + " joules");
    }
}
