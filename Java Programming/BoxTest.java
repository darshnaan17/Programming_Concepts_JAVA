//I pledge my Honor that I have not cheated, and will not cheat, on this assignment
//- Darshan Vala U39780959

import java.util.Scanner;

class BoxTest
{
   public static void main(String [] args)
   {
      Scanner in = new Scanner(System.in);
      Box b1 = new Box();
      System.out.println("Box b1  :"+ b1);
   
   
      Box b2 = new Box(15.0,20.0,10.5);
      Box b3 = new Box(0.0,0.0,0.0);
      System.out.println("Box b2  :"+ b2);
      System.out.println("Box b3  :"+ b3);
      System.out.println("Enter Length for Box b3");
      double a11 = in.nextDouble();
      b3.setl(a11);
      System.out.println("Enter Width for Box b3");
      double b11 = in.nextDouble();
      b3.setw(b11);
      System.out.println("Enter Height for box b3");
      double c11 = in.nextDouble();
      b3.seth(c11);
      System.out.println("Box b3  :"+ b3);
      System.out.println("Enter Length for new item");
      double a22 = in.nextDouble();
      System.out.println("Enter Width for new item");
      double b22 = in.nextDouble();
      System.out.println("Enter Height for new item");
      double c22 = in.nextDouble();
   
      if((b1.getl()>a22)&&(b1.getw()>b22)&& (b2.geth()>c22))
      {
         b1.setf(true);
         System.out.println("Item can fit in Box1");
      }
      else if((b2.getl()>a22)&&(b2.getw()>b22)&& (b2.geth()>c22))
      {
         b2.setf(true);
         System.out.println("Item can fit in Box2");
      }
      else if ((b3.getl()>a22)&&(b3.getw()>b22)&& (b3.geth()>c22))
      {
         b3.setf(true);
         System.out.println("Item can fit in Box3");
      }
      System.out.println("Box b1  :"+ b1);
      System.out.println("Box b2  :"+ b2);
      System.out.println("Box b3  :"+ b3);
   }
}