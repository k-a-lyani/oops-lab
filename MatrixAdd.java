import java.util.*;
 class MatrixAdd{
     public static void main(String args[]){
         int row,col,i,j;
         Scanner s=new Scanner(System.in);
         
         System.out.println("enter the no:of rows");
         row=s.nextInt();

         System.out.println("enter the no:of columns");
         col=s.nextInt();

         int matr1[][]=new int[row][col];
         int matr2[][]=new int[row][col];
         int sum[][]=new int[row][col];;

         System.out.println("enter the elements of the first matrix");
         for(i=0;i<row;i++)
         {
           for(j=0;j<col;j++)
           {
              matr1[i][j]=s.nextInt();
              System.out.println();
           }
         }
        
         System.out.println("enter the element of second matrix");
          for(i=0;i<row;i++)
         {
           for(j=0;j<col;j++)
           {
              matr2[i][j]=s.nextInt();
              System.out.println();
           }
         }
            
         
          for(i=0;i<row;i++)
         {
           for(j=0;j<col;j++)
           {
              sum[i][j]=matr1[i][j]+matr2[i][j];
              System.out.println();
           }
         }
        
         System.out.println("sum of two matrixes are");
          for(i=0;i<row;i++)
         {
           for(j=0;j<col;j++)
           {
              System.out.println(sum[i][j]+"\t");
              System.out.println();
           }
         }
}}