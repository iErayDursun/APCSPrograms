
/**
 * Write a description of class CarRunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CarRunner
{
    public static void main (String[]args) {
        Car car1 = new Sedan("Audi", "S6", 2007, 20000);
        Car car2 = new SUV("GMC", "Yukon", 2016, 48165);
        
        System.out.println(car1 +" Also, it has "+car1.miles() + " miles.");
        System.out.println(car2 + " Also, it has "+car2.miles() + " miles.");
        
        // (Sedan)(Car).get
    }
}
