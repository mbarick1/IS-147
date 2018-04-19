// This is exercise 6.9 homework and my name is MBarick Traore

import java.text.DecimalFormat;

public class MtConvertFeetAndMeters
{  
      public static void main(String[] args)
      {
      DecimalFormat fmt = new DecimalFormat ("0.000");
      double feet = 1.0;
      double meter = 20.0;
      
      System.out.println("Feet\tMeters\t \tMeters\tFeet");
      System.out.println("--------------------------------");
         for(feet=1.0; feet <=10.0; feet++)
         {
            System.out.println(feet+"\t"+fmt.format(footToMeter(feet))+"\t\t \t"+
                           meter+"\t\t"+fmt.format(meterToFoot(meter)));
            meter += 5.0;                  
         }
      }
           
      public static double footToMeter(double foot)
      {
      double result = 0;
      result = foot * 0.305;
      return result;
      }
      
      public static double meterToFoot(double meter)
      {
      double result = 0;
      result = meter * 3.279;
      return result;
      }
}