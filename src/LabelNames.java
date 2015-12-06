// COSC 1320 Fall 2015 
// Chien Nguyen
// Programming Assignment 2
// This is my own work; I will not post

import java.io.File;
import java.util.Scanner;

public class LabelNames 
{
    private Scanner obtainData;
    private String[] array = new String[4];
    private int count = 0;
    private String subTitle;
    private String subBattery;
    private String subSwitchLabel;
    private String subLightbulb;
    
    public void openFile()
    {
        try
        {
            obtainData = new Scanner(new File("Programming Assignment 2 Data.txt"));
        }
        catch(Exception e)
        {
            System.out.println("Could not find file! ");
        }
    }
    public void readFile()
    {
        while(obtainData.hasNext())
        {
            array[count] = obtainData.nextLine();
            count++;
        }
        subTitle = this.array[0];
        subBattery = this.array[1];
        subSwitchLabel = this.array[2];
        subLightbulb = this.array[3];
    }
    public void closeFile()
    {
        obtainData.close();
    }
    public void setData()
    {
        this.array[0] = subTitle;
        this.array[1] = subBattery;
        this.array[2] = subSwitchLabel;
        this.array[3] = subLightbulb;
    }
    public void setArray(String title, String battery, String switchLabel, String lightbulb)
    {
        this.array[0] = title;
        this.array[1] = battery;
        this.array[2] = switchLabel;
        this.array[3] = lightbulb;
    }
    public String getTitle()
    {
        return subTitle;
    }
    public String getBattery()
    {
        return subBattery;
    }
    public String getSwitch()
    {
        return subSwitchLabel;
    }
    public String getLightbulb()
    {
        return subLightbulb;
    }
}
