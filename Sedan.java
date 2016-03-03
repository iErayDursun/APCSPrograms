
/**
 * Write a description of class Sedan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sedan extends Car
{
    private int cost, year;

    public Sedan(String manufacturer, String model, int year, int cost){
        super(manufacturer, model, year);
        this.cost = cost;
    }

    public String toString(){
        return(super.toString()+" is a sedan that costs "+cost+" dollars.");
    }

    public int miles(){
        if(super.getYear()>2014) 
            return 10000;
        else if (year>2007)
            return 60000;
        else
            return 100000;
    }
}
