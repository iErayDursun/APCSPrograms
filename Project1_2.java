/**
 * Eray Dursun's Charge Account Statement
 * Project 1.2
 * 9/2/15
 */
import java.util.*;
import java.text.*;
public class Project1_2
{

    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in); //initialize Scanner
        double prevBalance, addCharges, interest=0, newBalance, minPayment=0; //initializing variables needed for calculating the statement
        
        System.out.print("Please enter previous balance on the account: $"); //getting previous balance
        prevBalance = scan.nextDouble();
        
        System.out.print("Please enter total amount of additional charges this month: $"); //getting additional charges
        addCharges = scan.nextDouble();
        
        newBalance = prevBalance+addCharges; //calculating new balance
        
        if (prevBalance==0) { //finding out what the interest should be
            interest=0;
        }
        else if (prevBalance>0) {
            interest=newBalance*.18;
        }
        
        newBalance+=interest;
        
        if (newBalance<50) { //finding out what the minimum payment is
            minPayment=newBalance;
        }
        else if (newBalance>=50 && newBalance<=300) {
            minPayment=50;
        }
        else if (newBalance>300) {
            minPayment=newBalance*.2;
        }
        NumberFormat fmt = NumberFormat.getCurrencyInstance(); //number formatting
        
        //printing information to user
        System.out.println("CS International Statement\n===============================\nPrevious Balance\t"+fmt.format(prevBalance));
        System.out.println("Additional Charges:\t"+fmt.format(addCharges)+"\nInterest:\t\t"+fmt.format(interest)+"\nNew Balance:\t\t"+fmt.format(newBalance)+"\nMininum Payment:\t"+fmt.format(minPayment));
    }
}
