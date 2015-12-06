// COSC 1320 Fall 2015 
// Chien Nguyen
// Programming Assignment 2
// This is my own work; I will not post

import static com.sun.javafx.fxml.expression.Expression.add;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyHandlerEvent implements ActionListener
{
    private JPanel borderPanel;
    private JPanel subButtonPanel;
    private String action;
    
    public MyHandlerEvent()
    {
    }
    public void actionPerformed(ActionEvent e)
    {
        String action = e.getActionCommand();
        Application application = new Application();
        
        if(action.equals("Close"))
        {   
            CloseCircuit closeCircuit = new CloseCircuit();
            application.setPanel(borderPanel, subButtonPanel);
            
            application.getBorderPanel().removeAll();
            application.getBorderPanel().add(closeCircuit);
            application.getBorderPanel().revalidate();
            application.getBorderPanel().repaint();
            
            borderPanel = application.getBorderPanel();
                  
        }
        else if(action.equals("Open"))
        {
            OpenCircuit openCircuit = new OpenCircuit();
            application.setPanel(borderPanel, subButtonPanel);
            
            application.getBorderPanel().removeAll();
            application.getBorderPanel().add(openCircuit);
            application.getBorderPanel().revalidate();
            application.getBorderPanel().repaint();
        }
        else
        {
            System.out.println("Unexpected Error! ");
        }
    }
    public JPanel getBorderPanel()
    {
        return (this.borderPanel);
    }
    public void setBorderPanel(JPanel borderPanel)
    {
        borderPanel = this.borderPanel;
    }   
}