
/**
 * Write a description of class Rectangle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rectangle extends Shape
{
   private double length, width;  //length and width of rectangle

   //----------------------------------
   //  Constructor: Sets up the sphere.
   //----------------------------------
   public Rectangle(double l, double w)
   {  
      super("Rectangle");
      length = l;
      width = w;
   }

   //-----------------------------------------
   //  Returns the area of the rectangle.
   //-----------------------------------------
   public double area()
   {
       return length*width;
   }

   //-----------------------------------
   //  Returns the rectangle as a String.
   //----------------------------------- 
   public String toString()
   {
       return super.toString() + " of length " + length + " and width " + width;
   }
}
