//I pledge my Honor that I have not cheated, and will not cheat, on this assignment
//- Darshan Vala U39780959

import javax.swing.JOptionPane;

public class Geometric
{
   public static void main (String [] args)
   {
      String input;
      int selection, again;
      double gon = 0;
     
      do
      {
         menu();
         input = JOptionPane.showInputDialog("Enter your choice: ");
         selection = Integer.parseInt(input);
      
         if (selection >= 1 && selection <= 3)
         {
            input = JOptionPane.showInputDialog("Enter the order number (>= 1): ");
            gon = Double.parseDouble(input);
         
            while (gon <= 1)
            {
               input = JOptionPane.showInputDialog("The number should be greater than or equal to 1. "
                                                      + "Re-enter the order number: ");
               gon = Double.parseDouble(input);
               
            }
         }
         
         switch (selection)
         {
            case 1: JOptionPane.showMessageDialog(null, "The number in position " + gon + " of the pentagonal series is" + calcPenta(gon));
                     
               break;
               
            case 2: JOptionPane.showMessageDialog(null, "The number in position " + gon + " of the hexagonal series is" + calcHexa(gon));
            
               break;
                     
            case 3: JOptionPane.showMessageDialog(null, "The number in position " + gon + " of the octagonal series is" + calcOcta(gon));
               
               break;
            
            default: JOptionPane.showMessageDialog(null,
                  "That is an invalid option.");
         
            
         }   
         again = JOptionPane.showConfirmDialog(null, "Would you like to select option?",
                                                      "Try again?", JOptionPane.YES_NO_OPTION);
               
      }
               while (again != JOptionPane.NO_OPTION);
      System.exit(0);
               
               
   }
   
   public static void menu()
   {
      JOptionPane.showMessageDialog(null, "1. Pentagonal Number\n" +
                                                      "2. Hexagonal Number\n" +
                                                      "3. Octagonal Number");
               
   }
               
   public static double calcPenta (double gon)
   {
      return ((3 * (gon * gon) - gon) / 2);
               
   }
               
   public static double calcHexa (double gon)
   {
      return gon * ( 2 * gon - 1);
               
   }
               
   public static double calcOcta (double gon)
   {
      return (3 * (gon * gon) - (2 * gon));
               
   }
   
               
}