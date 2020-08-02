//I pledge my Honor that I have not cheated, and will not cheat, on this assignment
//- Darshan Vala U39780959
import java.util.Scanner;

public class SumDiag
{
   public static void main (String [] args)
   {
      double nums [] [] = new double [4] [4];
      
      nums = fillArray (nums);
      
      displayArray (nums);
      
      diagnolSum (nums);
   } 
      
   private static void displayArray (double [] [] nums)
   {
      for (int i = 0; i < 4; i++)
      {
         for (int d = 0; d < 4; d++)
         {
            System.out.print (nums [i] [d] + " ");
         }
         System.out.println ("");
      }
   }
   public static void diagnolSum (double [] [] nums)
   {
      double total = 0;
            
      for (int i = 0; i < 4; i++)
            
         total += nums [i] [i];
            
      System.out.println("Sum of the elements in the major diagonal is " + total);
   }
         
   public static double [] [] fillArray (double [] [] nums)
   {
      Scanner in = new Scanner(System.in);
            
      System.out.print("Enter a 4 by 4 matrix row by row: ");
            
      for (int i = 0; i < 4; i++)
            
         for (int d = 0; d < 4; d++)
            
            nums [i] [d] = in.nextDouble();
            
      return nums;
   }
}
