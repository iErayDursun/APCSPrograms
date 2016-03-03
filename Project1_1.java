
/**
 * Eray Dursun 's Time Converter (hours, mins, + secs -> seconds) 
 * @version 8/28/15
 */
    import java.util.*;
public class Project1_1
{

    public static void main (String[] args) {
        int hours;
        int minutes;
        int seconds;
        int convertedSeconds;
        
        Scanner scan = new Scanner(System.in); //asking user for hours, minutes, and seconds
        System.out.println("Please enter the amount of hours: ");
        hours = scan.nextInt();
        System.out.println("Please enter the amount of minutes: ");
        minutes = scan.nextInt();
        System.out.println("Please enter the amount of seconds: ");
        seconds = scan.nextInt();
        
        convertedSeconds = 3600*hours + minutes*60 + seconds; //converted inputed values into seconds
        
        //now telling user the result
        System.out.print("\nThe amount of seconds in "+hours+" hours, "+minutes+" minutes and "+seconds+" seconds is: "+convertedSeconds);
        
        
    }
}
