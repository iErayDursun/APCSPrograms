// ******************************************************************
//   CirclePanel.java
//
//   A panel with a circle drawn in the center and buttons on the 
//   bottom that move the circle.
// ******************************************************************
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CirclePanel extends JPanel
{
    private final int CIRCLE_SIZE = 50;
    private int x,y;
    private Color c;

    //---------------------------------------------------------------
    // Set up circle and buttons to move it.
    //---------------------------------------------------------------
    public CirclePanel(int width, int height)
    {
        // Set coordinates so circle starts in middle
        x = (width/2)-(CIRCLE_SIZE/2);
        y = (height/2)-(CIRCLE_SIZE/2); 

        c = Color.green;

        // Need a border layout to get the buttons on the bottom
        this.setLayout(new BorderLayout());

        // Create buttons to move the circle
        JButton left = new JButton("Left");
        JButton right = new JButton("Right");
        JButton up = new JButton("Up");
        JButton down = new JButton("Down");

        JButton blue = new JButton("Blue");
        blue.setForeground(Color.blue);
        JButton red = new JButton("Red");
        red.setForeground(Color.red);

        JButton ColorChooser = new JButton("Choose Color");

        JButton green = new JButton("Green");
        green.setForeground(Color.green);
        JButton yellow = new JButton("Yellow");
        yellow.setForeground(Color.yellow);

        // Add listeners to the buttons
        left.addActionListener(new MoveListener(-20,0));
        right.addActionListener(new MoveListener(20,0));
        up.addActionListener(new MoveListener(0,-20));
        down.addActionListener(new MoveListener(0,20));

        blue.addActionListener(new ColorListener("blue"));
        red.addActionListener(new ColorListener("red"));

        ColorChooser.addActionListener(new ColorListener(null));

        green.addActionListener(new ColorListener("green"));
        yellow.addActionListener(new ColorListener("yellow"));

        // Need a panel to put the buttons on or they'll be on
        // top of each other.
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(left);
        buttonPanel.add(right);
        buttonPanel.add(up);
        buttonPanel.add(down);

        JPanel colorPanel = new JPanel();
        colorPanel.add(blue);
        colorPanel.add(red);
        colorPanel.add(ColorChooser);
        colorPanel.add(green);
        colorPanel.add(yellow);

        // Add the button panel to the bottom of the main panel
        this.add(buttonPanel, BorderLayout.SOUTH);
        this.add(colorPanel, BorderLayout.NORTH);

    }

    //---------------------------------------------------------------
    // Draw circle on CirclePanel
    //---------------------------------------------------------------
    public void paintComponent(Graphics page)
    {
        super.paintComponent(page);

        page.setColor(c);
        page.fillOval(x,y,CIRCLE_SIZE,CIRCLE_SIZE);
    }

    //---------------------------------------------------------------
    // Class to listen for button clicks that move circle.
    //---------------------------------------------------------------
    private class MoveListener implements ActionListener
    {
        private int dx;
        private int dy;

        //---------------------------------------------------------------
        // Parameters tell how to move circle at click.
        //---------------------------------------------------------------
        public MoveListener(int dx, int dy)
        {
            this.dx = dx;
            this.dy = dy;
        }

        //---------------------------------------------------------------
        // Change x and y coordinates and repaint.
        //---------------------------------------------------------------
        public void actionPerformed(ActionEvent e)
        {
            x += dx;
            y += dy;
            repaint();
        }
    }

    private class ColorListener implements ActionListener
    {
        private String color;
        private JButton Chooser;
        public ColorListener(String o){
            color = o;
        }

        public void actionPerformed(ActionEvent e)
        {
            if (color == "blue")
                c = Color.blue;
            if (color == "red")
                c = Color.red;
            if (color == "green")
                c = Color.green;
            if (color == "yellow")
                c = Color.yellow;
            if (color == null) {
                c = JColorChooser.showDialog(Chooser, "Pick a color", c);
            }

            repaint();
        }
    }
}