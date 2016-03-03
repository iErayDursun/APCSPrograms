
/**
 * Write a description of class Expense_Planner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
import java.text.*;
public class Expense_Planner
{
    public static void main(String[]args) {
        int eachMonth;
        int month = 0;
        int savings = 0;
        String input = "nothing", inputDescription;
        int inputCost;

        NumberFormat dollar = NumberFormat.getCurrencyInstance(Locale.US);

        Queue<Item> queue = new LinkedList<Item>();
        //ListIterator<Item> iter = queue.listIterator();

        String mth[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        System.out.print("Please enter a fixed amount of discretionary money that is set aside each month: ");
        Scanner scan = new Scanner(System.in);
        eachMonth = scan.nextInt();

        while(!input.equals("q") && !input.equals("Q")) {
            if(month==12)
                month = 0;
            System.out.println(mth[month]+" -- Savings: "+dollar.format(savings));
            System.out.print("Enter an item description, N to move to the next month or Q to quit. ");
            input = scan.next();
            if(input.equals("N") || input.equals("n")) {
                savings+=eachMonth;
                while (queue.isEmpty()==false && savings>=queue.peek().getCost()) {
                    savings-=queue.peek().getCost();
                    System.out.println("Purchased Item: "+queue.peek().getDescription());
                    System.out.println("Cost: "+queue.remove().getCost());
                }
                month++;
            }
            else if(input.equals("Q") || input.equals("q")) {

            }
            else {
                inputDescription = input;
                System.out.print("Cost: ");
                inputCost = scan.nextInt();
                Item item = new Item(inputDescription, inputCost);
                if(savings>inputCost)
                    savings-=inputCost;
                else
                    queue.add(item);
            }
        }
    }
}