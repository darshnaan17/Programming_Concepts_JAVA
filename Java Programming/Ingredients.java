//I pledge my Honor that I have not cheated, and will not cheat, on this assignment
//- Darshan Vala U39780959

import java.util.Scanner;


public class Ingredients
{
   public static void main (String [] args)
   {
      final double onesugar = .03125;
      final double onebutter = .020833;
      final double oneflour = .05729167;
      
      double sugar, butter, flour;
      
      int cookies;
      
      Scanner input = new Scanner(System.in);
      
      //Prompt
      
      System.out.print("Enter the number of cookies: ");
      
      //Input Statement
      cookies = input.nextInt();
      
      sugar = onesugar * cookies;
      butter = onebutter * cookies;
      flour = oneflour * cookies;
      
      System.out.println("To make "+ cookies + " cookies, you will need");
      System.out.println(+ sugar + " cups of sugar");
      System.out.println(+ butter + " cups of butter");
      System.out.println(+ flour +" cups of flour");
   
   
   }


}