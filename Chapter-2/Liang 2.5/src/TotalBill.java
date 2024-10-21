//Program calculate the total bill after the user enter the subtotal and their desired gratuity rate

//Imports Scanner class to retrive input from the user
import java.util.Scanner;

//Class to compute the Total bill
public class TotalBill {

    //Main Method
    public static void main(String[] args) {

        //Declares Scanner to read user input from the keyboard
        Scanner keyboard = new Scanner(System.in);

        //Declares variable to retrieve input for the subtotal and gratuity rate and to compute the total bill
        double subtotal,gratuityrate, gratuity, total;

        //Prompts user to enter the subtotal of their bill and reads it as a floating point number
        System.out.println("Enter the subtotal");
        subtotal = keyboard.nextDouble();

        //Prompt user to enter their desired gratuity as a percentage and reads it as an integer
        System.out.println("Enter the gratuity rate in a percentage");
        gratuityrate = keyboard.nextDouble();

        //Computes the Gratuity using users input;
        gratuity = subtotal * (gratuityrate/100);

        //Computes total using the totalbill using the subtotal and gratuity
        total = subtotal + gratuity;

        //Prints the amount of gratuity the user decided to pay
        System.out.println(("You chose to pay " +gratuity+ " % gratuity"));

        //Prints the total bill including the gratuity
        System.out.println("Your total is $"+total);
    }
}
