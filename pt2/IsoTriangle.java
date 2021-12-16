/**
 * @author Jayden Randhawa
 * 15/12/2021
 * This program draws a triangle with a user inputted size.
 */

package pt2;

import java.util.Scanner;

public class IsoTriangle {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        // Store the size of the triangle
        int size = inp.nextInt();

        // Create each layer by calling the addSpace and drawBar functions
        for(int i=0;i<size;i++){
            // Number of odd spaces is equal to the total number of layers minus the current layer
            addSpace(size-(i+1));
            // Width of the bar is equal to the nth odd number
            drawBar(i*2+1);
        }

        inp.close();
    }

    public static void drawBar(int width){
        // Print a line with the entered width then enter a newline
        for(int i=0;i<width;i++) System.out.print("*");
        System.out.println();

    }

    public static void addSpace(int width){
        // Print an empty space with the entered width
        for(int i=0;i<width;i++) System.out.print(" ");
    }
    
}