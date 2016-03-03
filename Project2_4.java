/**
 * Eray Dursun
 * Project 2.4
 * 9/21/15
 * A project that involves creating a new class
 * 
 * Asks the user for money in US Dollars, and then converts it to a different currency
 * 
 * Any comments or feedback on how to make this more efficient would be much appreciated.
 */
import java.util.*;
public class Project2_4
{
    public static void main (String[] args) {
        Converter con1 = new Converter();
        Scanner scan = new Scanner(System.in);
        int currency;
        double dollars;

        System.out.print("Please input a value in US Dollars: $"); //user inputs value in US Dollars
        dollars = scan.nextDouble();
        
        currency = con1.getCurrency(); //get desired currency

        if (currency==1) {
            con1.Euros(dollars);
            System.out.print(con1);
        }
        else if (currency==2) {
            con1.Yen(dollars);
            System.out.print(con1);
        }
        else {
            con1.Pounds(dollars);
            System.out.print(con1);
        }
    }
}
