//I pledge my Honor that I have not cheated, and will not cheat, on this assignment
//- Darshan Vala U39780959

import java.util.Scanner;

public class CountIntegers
{
   public static void main (String [] args)
   {
      int count = 0, t = 0;
      Scanner in = new Scanner(System.in);
     
      int num [] = new int [25];
      int temp1 [] = new int [25];
      int temp2 [] = new int [25];
     
      System.out.println("Enter 25 integers in range of 1 to 25");
     
      while (true)
      {
         int i = in.nextInt();
        
         if (i >= 1 && i <= 25)
         {
            num [count] = i;
           
            count++;
         }
         else 
           
            System.out.println("Number must be between 1 and 25");
           
         if (count >= 25)
           
            break;
           
      }
      for (int d = 0; d < 25; d++)
      {
         boolean dup = true;
           
         int i = num [d];
           
         for (int x = 0; x < 25; x++)
         {
            if (i == temp1 [x])
            {
               dup = false;
            }
         }
           
         if (dup)
         {
            temp1 [t] = i;
              
            t++;
              
         }
      }
        
      for (int d = 0; d < 25; d++)
      {
         int occur = 0;
         int i = temp1 [d];
           
         for (int x = 0; x < 25; x++)
         {
            if (i == num [x])
            {
               occur++;
            }
         }
           
         temp2 [d] = occur;
      }
      System.out.println("\nNumber   Times"); 
           
      for (int d = 0; d < t; d++)
      {
         System.out.printf(" %2d%9d\n", temp1[d], temp2 [d]);
      } 
           
      in.close(); 
   }
}
