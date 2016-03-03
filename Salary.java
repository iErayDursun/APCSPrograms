/*Complete the following program to determine the raise and new salary for an employee by adding if ... else statements to 
compute the raise. The input to the program includes the current annual salary for the employee and a number indicating 
the performance rating (1=excellent, 2=good, and 3=poor). An employee with a rating of 1 will receive a 6% raise, an 
employee with a rating of 2 will receive a 4% raise, and one with a rating of 3 will receive a 1.5% raise. 
*/
// ***************************************************************
//   Salary.java
//   Computes the raise and new salary for an employee
//   Completed by Eray Dursun
// ***************************************************************
import java.util.Scanner;

public class Salary
{
   public static void main (String[] args)
   {
      double currentSalary;  // current annual salary
      double rating;         // performance rating
      double raise = 0;          // dollar amount of the raise

       Scanner scan = new Scanner(System.in);

      // Get the current salary and performance rating
      System.out.print ("Enter the current salary: ");
      currentSalary = scan.nextDouble();
      System.out.print ("Enter the performance rating: ");
      rating = scan.nextDouble();

      // Compute the raise -- Use if ... else ...
      
      if (rating==1) 
        raise = currentSalary*.06;
      else if(rating==2)
        raise = currentSalary*.04;
      else if(rating==3)
        raise = currentSalary*.015;
      else
        System.out.println("You did not input an acceptable performance rating.");
        
      // Print the results
      System.out.println ("Amount of your raise: $" + raise);
      System.out.println ("Your new salary: $" + (currentSalary + raise));
   }
}