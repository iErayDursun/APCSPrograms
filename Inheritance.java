
/**
 * Write a description of class Inheritance_Example here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Inheritance
{
    // instance variables - replace the example below with your own
    private String name, saying;
    private int age = 25;

    /**
     * Constructor for objects of class Inheritance_Example
     */
    public Inheritance(String fname)
    {
        name = fname;
        saying = "Whatever";
    }

    public String toString()
    {
        return("My name is: " + name + " and my favorite saying is: " + saying);
    }

    public void setAge(int myAge)
    {
        age = myAge;
    }

    private void ground()
    {
        System.out.println("You're grounded!");
    }
}