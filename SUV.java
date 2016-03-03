/**
 * Write a description of class Sedan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SUV extends Car
{
    private int cost, year;

    public SUV(String manufacturer, String model, int year, int cost){
        super(manufacturer, model, year);
        this.cost = cost;
    }

    public String toString(){
        return(super.toString()+" is an SUV that costs "+cost+" dollars.");
    }

    public int miles(){
        if(super.getYear()>2014) 
            return 5000;
        else if (year>2007)
            return 30000;
        else
            return 50000;
    }
}
