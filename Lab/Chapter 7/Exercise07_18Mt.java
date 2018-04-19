//This is Exeercise 7.18 and my name is MBarick Traore

// Bubble sort

public class Exercise07_18Mt//replace the word template with your initials
{
  public static void main (String[] args)
   {
    //create an input double array list anmed mylist with some values
   
    double[] mylist = { 2.0, 6.0, 5.6, 1.5, 3.0, 5.7, 2.5, 9.5, 7.0, 1.0};
    
    System.out.println("My list before sort is: ");
    //printList the original list
    printList(mylist);
    
    System.out.print("\n");
    
    //Sort the list
    java.util.Arrays.sort(mylist);
   
    System.out.println("My list after sort is: ");
    //prints the sorted list
    printList(mylist);
    }
   
   //create a method header named printlist to accept a formal parameter of a double array 
   //create a method body to step through each array element println each element

   //printlist method header
   public static void printList(double[] array)
   {
   //for loop
      for(int i = 0; i < array.length; i++)
      {
         //println statement
         System.out.print(array[i]+ " ");
      }
   }
  
}