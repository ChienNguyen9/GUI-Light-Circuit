// COSC 1320 Fall 2015 
// Chien Nguyen
// Programming Assignment 2
// This is my own work; I will not post

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Application extends JFrame implements ActionListener
{
    private JButton close;
    private JButton open;
    private JPanel borderPanel;
    private JPanel buttonPanel;
    
    public Application()
    {
        super("Programming Assignment 2");
        //MyHandlerEvent myHandler = new MyHandlerEvent();
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setSize(1000,1000);       
        
        borderPanel = new JPanel();
        borderPanel.setLayout(new GridLayout(1,1));
        
        View myView = new View();
        borderPanel.add(myView);
        
        
        buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.WHITE);
        buttonPanel.setLayout(new FlowLayout());
        
        close = new JButton("Close");
        close.setBackground(Color.LIGHT_GRAY);
        close.addActionListener((ActionListener) this);
        
        buttonPanel.add(close);
        open = new JButton("Open");
        open.setBackground(Color.LIGHT_GRAY);
        open.addActionListener((ActionListener) this);
        buttonPanel.add(open);
        
        add(buttonPanel, BorderLayout.NORTH);
        
    } 
    public void setPanel(JPanel borderPanel, JPanel buttonPanel)
    {
        borderPanel = this.borderPanel;
        buttonPanel = this.buttonPanel;
    }
    public JPanel getBorderPanel()
    {
        return borderPanel;
    }
    public JPanel getButtonPanel()
    {
        return buttonPanel;
    }
    
    public void actionPerformed(ActionEvent e)
    {
        String action = e.getActionCommand();
    
        if(action.equals("Close"))
        {   
            CloseCircuit closeCircuit = new CloseCircuit();
            borderPanel.removeAll();
            borderPanel.add(closeCircuit);
            borderPanel.revalidate();
            borderPanel.repaint();
            add(borderPanel, BorderLayout.CENTER);
                  
        }
        else if(action.equals("Open"))
        {
            OpenCircuit openCircuit = new OpenCircuit();
            borderPanel.removeAll();
            borderPanel.add(openCircuit);
            borderPanel.revalidate();
            borderPanel.repaint();
            add(borderPanel, BorderLayout.CENTER);
        }
        else
        {
            System.out.println("Unexpected Error! ");
        }
    }
    
}
