//I pledge my Honor that I have not cheated, and will not cheat, on this assignment
//- Darshan Vala U39780959

import java.util.*;

class Box
{
   private double length;
   private double width;
   private double height;
   private boolean full;
   Box()
   {
      length = 11.25;
      width = 8.75;
      height=6;
      full=false;
   }
 
   Box(double l,double w,double h)
   {
      length = l;
      width = w;
      height = h;
      full = false;
   }
   void setl(double l)
   {
      length = l;
   }
   void setw(double w)
   {
      width = w;
   }
   
   void seth(double h)
   {
      height = h;
   }
   
   void setf(boolean b)
   {
      full = b;
   }
   
   double getl()
   {
      return length;
   }
   
   double getw()
   {
      return width;
   }
   
   double geth()
   {
      return height;
   }

   boolean getf()
   {
      return full;
   }
      
   public String toString()
   {
      
      if(full==true)
      
         return "Box Size is "+ length +" X " + width + " X " + height + "\n"+"  Box is Full";
      
      else
      
         return "Box Size is "+ length +" X " + width + " X " + height +"\n"+ "Box is Empty";
   }
}
