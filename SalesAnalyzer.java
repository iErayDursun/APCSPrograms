
/**
 * This class can be used to analyze the sales of a group of sales people.
 * You will be completing the methods to find the total sales, average sale, 
 * min and max sale and a report that returns a table with each salesperson?s 
 * name and amount of sales.  The more challenging part of this project is 
 * to write the methods that return an array of names that meet certain criteria.
 * These methods include people with sales greater than or equal to a given 
 * amount as well as people that have the maximum sales amounts.
 * 
 * @author Eray Dursun
 * @version 11-5-15
 */
import java.util.*;
public class SalesAnalyzer
{

    private int[] sales;
    private String[] names;

    /**
     * Constructor for objects of class SalesForce.
     * @param names is the names of the salespeople.
     * @param sales is the amount of sales for each sales person.
     * Precondition: names and sales must have same length and not null.
     */
    public SalesAnalyzer(String[] names,int[]sales)
    {
        this.names = names;
        this.sales = sales;
    }

    /**
     * @return  the total sales of all sales people
     */
    public int totalSales()
    {
        int sum = 0;

        for(int x=0; x<sales.length;x++){
            sum += sales[x];
        }

        return sum;
    }

    /**
     * @return  the average sales of all sales people
     */
    public double averageSale()
    {
        int sum = 0;
        double average;
        for(int x=0; x<sales.length;x++){
            sum += sales[x];
        }
        average = sum/sales.length;
        return average;
    }    

    /**
     * @return  the maximum sales amount of all sales people
     */
    public int maxSale()
    {        
        int max = 0;
        for(int x=0; x<sales.length;x++){
            if(sales[x]>max)
                max = sales[x];
        }
        return max;
    }

    /**
     * @return  the minimum sales amount of all sales people
     */
    public int minSale()
    {           
        int min = maxSale();
        for(int x=0; x<sales.length;x++){
            if(sales[x]<maxSale() && sales[x]<min)
                min = sales[x];
        }
        return min;
    }

    /**
     * @param n is the minimum sales amount to be counted   
     * @return  the number of sales amounts that are greater or equal to n.
     */
    public int numSalesAtOrAbove(int n)
    {
        int count = 0;
        for(int x=0; x<sales.length;x++){
            if(sales[x]>=n)
                count++;
        }
        return count;
    }

    /** 
     * @return  an array of the names of the people with maximum sales.
     */
    public String[] maxSalesPeople()
    {   
        String[] maxSalesArray = new String[numSalesAtOrAbove(maxSale())];
        for(int x=0; x<names.length; x++){
            if(sales[x]==maxSale())
                for(int y=0; y<maxSalesArray.length; y++)
                    maxSalesArray[y] = names[x];
        }
        return maxSalesArray;
    }

    /**
     * @param n is the minimum sales amount for sales person to be included   
     * @return an array of strings of the names of salespeople that have sales
     *  that are greater than or equal to n.
     */
    public String[] peopleWithSalesAtOrAbove(int n)
    {       
        String [] atOrAbove = new String [numSalesAtOrAbove(n)];
        int count = 0;
        for(int x=0; x<names.length; x++){
            if(sales[x]>=n){
                atOrAbove[count] = names[x];
                count++;
            }
        }
        return atOrAbove;   
    }

    /**
     * @return a string that, when printed, creates a table of salespeople and sales amounts.
     */
    public String report()
    {
        String s = null;
        for(int x=0;x<names.length;x++){
            s= "Salesperson   Sales\n"+
                "--------------------\n" + names[x]+"\t\t"+sales[x];
        }
        return s;

    }
}
