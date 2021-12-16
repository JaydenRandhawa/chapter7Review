package pt1;
/**
 * @author Jayden Randhawa
 * 13/12/2021
 * This program prints a square with the dimensions chosen by the user.
 */

 import java.util.Scanner;

public class DisplayBox {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter a width: ");
        int width = inp.nextInt();
        System.out.print("Enter a height: ");
        int height = inp.nextInt();
        
        System.out.print("Would you like to enter a custom character to create the box with(enter Y for yes or N for no): ");

        // Convert the input to lower case and check if the user wants to a custom character.
        if((inp.next()).toLowerCase().equals("y")){
            System.out.print("Enter a character: ");
            drawBox(width, height, inp.next().charAt(0));
        }
        else{
            drawBox(width, height);
        }

        inp.close();
    }

    // Create the methods for making the box and bars with the default character

    public static void drawBox(int width, int height){
        // Draw the top bar
        drawBar(width, false);
        // Draw each bar in the middle
        for(int i = 0;i<height-2;i++) drawBar(width, true);
        // Draw the bottom bar
        drawBar(width, false);
    }
    public static void drawBar(int width, boolean isMiddle){
        // Check if the bar is a middle bar or not
        if(isMiddle){
            //Print the first symbol in the bar
            System.out.print('*');
            // Print the empty spaces in the bar
            for(int i = 0;i<width-2;i++) System.out.print(' ');
            // Print the final symbol in the bar
            System.out.println('*');
        }
        else{
            // Print a filled bar with the entered width
            for(int i=0;i<width;i++) System.out.print('*');
            System.out.println();
        }
    }
    
    // Create the overload methods for making the box and bars with the custom character

    public static void drawBox(int width, int height, char symbol){
        //Draw the top bar
        drawBar(width, false, symbol);
        // Draw each bar in the middle
        for(int i = 0;i<height-2;i++) drawBar(width, true, symbol);
        //Draw the bottom bar
        drawBar(width, false, symbol);
    }
    public static void drawBar(int width, boolean isMiddle, char symbol){
        // Check if the bar is a middle bar or not
        if(isMiddle){
            //Print the first symbol in the bar
            System.out.print(symbol);
            // Print the empty spaces in the bar
            for(int i = 0;i<width-2;i++) System.out.print(' ');
            // Print the final symbol in the bar
            System.out.println(symbol);
        }
        else{
            // Print a filled bar with the entered width
            for(int i=0;i<width;i++) System.out.print(symbol);
            System.out.println();
        }
    }
    
}