//This is Exercise 9.6 and my name is MBarick Traore
//Class 
public class StopWatchMt
{
   private long startTime;
   private long endTime;
   
   public StopWatchMt()
   {
      startTime = System.currentTimeMillis();
   }
   
   public void start()
   {
      startTime = System.currentTimeMillis();
   }
   
   public void stop()
   {
      endTime = System.currentTimeMillis();
   }
   
   public long getElapsedTime()
   {
      return endTime - startTime;
   }
   
}