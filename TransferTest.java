
/**
 * Write a description of class TransferTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class TransferTest
{
    public static void main(String[]args){
        Account acct1 = new Account(100, "John");
        Account acct2 = new Account(300, "Mary");
        Scanner scan = new Scanner(System.in);
        boolean quit = false;

        while(quit==false){
            System.out.print("Would you like to transfer from acct1 to acct2 (1), transfer from acct2 or acct1 (2), or quit (3)?");
            int action = scan.nextInt();

            if (action==1){
                System.out.print("Enter amount: ");
                double tAmount = scan.nextDouble();
                Account.transfer(acct1, acct2, tAmount);
                System.out.println(acct1);
                System.out.println(acct2);
            }
            else if (action==2){
                System.out.print("Enter amount: ");
                double tAmount = scan.nextDouble();
                Account.transfer(acct2, acct1, tAmount);
                System.out.println(acct1);
                System.out.println(acct2);
            }
            else {
                quit=true;
            }
        }
    }
}
