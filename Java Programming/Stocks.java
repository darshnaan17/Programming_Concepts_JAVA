//I pledge my Honor that I have not cheated, and will not cheat, on this assignment

//- Darshan Vala U39780959

//HW #2 

public class Stocks
{
   public static void main (String [] args)
   {
      int shares = 600;
      
      double price = 21.77;
      
      final double commision = .02;
      
      //variables
      double baseprice = shares * price;
      double commisioncost = baseprice * commision;
      double total = baseprice + commisioncost;
      
      System.out.println("The number of shares purchased is: " + shares);
      System.out.println("The current share price is: $" + price);
      System.out.println("The current commision amount is: 2.0%");
      System.out.println();
      System.out.println("The total price paid is: $" + baseprice);
      System.out.println("The commission cost is: $" + commisioncost);
      System.out.println("The total amount of the transaction is: $" + total);
      
   
   
   }


}