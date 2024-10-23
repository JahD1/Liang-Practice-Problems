//Program coverts minutes to the equivalent number of years and days

//Import Scanner class to read input from user
import java.util.Scanner;

//Class to compute minutes to years and days
public class MinutesToYearsAndDays {

    //Main Method
    public static void main(String[] args) {

        //Constant variable to represent minutes in a day
        final int MINUTES_IN_A_DAY = 60*24;

        //Constant variable to represent minutes in a year
        final int  MINUTES_IN_A_YEAR = MINUTES_IN_A_DAY*365;

        //Declare Scanner to read input from the user
        Scanner keyboard = new Scanner(System.in);

        //Declare variables to compute the conversion
        int minutes, years, days, timeremaining;

        //Prompt user to enter a number in minutes
        System.out.println("Enter a number in minutes to be converted to years and days: ");
        minutes = keyboard.nextInt();

        //Compute the number of years from the number in minutes entered by the user
        years = minutes / MINUTES_IN_A_YEAR;

        //Get the remaining minutes after the number of years was calculated
        timeremaining = minutes % MINUTES_IN_A_YEAR;

        //Compute the number of days from the remaining time
        days = timeremaining / MINUTES_IN_A_DAY;

        //Prints the coversion of minutes to years and days
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days.");
    }
}
