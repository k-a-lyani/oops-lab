import java.util.*;

class area{
     double area;
     area(double r){
          area=(22*r*r)/7;
          }
     }
 
class areaofcircle{
     public static void main(String args[]){
         Scanner s=new Scanner(System.in);
         System.out.println("enter the area of radius of the circle");
         double radius=s.nextDouble();
         area a=new area(radius);
         System.out.println("area of the circle is:"+a.area);
         }
     }

