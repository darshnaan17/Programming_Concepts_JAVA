//I pledge my Honor that I have not cheated, and will not cheat, on this assignment
//- Darshan Vala U39780959
import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class VowelCount
{
   public static void main (String [] args)
   {
   
      while(true) //loop
      {
         int countA = 0, countE = 0, countI = 0, countO = 0, countU = 0, countY = 0; // variables
      
         String inputString;
      
         inputString = JOptionPane.showInputDialog("Enter a string of characters: ");
      
      
         for (int i = 0; i < inputString.length(); i++)
         {
            switch(inputString.charAt(i))
            {
               case 'A':
                  case 'a':
                  countA++;
                  break;
                  
               case 'E':
                  case 'e':
                  countE++;
                  break;
                     
               case 'I':
                  case 'i':
                  countI++;
                  break;
                     
               case 'O':
                  case 'o':
                  countO++;
                  break;
                     
               case 'U':
                  case 'u':
                  countU++;
                  break;
                     
               case 'Y':
                  case 'y':
                  countY++;
                  break;
                     
               default:
                  break;
            }
         }
            
            //display
         JOptionPane.showMessageDialog(null, "Number of each vowel in the string: \na: " 
                                             + countA + "\ne: " + countE + "\ni: " 
                                             + countI + "\no: " + countO + "\nu: "
                                             + countU + "\ny: " + countY);
                     
         String choice = JOptionPane.showInputDialog("Would like to enter another string?" +
                                                      "\n Enter yes or no:");
      // FINALLY!!
         if(choice.equals("no"))
          
         
            break;
      }             
      System.exit(0);          
   }
               
             
             
}
      
      
   

