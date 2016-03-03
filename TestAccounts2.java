/**
 * testing consolidation
 */
import java.util.*;
public class TestAccounts2 {
    public static void main(String[]args) {
        String name1, name2, name3;
        Scanner scn = new Scanner(System.in);
        
        //input names
        System.out.println("You will be inputting three names that will have an account opened for them with $100 initial balance");
        System.out.print("Please enter name1: ");
        name1 = scn.nextLine();
        System.out.print("Please enter name2: ");
        name2 = scn.nextLine();
        System.out.print("Please enter name3: ");
        name3 = scn.nextLine();
        
        //create accounts
        Account a = new Account(100, name1);
        Account b = new Account(100, name2);
        Account c = new Account(100, name3);
        
        //prints accounts
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
        //create consolidated account and close first one
        a.close();
        Account d = Account.consolidate(b,c);
        
        //print accounts again
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}