import java.util.*;
class Area
{
   void calculateArea(int x)
   {
      System.out.println("The area of square is"+x*x+"sq units.");
   }
   void calculateArea(float x,float y)
   {
      System.out.println("The area of rectangle is"+x*y+"sq units."); 
   }
   void calculateArea(double r)
   {
      double area=3.14*r*r;
      System.out.println("The area of rectangle is"+area+"sq units."); 
   }
   public static void main(String args[])
   {
       int s;
       float l,b;
       double r;
       Area obj=new Area();
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the side of the square");
       s=sc.nextInt();
       obj.calculateArea(s);
       System.out.println("enter the length and breadth of the rectangle");
       l=sc.nextFloat();
       b=sc.nextFloat();
       obj.calculateArea(l,b);
       System.out.println("enter the radius of the circle");
       r=sc.nextDouble();
       obj.calculateArea(r);
    }       
}

