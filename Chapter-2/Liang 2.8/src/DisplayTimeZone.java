//Program displays the time in a specific timezone given the timezone offset

//Import Scanner to read input from user
import java.util.Scanner;

//Classs to display time in specified time zone
public class DisplayTimeZone {

    //Main Method
    public static void main(String[] args) {

        //Declares Scanner to read input from the user
        Scanner keyboard = new Scanner(System.in);

        //Prompts user to enter the timezone offset and read it in as an integer
        System.out.println("Enter time zone offset to GMT ");
        int timeZoneOffset = keyboard.nextInt();

        //Gets the time in milliseconds of the current operating system
        long totalMilliseconds = System.currentTimeMillis();

        //Gets the total number of seconds
        long totalSeconds = totalMilliseconds / 1000;

        //Gets the current second
        long currentSecond = totalSeconds % 60;

        //Gets the total minutes
        long totalMinutes = totalSeconds / 60;

        //Gets the current minute
        long currentMinute = totalMinutes % 60;

        //Get the total hours
        long totalHours = totalMinutes / 60;

        //Gets the current hour and adds the time zone offset to it to display the current time in a specific time zone
        long currentHour = (totalHours % 24) + timeZoneOffset;

        //Displays the time in a specific time zone
        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);
    }
}
