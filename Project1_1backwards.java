
/**
 * Eray Dursun's Time Converter (seconds -> hours, mins, + secs) 
 * 8/28/15
 */
import java.util.*;
public class Project1_1backwards
{

    public static void main (String[] args) {
        int seconds;
        int hours;
        int minutes;
        int newSeconds;
        
        Scanner scan = new Scanner(System.in); //asking user for seconds
        System.out.println("\nPlease enter the amount of seconds: ");
        seconds = scan.nextInt();
        
        hours = seconds/3600; //calculating hours
        
        minutes = (seconds/60)-(hours*60); //calculating total minutes
            
        newSeconds = seconds-(hours*3600)-(minutes*60); //calculating leftover seconds
        
        
        //now telling user the result
        System.out.print("\n"+seconds+" seconds equals "+hours+" hours, "+minutes+" minutes and "+newSeconds+" seconds.");
        
        
    }
}
