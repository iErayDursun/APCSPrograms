/**
 * Eray Dursun's Factorials Program
 * Project 1.3
 * 9/4/15
 */
import java.util.*;
public class Project1_3
{
    public static void main (String[] args) {
        int input, result=1; //initializing variables
        Scanner sc = new Scanner(System.in); //scanner
        
        System.out.print("\nPlease input a non-negative integer: "); //prompts user for input
        input = sc.nextInt(); //if user enters a negative integer, keep asking him for a non-negative one
        
        while (input<0) {
            System.out.print("A non-negative integer is required. Please try again: ");
            input = sc.nextInt();
        }
    
        for (int count=1; count<=input; count++) {
            result=result*count;
        }
        
        System.out.print("\nThe result is: " + result);
    }
}
