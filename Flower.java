/**
 * Program description : To manage flower shop inventory efficiently
 *
 * Programmer: AinIzriq
 * Date: 22 February 2024
 */

//Import the respective package
import javax.swing.JOptionPane;

public class Flower
{
    //Declaration of instance variables
    private String name;
    private int quantity;
    private String color;
    
    //Constructor without parameter
    public Flower()
    {
        this.name = null;  //name = "" //empty string
        this.quantity = 0;
        this.color = "";
    } //end of constructor
    
    //Normal constructor with paramter
    public Flower(String name, int quantity, String color)
    {
        this.name = name;
        this.quantity = quantity;
        this.color = color;
    } //End of constructor
    
    //Accessor/Gtters/Retriever for each data member
    public String getName()
    {
        return name;
    }
    public int getQuantity()
    {
        return quantity;
    }
    public String getColor()
    {
        return color;
    } //end of accessor
    
    //Mutators (setters) that set all the data members
    public void setFlower(String name, int quantity, String color)
    {
        this.name = name;
        this.quantity = quantity;
        this.color = color;
    } //end of mutators
    
    //calcCost method
    public double calcCost(String Color)
    {
        double flowerColor_cost = 0.00;
        
        if (color.equalsIgnoreCase("P")) //Pink color flower(any type)
            flowerColor_cost = 4.50;
         else if (color.equalsIgnoreCase("R")) //Red color flower (any type)
             flowerColor_cost = 3.80;
        //end of if
        
        double cost = (quantity * flowerColor_cost);
        
        return cost;
    } //end of calcCost
    
    //to string() method
    public String toString()
    {
        return ("Flower name = "+name+
                "\nQuantity = "+quantity+
                "\nColor = "+color+
                "\nCost of Flower = "+calcCost(color));
    }//end of to string()
} //End of class
