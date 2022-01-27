/**
 * @author Jayden Randhawa
 * 13/12/2021
 * This program prints the numbers from 1 - 10 in Spanish.
 */

public class SpanishNumbers {
    public static void main(String[] args) {
        // Call the spanishNumber method with each number from 1 - 10
        for(int i=1;i<=10;i++){
            System.out.println(spanishNumber(i));
        }
    }   
    public static String spanishNumber(int num){
        // Check what the inputted number is and return the corresponding word in spanish.
        switch(num){
            case 1: return("uno");
            case 2: return("dos");
            case 3: return("tres");
            case 4: return("cuatro");
            case 5: return("cinco");
            case 6: return("seis");
            case 7: return("siete");
            case 8: return("ocho");
            case 9: return("niez");
            case 10: return("diez");
            default: return("Not a number from 1 - 10");
        }
    }
}