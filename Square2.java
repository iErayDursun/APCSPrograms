
/**
 * Write a description of class Project2_3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.lang.*;
import java.awt.*;

public class Square2
{
    private int size, x, y, r, g, b;
    private Color c;
    
    
    public Square2(){
        size = (int)(Math.random()*100)+100;
        x = (int)(Math.random()*600);
        y = (int)(Math.random()*400);
        r = (int)(Math.random()*255);
        g = (int)(Math.random()*255);
        b = (int)(Math.random()*255);
        c = new Color(r,g,b);
    }
    
    public void draw(Graphics gr){
        gr.setColor(c);
        gr.fillRect(x,y,size,size);
    }
}
