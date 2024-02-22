/**
 * Program description : To manage flower shop inventory efficiently
 *
 * Programmer: AinIzriq
 * Date: 22 February 2024
 */

//Import the respective package
import javax.swing.JOptionPane;

//driver class
public class FlowerShop
{
    public static void main (String[] args)
    {
        //Declaration of an array of size 10 named flowerArr
        Flower [] flowerArr = new Flower [3]; //{0,0,0}
        
        //declaration of all variables
        String name, color, str;
        int quantity;
        
        for(int i = 0; i < flowerArr.length; i++)
        {
         name = JOptionPane.showInputDialog("Enter the name for the flower" + (i+1) + ":");
          str = JOptionPane.showInputDialog("Enter the flower quantity : ");
         quantity = Integer.parseInt(str); //wrap from string to integer
         color = JOptionPane.showInputDialog("Choose color of the flowers (Type P = Pink or R = Red) ==>");
          
         if (color.equalsIgnoreCase("P"))
              color ="Pink";
          else if (color.equalsIgnoreCase("R"))
              color = "Red";
          else 
              System.out.println("Incorrect input! Please choose the correct Color!");
         
         //Instantiate each element of the array
         flowerArr[i] = new Flower();
         
         //Call the mutator to change the object state
         flowerArr[i].setFlower(name, quantity, color);
         
         //Call the toString method
         System.out.println(flowerArr[i].toString());
        } //End of for
        
        int countP = 0, countR = 0;
        
        for(int i = 0; i < flowerArr.length; i++)
        {
            if(flowerArr[i].getColor().equalsIgnoreCase("Pink"))
            countP++; //countP = countP + 1
          else if(flowerArr[i].getColor().equalsIgnoreCase("Red"))
            countR++; //countR = countR + 1
          else
            System.out.print("Incorrect color of the flower");
        } //end of for
        
        JOptionPane.showMessageDialog(null, "Count for Pink color: " + countP, "OUTPUT", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Count for Red color: " + countR, "OUTPUT", JOptionPane.INFORMATION_MESSAGE);
        
        //Search for flower name named Peony
        boolean found = false;
      for(int i = 0; i < flowerArr.length; i++)
      {
           if(flowerArr[i].getName().equalsIgnoreCase("Peony"))
           {
           flowerArr[i].setFlower("Peony", 25, "Pink");
           found = true;
           break; // No need to continue searching once found
          } 
      }//End of for
      
      if (!found) {
        JOptionPane.showMessageDialog(null, "Sorry, the name that you are searching for is not in array", "OUTPUT", JOptionPane.ERROR_MESSAGE);
      }
    } //end of main
} //end of class
