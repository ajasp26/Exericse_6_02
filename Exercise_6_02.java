
package exercise_6_02;

import java.util.Scanner;
/**
 * Write a method that computes the sum of the digits in an integer. 
 *
 * @author alexjasper
 */
public class Exercise_6_02 {

    /**
     * Main method will prompt user for input of an integer number 
     * and then pass the integer as an argument into the method that
     * will return the sum of the numbers of the integer.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);    
    System.out.println("Enter an integer number: ");
    int number = input.nextInt();
    System.out.println("The sum of the digits is: " + sumDigits(number));
    }
    
    public static int sumDigits(long n){
    
     int sum = 0;
     
     for(long i = n; i > 0; i /= 10){
         sum += i % 10;
     }
                
     return sum;
    }
}
