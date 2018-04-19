// This is  Exercise 6.1 for lab and my name is MBarick Traore

public class MtPentagonalNumbers
{
      public static void main(String[] args)
      {
          int count = 1;
          for(int number = 1; number <= 100; number++ )
          {
               if(count <= 10)
               {
                  System.out.print(getPentagonalNumber(number)+ " ");
                  count++;
               }
               else
               {
                  System.out.println("");
                  count = 1;
               }
          }          
      }
      
      public static int getPentagonalNumber(int n)
      { 
          int pentNumber = n*(3*n - 1)/2 ;
               
      return pentNumber;
      }
}