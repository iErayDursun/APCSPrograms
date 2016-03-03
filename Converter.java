 /**
 * Eray Dursun
 * Project 2.4 Converter class
 * 9/21/15
 * A class that converts money from US Dollars to Euros, Yen, and British Pounds
 * 
 * Any comments or feedback on how to make this more efficient would be much appreciated.
 */
import java.util.*;
import java.text.*;

public class Converter {
    private final double dollarsToEuro = 0.9; //conversion factors
    private final double dollarsToYen = 120.07;
    private final double dollarsToPounds = 0.65;
    private int currency;
    private double input, output, Euros, Yen, Pounds; //
    public String type;
    
    Scanner scan = new Scanner (System.in);
    DecimalFormat df = new DecimalFormat("#.##");

    public Converter () {
        currency = 0;
        Euros = 0;
        Yen = 0;
        Pounds = 0;
        output = 0;
        type = "dollars";
    }
    
    public int getCurrency() {
        System.out.println("What currency would you like this amount converted to?"); //asks for desired currency
        System.out.println("1 - Euros\n2 - Japanese Yen\n3 - British Pounds");
        currency = scan.nextInt();
        
        int check=0;
        while (check==0) {
            if (currency > 0 && currency <= 3) {
                check=1;
                if (currency==1) {
                    type = "Euros";
                }
                else if (currency==2) {
                    type = "Japanese Yen";
                }
                else {
                    type = "British Pounds";
                }
            }
            else {
                System.out.println("Your input is invalid, please try again.");
            }
        }
        
        return currency;
    }
    
    
    
    public void Euros (double dollars2) {
        input = dollars2;
        output = dollars2 * dollarsToEuro;
    }

    public void Yen (double dollars2) {
        input = dollars2;
        output = dollars2 * dollarsToYen;
    }

    public void Pounds (double dollars2) {
        input = dollars2;
        output = dollars2 * dollarsToPounds;
    }
    
    public String toString(){
        return ("$"+input+" equals about "+df.format(output)+" "+type);
    }
}