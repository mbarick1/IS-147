//This is Exercise 7.1 and my name is MBarick Traore 

import java.util.Scanner;

public class AssignGrade
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter the number of students:"); 
      int students = input.nextInt();
      int[] scores = new int[students];
      
      System.out.print("Enter " + students + " scores:"); 
      for(int i = 0; i < scores.length; i++)
      {
         scores[i] = input.nextInt();
      }
      
      int best = scores[0];
      for(int i = 0; i < students; i++)
      {
         if(scores[i]> best)
         {
            best = scores[i];
         }        
      }
      
      char grade = ' ';
      for(int i = 0; i < students; i++)
      {
         if(scores[i] >= best - 10)
         {
             grade = 'A';
             System.out.println("Student " + (i+1) + " score is " + scores[i] + " and grade is " + grade);
         }   
         else if(scores[i] >= best - 20)
         {   
            grade = 'B';
            System.out.println("Student " + (i+1) + " score is " + scores[i] + " and grade is " + grade);
         }
         else if(scores[i] >= best - 30)
         {   
            grade = 'C';
            System.out.println("Student " + (i+1) + " score is " + scores[i] + " and grade is " + grade);
         }
         else if(scores[i] >= best - 40)
         {       
            grade = 'D';
            System.out.println("Student " + (i+1) + " score is " + scores[i] + " and grade is " + grade);
         }
         else 
         {   
            grade = 'F';
            System.out.println("Student " + (i+1) + " score is " + scores[i] + " and grade is " + grade);
         }
       } 
      
       //for(int i = 0; i < students; i++)
       // {
       // System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + grade);
      // }  
           
   }
}