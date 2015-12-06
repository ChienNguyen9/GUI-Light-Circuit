// COSC 1320 Fall 2015 
// Chien Nguyen
// Programming Assignment 2
// This is my own work; I will not post

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class OpenCircuit extends JPanel
{   
    private String batteryString;
    private String titleString;
    private String switchLabelString;
    private String lightbulbString;
    
    public void paint(Graphics g)
    {
        super.paint(g);
        setBackground(Color.WHITE);
        setLayout(null);

        LabelNames name = new LabelNames();   
        name.openFile();
        name.readFile();
        name.setArray(titleString, batteryString, switchLabelString, lightbulbString);

        JLabel battery = new JLabel(name.getBattery());
        battery.setBounds(225, 15, 300, 300);
        add(battery);
        
        JLabel switchLabel = new JLabel(name.getSwitch());      
        switchLabel.setBounds(410, -30, 300, 300);
        add(switchLabel);
        
        JLabel title = new JLabel(name.getTitle());
        title.setBounds(300, -230, 500, 500);
        add(title);

        JLabel lightbulb = new JLabel(name.getLightbulb());
        lightbulb.setBounds(550, 50, 200, 200);
        add(lightbulb);
        
        name.closeFile();
        
        
        //Power Suppy
        g.setColor(Color.BLACK);
        g.drawLine(300, 50, 300, 150);
        g.setColor(Color.BLACK);
        g.drawLine(275, 75, 275, 125);
        g.setColor(Color.BLACK);
        g.drawLine(250, 50, 250, 150);
        g.setColor(Color.BLACK);
        g.drawLine(225, 75, 225, 125);
        //Power Suppy image ends
        
        //Switch
        g.setColor(Color.BLACK);
        g.drawLine(400, 100, 500, 50);
        //Light Bulb
        g.setColor(Color.BLACK);
        g.fillOval(550, 80, 50, 50);
        
        g.setColor(Color.BLACK);
        g.drawLine(300, 100, 400, 100);
        
        g.setColor(Color.BLACK);
        g.drawLine(500, 100, 550, 100);
        g.setColor(Color.BLACK);
        g.fillOval(550, 80, 50, 50);
        
        g.setColor(Color.BLACK);
        g.fillOval(480, 90, 20, 20);
        
        g.setColor(Color.BLACK);
        g.drawLine(600, 100, 650, 100);
        
        g.setColor(Color.BLACK);
        g.drawLine(650, 100, 650, 500);
        
        g.setColor(Color.BLACK);
        g.drawLine(650, 500, 50, 500);
        
        g.setColor(Color.BLACK);
        g.drawLine(50, 500, 50, 100);
        
        g.setColor(Color.BLACK);
        g.drawLine(50, 100, 225, 100);
        
    }
}
