//This is Exercise 9.6 and my name is MBarick Traore

//Test Progam

import java.util.*;

public class TestStopWatchMt
{
      public static void main(String[] args)
      {   
         Random rand = new Random();
        
         int size = 100000;
         double[] numbers = new double[size];
         
         for(int i = 0; i < numbers.length; i++)
         {
            numbers[i] = rand.nextInt(numbers.length);
         }
         
         StopWatchMt timer = new StopWatchMt();
         
         timer.start();
         
         java.util.Arrays.sort(numbers);
         
         timer.stop();
         
         System.out.println(timer.getElapsedTime() + " Milliseconds to sort");
                          
      }
}
