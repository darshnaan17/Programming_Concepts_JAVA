//I pledge my Honor that I have not cheated, and will not cheat, on this assignment
//- Darshan Vala U39780959

import java.util.Scanner; 


public class TwelveDays 
{ 
   public static void main(String[] args) 
   { 
      Scanner scan = new Scanner(System.in);
      int lastDay = 0;
      final int max = 12;
      
      do 
      {
         System.out.print("How many days (1 to 12)? "); 
         lastDay = scan.nextInt(); 
      } 
          while (lastDay < 1 || lastDay > 12);
          
      int day = 1; 
   
      while (day <= lastDay) 
      { 
         String str1ne = "On the ";
         String str2wo = " day of Christmas my true love gave to me"; 
         String first = "st"; 
         String second = "nd"; 
         String third = "rd"; 
         String otherdays = "th"; 
                
         switch (day) // i feel like i couldve made this less tedious some way 
         { 
            case 1: 
               { 
                  System.out.println(str1ne + day + first + str2wo); 
                  break; 
               } 
                     
            case 2:
               { 
                  System.out.println(str1ne + day + second + str2wo);
                  break; 
               }
                     
            case 3: 
               { 
                  System.out.println(str1ne + day + third + str2wo);
                  break; 
               }
                     
            case 4: 
               { 
                  System.out.println(str1ne + day + otherdays + str2wo);
                  break; 
               }
                     
            case 5: 
               { 
                  System.out.println(str1ne + day + otherdays + str2wo); 
                  break; 
               }
            
            case 6: 
               {
                  System.out.println(str1ne + day + otherdays + str2wo); 
                  break; 
               }
            
            case 7: 
               { 
                  System.out.println(str1ne + day + otherdays + str2wo);
                  break;
               }
             
            case 8: 
               { 
                  System.out.println(str1ne + day + otherdays + str2wo);
                  break; 
               }
                     
            case 9: 
               { 
                  System.out.println(str1ne + day + otherdays + str2wo); 
                  break; 
               }
                     
            case 10: 
               { 
                  System.out.println(str1ne + day + otherdays + str2wo);
                  break; 
               }
                  
            case 11: 
               { 
                  System.out.println(str1ne + day + otherdays + str2wo);
                  break; 
               }
                     
            case 12: 
               {
                  System.out.println(str1ne + day + otherdays + str2wo); 
                  break; 
               } 
         } 
                     
         switch (day) 
         { 
            case 12: 
               { 
                  System.out.println("Twelve drummers drumming,");
               }
                              
            case 11: 
               {
                  System.out.println("Eleven pipers piping,"); 
               }
                              
            case 10: 
               {
                  System.out.println("Ten lords a-leaping,"); 
               }
                              
            case 9: 
               {
                  System.out.println("Nine ladies dancing,"); 
               }
                             
            case 8: 
               {
                  System.out.println("Eight maids a-milking,"); 
               } 
                              
            case 7: 
               {
                  System.out.println("Seven swans a-swimming,"); 
               }
                                
            case 6: 
               {
                  System.out.println("Six geese a-laying,"); 
               }
                                  
            case 5: 
               {
                  System.out.println("Five golden rings,"); 
               }
                              
            case 4: 
               {
                  System.out.println("Four calling birds,"); 
               }
                              
            case 3: 
               {
                  System.out.println("Three French hens,"); 
               }
                                       
            case 2: 
               {
                  System.out.println("Two turtle doves, and"); 
               }
                                         
            case 1: 
               {
                  System.out.println("A partridge in a pear tree.\n\n");
                  break; 
               } 
         } 
                               
         day++; 
      } 
                          //HOLY MOTHER OF CODE
   } 
                                           
}
