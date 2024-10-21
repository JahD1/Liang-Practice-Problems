//Program find the sum of the digits in an integer entered ny the user

//Imports Scanner class to retrieve users input
import java.util.Scanner;

//Class to compute the Digit Sum
public class DigitSum {

    //Main Method
    public static void main(String[] args) {

        //Decalres Scanner to read user input
        Scanner keyboard =new Scanner(System.in);

        //Declares variables to compute the Digit Sum
        int numberEntered, firstDigit,secondDigit,thirdDigit,fourthDigit, firstRemainder, secondRemainder, digitSum;

        //Prompts user to enter an integer btw 0 & 1000
        System.out.println("Enter an integer between 0-1000 to have the digits added");
        numberEntered = keyboard.nextInt();

        //Retrives leading digit
        firstDigit = numberEntered/1000;

        //Removes leading digit
        firstRemainder = numberEntered%1000;


        //Removes new leading digit
        secondDigit = firstRemainder/100;

        //Removes new leading digit
        secondRemainder = firstRemainder%100;

        //Retrieves new leading digit
        thirdDigit = secondRemainder/10;

        //Retrieves last digit
        fourthDigit = secondRemainder%10;

        //Computes the sum of all digits found
        digitSum = firstDigit + secondDigit + thirdDigit + fourthDigit;

        //Prints the results of the sum of the digits
        System.out.println("The sum of the digits  of the number " + numberEntered + " is " + digitSum);

    }
}
