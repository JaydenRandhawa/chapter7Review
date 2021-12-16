/**
 * @author Jayden Randhawa
 * 13/12/2021
 * This program takes prints all perfect number between 1 and 100 inclusive.
 */

package pt2;

public class PerfectIntegers {
    public static void main(String[] args) {

        // Call the isPerfect method for each number integer from 1 - 100
        for(int i=1;i<=100;i++){
            if(isPerfect(i)) System.out.println(i);
        }
    }

    public static boolean isPerfect(int num){
        // Check if a number if a number is perfect by adding al of its factors then comparing the sum to the number
        int sum = 0;
        for(int i=1;i<num;i++){
            // Check if each number less than the inputted number is a factor by checking if the remainder is 0 when divided
            if(num%i == 0) sum += i;
        }

        if(sum == num) return(true);
        return(false);
    }
    
}
