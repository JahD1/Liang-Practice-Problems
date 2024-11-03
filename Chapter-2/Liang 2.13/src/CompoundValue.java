//Program computes the compound after 6 months given the monthly savings amount from user

// Imports Scanner class to retrieve input from user
import java.util.Scanner;

//Class to compute the compound value
public class CompoundValue {

    //Main Method
    public static void main(String[] args) {

        //Declare Scanner to retrieve user input
        Scanner keyboard = new Scanner(System.in);

        //Declare Variables to compute the compound value
        double monthlySavingAmount;
        double currentBalance = 0;
        double finalBalance = 0;
        double interestRate = (1.0 + 0.00417);

        //Prompts user to enter the monthly saving amount and reads it as a floating point number
        System.out.println("Enter the monthly saving amount");
        monthlySavingAmount = keyboard.nextDouble();

        // loop to compute the compound value after 6 month
        for(int i = 0; i < 6; i++)
        {
            //Formula to compute the compound value
            currentBalance = finalBalance;
            finalBalance = (monthlySavingAmount +currentBalance) * interestRate;
        }

        //Prints the final balance
        System.out.printf ("The final balance after the 6th month is $%.2f " , finalBalance);
    }
}
