
/**
 * Abstract class Car - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Car
{
    private String manufacturer;
    private String model;
    private int year;
    
    public Car(String brand, String type, int yr) {
        manufacturer = brand;
        model = type;
        year = yr;
    }
    
    public void setManufacturer(String input) {
        manufacturer = input;
    }
    
    public void setModel(String input) {
        model = input;
    }
    
    public void setYear(int input) {
        year = input;
    }
    
    public String getManufacturer() {
        return manufacturer;
    }
    
    public String getModel() {
        return model;
    }
    
    public int getYear() {
        return year;
    }

    public String toString() {
        return(manufacturer+" "+model+" "+year);
    }
    
    abstract public int miles();
}

