import java.util.*;
class TwoArray{
     public static void main(String[]args)
     {
       int a[][]=new int[5][5];
       Scanner s=new Scanner(System.in);
       System.out.println("enter the number");
       for(int i=0;i<4;i++)
       {
         for(int j=0;j<3;j++)
         {
            a[i][j]=s.nextInt();
         }
       }
       System.out.println("display the numbers");
       for(int i=0;i<5;i++)
       {
           for(int j=0;j<3;j++) 
           {
              System.out.println(a[i][j]);
           }
       } 
     }
}
    