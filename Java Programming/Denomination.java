//I pledge my Honor that I have not cheated, and will not cheat, on this assignment
//- Darshan Vala U39780959

import java.util.Scanner;

public class Denomination
{
   public static void main (String [] args)
   {
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter monetary amount: ");
      
      double monetary, twenty, ten, five, one, quarter, dimes, nickles, pennies;
      
        
      monetary = input.nextFloat();
      
      //Calculations
      
      
      
      twenty = ((int) monetary / 20);
      monetary = monetary % 20;
      ten = ((int) monetary / 10);
      monetary = monetary % 10;
      five = ((int) monetary / 5);
      monetary = monetary % 5;
      one = ((int) monetary / 1);
      monetary = monetary % 1;
      quarter = ((int) (monetary / .25));
      monetary = monetary % .25;
      dimes = ((int) (monetary / .10));
      monetary = monetary % .10;
      nickles = ((int) (monetary / .05));
      monetary = monetary % .05;
      pennies = ((int) (monetary / .01));
      monetary = monetary % .01;
      
      
      System.out.println("That's equivalent to:");
      System.out.println(twenty + " twenty dollar bills");
      System.out.println(ten + " ten dollar bills");
      System.out.println(five + " five dollar bills");
      System.out.println(one + " one dollar bills");
      System.out.println(quarter + " quarters");
      System.out.println(dimes + " dimes");
      System.out.println(nickles + " nickles");
      System.out.println(pennies + " pennies");
      
         
      
      
      
   
   
   }



}