public class MinorOrAdult
{
      public static void main(String[] args)
      {
            int age = 13;
            
            String result = minorOrAdult(age);
            System.out.print(result);
      
      } 
      
      public static String minorOrAdult( int age)
      {
         if(age >= 18)
            return "adutl";
         else
            return "minor";
            
      }
 
}