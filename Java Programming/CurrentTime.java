//I pledge my Honor that I have not cheated, and will not cheat, on this assignment

//- Darshan Vala U39780959

import java.util.Scanner;
public class CurrentTime
{
   public static void main (String [] args)
   {
      Scanner scan = new Scanner (System.in);
      
      long totalMilliSecs = System.currentTimeMillis();
      long totalSecs = totalMilliSecs / 1000;
      long totalMins = totalSecs / 60;
      long totalHrs = totalMins / 60;
      
      long currentSec = (totalSecs % 60);
      long currentMin = (totalMins % 60);
      long currentHr = (totalHrs - 4) % 24;
      
      System.out.println("The current time is: " + currentHr + ":" + currentMin + ":" + currentSec + " EST");
      
      
      
      
   
   }


}