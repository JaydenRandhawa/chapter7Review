/**
 * @author Jayden Randhawa
 * 13/12/2021
 * This program takes in a metric distance and converts it to an imperial unit and vice versa.
 */

package pt1;

import java.util.Scanner;

public class MetricConversions {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the number for the conversion you would like to do:");
        System.out.format("%s%40s\n", "1. Convert Inches to Centimeters", "5. Convert Centimeters to Inches");
        System.out.printf("%s%40s\n", "2. Convert Feet to Centimeters", "6. Convert Centimeters to Feet");
        System.out.printf("%s%40s\n", "3. Convert Yards to Meters", "7. Convert Meters to Yards");
        System.out.printf("%s%40s\n", "4. Convert Miles to Kilometers", "8. Convert Kilometers to Miles");

        // Check which conversion the user wants to do and call the respective method

        switch(inp.nextInt()){
            case 1:
                System.out.print("Enter the length in inches: ");
                inchesToCentimeters(inp.nextDouble());
                break;
            case 2:
                System.out.print("Enter the length in feet: ");
                feetToCentimeters(inp.nextDouble());
                break;
            case 3:
                System.out.print("Enter the length in yards: ");
                yardsToMeters(inp.nextDouble());
                break;
            case 4:
                System.out.print("Enter the length in miles: ");
                milesToKilometers(inp.nextDouble());
                break;
            case 5:
                System.out.print("Enter the length in centimeters: ");
                centimetersToInches(inp.nextDouble());
                break;
            case 6:
                System.out.print("Enter the length in centimeters: ");
                centimetresToFeet(inp.nextDouble());
                break;
            case 7:
                System.out.print("Enter the length in meters: ");
                metersToYards(inp.nextDouble());
                break;
            case 8:
                System.out.print("Enter the length in kilometers: ");
                kilometersToMiles(inp.nextDouble());
                break;
        }

        inp.close();
    }

    // Create the imperial to metric methods

    public static void inchesToCentimeters(double len){
        // Multiply the value by 2.54
        System.out.printf("%s%.1f%s", "There are ", len*2.54, "cm in " + len + "in");
    }

    public static void feetToCentimeters(double len){
        // Multiply the value by 30
        System.out.printf("%s%.1f%s", "There are ", len*30, "cm in " + len + "ft");
    }

    public static void yardsToMeters(double len){
        // Multiply the value by 0.91
        System.out.printf("%s%.1f%s", "There are ", len*0.91, "m in " + len + "yd");
    }

    public static void milesToKilometers(double len){
        // Multiply the value by 1.6
        System.out.printf("%s%.1f%s", "There are ", len*1.6, "km in " + len + "mi");
    }

    // Create the metric to imperial methods

    public static void centimetersToInches(double len){
        // Divide the value by 2.54
        System.out.printf("%s%.1f%s", "There are ", len/2.54, "in in " + len + "cm");
    }

    public static void centimetresToFeet(double len){
        // Divide the value by 30
        System.out.printf("%s%.1f%s", "There are ", len/30, "ft in " + len + "cm");
    }

    public static void metersToYards(double len){
        // Divide the value by 0.91
        System.out.printf("%s%.1f%s", "There are ", len/0.91, "yd in " + len + "m");
    }

    public static void kilometersToMiles(double len){
        // Divide the value by 1.6
        System.out.printf("%s%.1f%s", "There are ", len/1.6, "mi in " + len + "km");
    }
}