//This is Exercise 6.25 and my name is Mbarick Traore

import java.util.Scanner;

public class MtConvertMilliseconds
{
      public static void main (String[] args)
      {
         Scanner input = new Scanner(System.in);
         
         System.out.print("Enter a Milliseconds :");
         long millis = input.nextLong();
         
         System.out.println(convertMillis(millis));
      }  
      
      public static String convertMillis(long millis)
      {
         long totalSeconds = millis/1000;
    
         long second = totalSeconds % 60;
   
         long totalMinutes = totalSeconds/60;
    
         long minute = totalMinutes %60;
    
         long totalHours = totalMinutes/60;
   
         long hour = totalHours % 24;
         
         String result = (hour + ":" + minute + ":" + second); 
         
      return result;  
     
     }  
      
}    