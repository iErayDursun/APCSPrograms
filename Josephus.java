
/**
 * Write a description of class Josephus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.*;

public class Josephus
{
    // instance variables - replace the example below with your own

    public static void main (String[]args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        ListIterator iter = list.listIterator();
        int men;

        System.out.print("Please enter a number of men: ");
        Scanner scan = new Scanner(System.in);
        men = scan.nextInt();

        for(int x=1;x<=men;x++){
            iter.add(x);
        }

        iter = list.listIterator();

        for(int x=1;x<=men;x++){
            System.out.println(list);
            Collections.rotate(list,-1);
            list.removeFirst();
        }

    }
}
