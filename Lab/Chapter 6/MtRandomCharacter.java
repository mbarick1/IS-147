// This is Exercise 6.38 and my name is MBarick Traore

public class MtRandomCharacter
{
   public static void main(String[] args)
   {
      int count = 1;
      
      for(int Letter = 1; Letter< 100; Letter++)
      {
         if(count <= 10)
         {
            System.out.print(getRandomUpperCaseLetter()+" ");
            count++;
         }
         else
         {
            System.out.println("");
            count = 1;
         }   
      }
      System.out.println("\n");
      
      for(int digit = 1; digit < 100; digit++)
      {
         if(count <= 10)
         {
            System.out.print(getRandomDigitCharacter()+" ");
            count++;
         }
         else
         {
            System.out.print("\n");
            count = 1;
         }   
      }
   
   }
   /** Generate a random character between ch1 and ch2 */
   public static char getRandomCharacter(char ch1, char ch2) 
   {
      return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
   }

   /** Generate a random lowercase letter */
   public static char getRandomLowerCaseLetter() 
   {
      return getRandomCharacter('a', 'z');
   }

   /** Generate a random uppercase letter */
   public static char getRandomUpperCaseLetter() 
   {
      return getRandomCharacter('A', 'Z');
   }

   /** Generate a random digit character */
   public static char getRandomDigitCharacter() 
   {
      return getRandomCharacter('0', '9');
   }

   /** Generate a random character */
   public static char getRandomCharacter() 
   {
      return getRandomCharacter('\u0000', '\uFFFF');
   }
}