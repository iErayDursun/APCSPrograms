//*********************************************************
// VoteCounterGUI.java  
//
// Demonstrates a graphical user interface and event listeners to
// tally votes for two candidates, Joe and Sue.
// Modified by Robert Gammelgaard 10/25/2012
//*********************************************************

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class VoteCounterGUI
{
    private int WIDTH = 300;
    private int HEIGHT = 100;
    private int votesForJoe, votesForSue;
    private JFrame frame, frame2;
    private JPanel panel;
    private JButton joe, sue;
    private JLabel labelJoe, labelSue;

    //----------------------------------------------
    // Constructor: Sets up the GUI.
    //----------------------------------------------
    public VoteCounterGUI()
    {
        votesForJoe = 0;
        frame = new JFrame ("Vote Counter");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

        joe = new JButton("Vote for Joe");
        joe.addActionListener(new JoeButtonListener());

        labelJoe = new JLabel("Votes for Joe: " + votesForJoe);
        panel = new JPanel();
        panel.setPreferredSize (new Dimension(WIDTH, HEIGHT));
        panel.setBackground (Color.cyan);
        panel.add(joe);
        panel.add(labelJoe);
        frame.getContentPane().add (panel);
        
        
        //////////////////////////////////////////////////
        
        
        votesForSue = 0;

        sue = new JButton("Vote for Sue");
        sue.addActionListener(new SueButtonListener());

        labelSue = new JLabel("Votes for Sue: " + votesForSue);
        panel.add(sue);
        panel.add(labelSue);
    }
    //-----------------------------------------------------------------
    //  Displays the primary application frame.
    //-----------------------------------------------------------------
    public void display()
    {
        frame.pack();
        frame.setVisible(true);
    }
    //***************************************************
    // Represents a listener for button push (action) events
    //***************************************************
    private class JoeButtonListener implements ActionListener
    {
        //----------------------------------------------
        // Updates the counter and label when Vote for Joe 
        // button is pushed
        //----------------------------------------------
        public void actionPerformed(ActionEvent event)
        {
            votesForJoe++;
            labelJoe.setText("Votes for Joe: " + votesForJoe);
        }
    }
    
    
    private class SueButtonListener implements ActionListener
    {
        //----------------------------------------------
        // Updates the counter and label when Vote for Sue
        // button is pushed
        //----------------------------------------------
        public void actionPerformed(ActionEvent event)
        {
            votesForSue++;
            labelSue.setText("Votes for Sue: " + votesForSue);
        }
    }
}