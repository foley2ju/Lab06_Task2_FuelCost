import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // Variables
        Scanner in = new Scanner(System.in);
        double gallons = 0.0;
        double mPerGal = 0.0;
        double cPerGal = 0.0;
        double travelDis = 0.0;
        double totalCost = 0.0;
        boolean done1 = false;
        boolean done2 = false;
        boolean done3 = false;
        String trash = "";

        // Amount of gas
        do {
            System.out.println("Enter the gallons of gas in your car: ");
            if (in.hasNextDouble()) {
                // Success
                gallons = in.nextDouble();
                done1 = true;
            } else {
                // Fail
                trash = in.nextLine();
                System.out.println("You entered: " + trash);
                System.out.println("Please enter a valid number (gallons of gas).");
            }

            // PUT HERE IF CODE FAILS

        } while (!done1);

        // Fuel efficiency
        do {
            System.out.println("Enter the fuel efficiency of your car in miles per gallon: ");
            if (in.hasNextDouble()) {
                // Success
                mPerGal = in.nextDouble();
                done2 = true;
            } else {
                // Fail
                trash = in.nextLine();
                System.out.println("You entered: " + trash);
                System.out.println("Please enter a valid number (miles per gallon).");
            }
        } while (!done2);

        // Price per gallon
        do {
            System.out.println("Enter the cost of gas per gallon: ");
            if (in.hasNextDouble()) {
                // Success
                cPerGal = in.nextDouble();
                done3 = true;

            } else {
                // Fail
                trash = in.nextLine();
                System.out.println("You entered: " + trash);
                System.out.println("Please enter a valid number (gas price per gallon).");
            }
        } while (!done3);

        // Results

        totalCost = cPerGal * 100;
        System.out.println("Your gas price for 100 miles is " + totalCost);
        travelDis = mPerGal * gallons;
        System.out.println("Your car can travel " + travelDis + " miles before running out of gas.");

    }
}