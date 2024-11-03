/*
Program estimates the future population based of the number of years entered by the user
 */

//Imports Scanner class to retrieve input from the user
import java.util.Scanner;

//Class to Calculate the estimated population
public class EstimatedPopulation {

    //Main Method
    public static void main(String[] args) {

        //Constant for the current population
        final double currentPopulation = 312032486;

        //Constant to represent thr seconds in a minute
        final double secondsInMinute = 60;

        //Constant to represent minutes in an hour 
        final double minutesInHour = 60;
        final double hoursInDay = 24;
        final double daysInYear = 365;

        Scanner keyboard = new Scanner(System.in);

        double yearlyBirth;
        double yearlyDeath;
        double yearlyImmigration;
        double estimatedPopulation;
        int yearsEntered;

        System.out.println("Enter the number of years to get an estimated population");
        yearsEntered = keyboard.nextInt();

        yearlyBirth = ((((secondsInMinute/7)*minutesInHour)*hoursInDay)*daysInYear);
        yearlyDeath = ((((secondsInMinute/13)*minutesInHour)*hoursInDay)*daysInYear);
        yearlyImmigration = ((((secondsInMinute/45)*minutesInHour)*hoursInDay)*daysInYear);

        estimatedPopulation = currentPopulation + (yearlyBirth * yearsEntered) - (yearlyDeath * yearsEntered) + (yearlyImmigration * yearsEntered);
        System.out.println("The estimated population is " + estimatedPopulation);

       /* System.out.println(yearlyBirth);
        System.out.println(yearlyDeath);
        System.out.println(yearlyImmigration);
        System.out.println(currentPopulation);*/

    }
}
