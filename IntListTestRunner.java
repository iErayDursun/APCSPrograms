// *************************************************************
//   IntListTest.java
//
//   Driver to test IntList methods.
// *************************************************************

import java.util.Scanner;

public class IntListTestRunner
{
    private static Scanner scan;
    private static IntList list = new IntList();

    //----------------------------------------------------------------
    // Creates a list, then repeatedly prints the menu and does what 
    // the user asks until they quit.
    //----------------------------------------------------------------
    public static void main(String[] args)
    {
        scan = new Scanner(System.in);
        printMenu();
        int choice = scan.nextInt();
        while (choice != 0)
        {
            dispatch(choice);
            printMenu();
            choice = scan.nextInt();

        }
    }

    //----------------------------------------
    //  Does what the menu item calls for.
    //----------------------------------------
    public static void dispatch(int choice)
    {
        int newVal;
        int oldVal;
        switch(choice)
        {
            
            
            case 0: 
            System.out.println("Bye!");
            break;

            case 1:    //add to front
            System.out.println("Enter integer to add to front");
            newVal = scan.nextInt();
            list.addToFront(newVal);
            break;

            case 2:   //add to end
            System.out.println("Enter integer to add to end");
            newVal = scan.nextInt();
            list.addToEnd(newVal);
            break;

            case 3:  //remove first element
            list.removeFirst();
            break;
            

            case 4:  //print
            list.print();
            break;
            
            case 5: //print # of entries
            System.out.println("There are "+list.length()+" entries in the list.");
            break;
            
            case 6:
            System.out.println(list);
            break;
            
            case 7:
            list.removeLast();
            System.out.println("Removed last value from list.");
            break;
            
            case 8:
            System.out.print("Please enter a number to replace (x)");
            oldVal = scan.nextInt();
            System.out.print("Please enter a number to replace with (y)");
            newVal = scan.nextInt();
            list.replace(oldVal,newVal);
            System.out.println("Success");
            break;
            
            default:
            System.out.println("Sorry, invalid choice");
        }
    }

    //----------------------------------------
    //  Prints the user's choices
    //----------------------------------------
    public static void printMenu()
    {
        System.out.println("\n   Menu   ");
        System.out.println("   ====");
        System.out.println("0: Quit");
        System.out.println("1: Add an integer to the front of the list");
        System.out.println("2: Add an integer to the end of the list");
        System.out.println("3: Remove an integer from the front of the list");
        System.out.println("4: Print the list");
        System.out.println("5: Print the number of elements in the list");
        
        System.out.println("6: Print the list via toString method");
        
        System.out.println("7: Remove the last element from the list.");
        
        System.out.println("8: Replace all occurences of x with the value of y.");

        System.out.print("\nEnter your choice: ");
    }
}