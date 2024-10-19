/*
*Assume that a runner runs 14 kilometers in 45 mins and 30 seconds.
* Write a program that displays the average speed in miles per hour
* (Note 1 mile = 1.6 kilometers).
 */

public class Speed {
    public static void main(String[] args)
    {
        double kilotomiles = 14.0/ 1.6;
        double minstohrs = 45/60.0;
        double secstomins = 30/3600.0;
        double speed = kilotomiles/(minstohrs + secstomins);
        System.out.println("The average speed is " + speed + " miles per hour");
    }
}
