/**
 * @author Jayden Randhawa
 * 14/12/2021
 * This program draws a house with using ASCII characters.
 */

package pt1;

public class house {
    public static void main(String[] args) {
        // Call each of the methods to draw the house.
        addRoof();
        addBase();
        addWalk();
    }
    public static void addRoof(){
        // Draew the roof
        System.out.println("   /\\   ");
        System.out.println("  /  \\   ");
        System.out.println(" /    \\   ");
        System.out.println("/______\\   ");
    }
    public static void addBase(){
        // Draw tehe base
        System.out.println(":      :");
        System.out.println(":      :");
        System.out.println(":      :");
        System.out.println(":______:");
    }
    public static void addWalk(){
        // Draw the walkway
        System.out.println("   **");
        System.out.println("   ***********");
    }
    
}
