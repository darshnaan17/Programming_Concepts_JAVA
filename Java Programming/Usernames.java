//I pledge my Honor that I have not cheated, and will not cheat, on this assignment

//- Darshan Vala U39780959


import java.util.Random;
import java.util.Scanner;
  
public class Usernames
{
   public static void main (String [] args)
   {
      Random generator = new Random();
      
      int num1;
      num1 = generator.nextInt(900) + 100;
      //System.out.println("Here's a random integer: " + num1);
     
      Scanner firstName = new Scanner(System.in);
      System.out.println("Enter your first name: ");
      String fName = firstName.nextLine();
      
      Scanner lastName = new Scanner(System.in);
      System.out.println("Enter your last name: ");
      String lName = lastName.nextLine();
      
      char ch1 = fName.charAt(0);
      String ch2 = lName.substring(0, 3);
      
      System.out.print("Username: " + ch1 + ch2 + num1);   
      
   
      
      
      
     
   }
  
  
  
}
  
