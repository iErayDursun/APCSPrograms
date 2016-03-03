
/**
 * Write a description of class Inheritance_isA here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Inheritance_isA extends Inheritance
{
    // instance variables - replace the example below with your own
    private String book;

    /**
     * Constructor for objects of class Inheritance_isA
     */
    public Inheritance_isA(String fname)
    {
        super(fname);
        book = "To Kill a Mockingbird";
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String toString()
    {
        // put your code here
        return super.toString() + ("\nMy favorite bok is: "+book);
    }
    
    public void response()
    {
        //super.ground(); doesn't work because the ground() method is private
    }
}