public class Exercise10_01Mt
{
   public static void main(String[] args)
   {
   /*create a new Time class object named time1 using the no-arg constructor
    and print out its hours minutes and seconds.
   
    create time2 where you use 555550000 as the actual parameter
    print out its hours minutes and seconds*/

   
    Time time1 = new Time();
    Time time2 = new Time(555550000);
   
    System.out.println("Time1 is: " + time1);
    System.out.println("Hours: "+time1.getHour()+"\nMinutes: "+
                       time1.getMinute()+"\nSeconds: "+time1.getSecond()+"\n");

    System.out.println("Time2 is: " + time2);
    System.out.println("Hours: "+time2.getHour()+"\nMinutes: "+
                       time2.getMinute()+"\nSeconds: "+time2.getSecond()+"\n");
    }
}

class Time {
  private int hour;
  private int minute;
  private int second;

  public Time() {
    this(System.currentTimeMillis());
  }

  public Time(long elapsedTime) {
    setTime(elapsedTime);
  }

  @Override
  public String toString() {
    return hour + ":" + minute + ":" + second + " GMT";
  }

  public int getHour() {
    return hour;
  }

  public int getMinute() {
    return minute;
  }

  public int getSecond() {
    return second;
  }
  
  public void setTime(long elapsedTime) {
    // Obtain the total seconds since the midnight, Jan 1, 1970
    long totalSeconds = elapsedTime / 1000;

    // Compute the current second in the minute in the hour
    second = (int)(totalSeconds % 60);

    // Obtain the total minutes
    long totalMinutes = totalSeconds / 60;

    // Compute the current minute in the hour
    minute = (int)(totalMinutes % 60);

    // Obtain the total hours
    int totalHours = (int)(totalMinutes / 60);

    // Compute the current hour
    hour = (int)(totalHours % 24);
  }
}
