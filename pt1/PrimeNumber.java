/**
 * @author Jayden Randhawa
 * 14/12/2021
 * This program prints whether or not a number is prime.
 */

package pt1;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        // Call the isPrime method with the inputted integer
        System.out.println(isPrime(inp.nextInt()));

        inp.close();
    }

    public static boolean isPrime(int num){
        // Check if the number is divisible by any numbers less than or equal to half of the inputted number
        for (int i = 2; i <= num/2; ++i) {
            if (num % i == 0) {
                // If it is return false
                return(false);
            }
          }
          // If it is not return true
            return(true);
    }
}