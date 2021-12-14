/**
 * @author Jayden Randhawa
 * 13/12/2021
 * This program takes an amount of time and converts it to another unit.
 */

import java.util.Scanner;

public class TimeConverter{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter the number for the operation you would like to do:");
        System.out.println("1. Convert Hours to Minutes");
        System.out.println("2. Convert Days to Hours");
        System.out.println("3. Convert Minutes to Hours");
        System.out.println("4. Convert Hours to Days");

        // Check which operation the user wants to do and call the respective method
        switch(inp.nextInt()){
            case 1:
                System.out.print("Enter the number of hours: ");
                System.out.println(hoursToMinutes(inp.nextInt()));
                break;
            case 2:
                System.out.print("Enter the number of days: ");
                System.out.println(daysToHours(inp.nextInt()));
                break;
            case 3:
                System.out.print("Enter the number of minutes: ");
                System.out.println(minutesToHours(inp.nextInt()));
                break;
            case 4:
                System.out.print("Enter the number of hours: ");
                System.out.println(hoursToDays(inp.nextInt()));
                break;
        }

        inp.close();
    }

    public static String hoursToMinutes(int hours){
        //Multiply the hours by 60 and return the product
        return("There are " + hours*60 + " minutes in " + hours + " hours.");
    }
    public static String daysToHours(int days){
        //Multiply the days by 24 and return the product
        return("There are " + days*24 + " hours in " + days + " days.");
    }
    public static String minutesToHours(int minutes){
        //Divide the minutes by 60 and return the quotient
        // If there is a remainder print the remainder in minutes
        if(minutes%60 == 0){
            return("There are " + minutes/60 + " hours in " + minutes + " minutes.");
        }
        else{
            return("There are " + minutes/60 + " hours and " + minutes%60 + " minutes in " + minutes + " minutes.");
        }
    }
    public static String hoursToDays(int hours){
        //Divide the hours by 24 and return the quotient
        // If there is a remainder print the remainder in hours
        if(hours%24 == 0){
            return("There are " + hours/24 + " days in " + hours + " hours.");
        }
        else{
            return("There are " + hours/24 + " days and " + hours%24 + " hours in " + hours + " hours.");
        }
    }
}