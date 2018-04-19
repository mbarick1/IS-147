import java.util.Scanner;

import java.text.DecimalFormat;

import java.text.NumberFormat;

public class Sample
{
     public static void main (String[] args)
     {
         Scanner input = new Scanner(System.in);
         
         System.out.print("Enter a Milliseconds :");
         long = input.nextlong();
         
         System.out
     }  
      
     public static String convertMillis(long millis)
     {
         long totalSeconds = Millis/1000;
    
         long second = totalSeconds % 60;
   
         long totalMinutes = totalSeconds/60;
    
         long minute = totalMinutes %60;
    
         long totalHours = totalMinutes/60;
   
         long hour = totalHours % 24;
         
         String result = (hour + ":" + minute + ":" + second); 
         
      return result;  
     
     }  
      
}    