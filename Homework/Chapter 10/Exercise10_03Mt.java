import java.util.Scanner;
public class Exercise10_03Mt
{
  public static void main(String[] args)
  {
      String another ="yes";
      Scanner again= new Scanner(System.in);
      Scanner numInput= new Scanner(System.in);
    
      while (another.equalsIgnoreCase("yes")||another.equalsIgnoreCase("y"))
      {
      System.out.println("Enter two integers separated by a space");
      int number1 = numInput.nextInt();
      int number2 = numInput.nextInt();
      
      //use the 2 integers to create 2 MyInteger objects named num1 and num2.
      //remember you have to use "new" to instantiate each
      MyInteger num1 = new MyInteger(number1);
      MyInteger num2 = new MyInteger(number2);      
      
      //use the METHODS below to print out 
      
      //if num1 is even, odd, prime:
      System.out.println(num1.getValue()+" is even is "+ num1.isEven());
      System.out.println(num1.getValue()+" is odd is "+ num1.isOdd());
      System.out.println(num1.getValue()+" is prime is "+ num1.isPrime());

      //if num2 is even, odd, prime
      System.out.println(num2.getValue()+" is even is "+ num2.isEven());
      System.out.println(num2.getValue()+" is odd is "+ num2.isOdd());
      System.out.println(num2.getValue()+" is prime is "+ num2.isPrime());

      //if the num1 and num2 objects are equal.
      System.out.println(num1.getValue()+" = "+ num2.getValue()+" is " +
                         num1.equals(num2.getValue()));
         
      System.out.println("Do you want to do another set?");
      another=again.nextLine();
      } 
   }
}

class MyInteger {
  private int value;

  public int getValue() {
    return value;
  }

  public MyInteger(int value) {
    this.value = value;
  }

  public boolean isPrime() {
    return isPrime(value);
  }

  public static boolean isPrime(int num) {	
    if ((num == 1) || (num == 2)) {
      return true;
    }

    for (int i = 2; i <= num / 2; i++) {
      if (num % i == 0) {
        return false;
      }
    }

    return true;
  }

  public static boolean isPrime(MyInteger o) {
    return isPrime(o.getValue());
  }

  public boolean isEven() {
    return isEven(value);
  }
  
  public boolean isOdd() {
	return isOdd(value); 
  }
  
  public static boolean isEven(int n) {
    return n % 2 == 0;
  }
  
  public static boolean isOdd(int n) {
	return n % 2 != 0;
  }

  public static boolean isEven(MyInteger n) {
    return isEven(n.getValue());
  }

  public boolean equals(int anotherNum) {
    return value == anotherNum;
  }

  public boolean equals(MyInteger o) {
    return value == o.getValue();
  }

  public static int parseInt(char[] numbers) {
    // numbers consists of digit characters.
    // For example, if numbers is {'1', '2', '5'}, the return value
    //  should be 125. Please note that
    // numbers[0] is '1'
    // numbers[1] is '2'
    // numbers[2] is '5'

    int result = 0;
    for (int i = 0; i < numbers.length; i++) {
      result = result * 10 + (numbers[i] - '0');
    }

    return result;
  }

  // You may mention this when you covered Ch8
  public static int parseInt(String s) {
    // s consists of digit characters.
    // For example, if s is "125", the return value
    //  should be 125.
    int result = 0;
    for (int i = 0; i < s.length(); i++) {
      result = result * 10 + (s.charAt(i) - '0');
    }

    return result;
  }
}