//package test;
/*
For your final exam exercise you will create a quiz application that asks the user 5 multiple choice questions, prompts for an answer,
then advises the user if their answer is correct or incorrect.  If the user provides the wrong answer the application should provide 
the user with the correct answer.  After the user completes the 5 questions the application should provide the user with a summary of
their results including the number of correct and incorrect answers as well as their score (percent).
 
The following items should be submitted:

  1. Java file containing your solution named %LastName%_%FirstName%_Final.java (example Rodgers_Tim_Final.java).  The class in 
     your .java file should be named appropriately so that the file will compile and run as submitted.
  2. Text file named %LastName%_%FirstName%_Questions.txt (example Rodgers_Tim_Questions.txt) containing the questions for your 
     solution.

Requirements:

  1. Your application must contain and use at least two custom methods in addition to the main method.
  2. Quiz Questions
        * Quiz questions and answers must be read from a file named %LastName%_%FirstName%_Questions.txt that is placed in the same 
          folder as the java file being executed.
        * Questions should be multiple choice with the number of choices presented to the user for each question ranging from 2 to 5.
        * The %LastName%_%FirstName%_Questions.txt file should contain 10 or more question & answer combinations.  The 5 questions 
          asked should be randomly selected from the questions in this file.
        * You can choose to structure the contents of your %LastName%_%FirstName%_Questions.txt file in any way you wish but keep in
          mind that it should be easy to add additional questions.  (It is not part of this exercise, but you should consider how the
          file should be structured so that questions can be programmatically added and removed.)
        * The questions can be anything you would like (ie. state capitals); your application should be built in such a way that the
          subject of the questions is irrelevant. 

Here is a sample question:

What is the state capital of Maryland:
  A.  Annapolis
  B.  Baltimore
  C.  Frederick
  D.  Ocean City
*/
// Answer key is located in the bottom of the txt file.

import java.io.*;
import java.util.*;

public class Traore_Mbarick_Final  
{
   public static void main(String[] args)throws IOException
   {
      try
      {
         //Reading text file 
         File file = new File("Traore_Mbarick_Questions.txt");  
         Scanner input = new Scanner(file);
       
         //Assigning each question and their 4 possible answers to a variable 
         String q = input.nextLine()+"\n"+input.nextLine()+"\n"+input.nextLine()+"\n"+input.nextLine()+"\n"+input.nextLine(); 
         String r = input.nextLine()+"\n"+input.nextLine()+"\n"+input.nextLine()+"\n"+input.nextLine()+"\n"+input.nextLine();
         String s = input.nextLine()+"\n"+input.nextLine()+"\n"+input.nextLine()+"\n"+input.nextLine()+"\n"+input.nextLine();
         String t = input.nextLine()+"\n"+input.nextLine()+"\n"+input.nextLine()+"\n"+input.nextLine()+"\n"+input.nextLine();
         String u = input.nextLine()+"\n"+input.nextLine()+"\n"+input.nextLine()+"\n"+input.nextLine()+"\n"+input.nextLine();
         String v = input.nextLine()+"\n"+input.nextLine()+"\n"+input.nextLine()+"\n"+input.nextLine()+"\n"+input.nextLine();
         String w = input.nextLine()+"\n"+input.nextLine()+"\n"+input.nextLine()+"\n"+input.nextLine()+"\n"+input.nextLine();
         String x = input.nextLine()+"\n"+input.nextLine()+"\n"+input.nextLine()+"\n"+input.nextLine()+"\n"+input.nextLine();
         String y = input.nextLine()+"\n"+input.nextLine()+"\n"+input.nextLine()+"\n"+input.nextLine()+"\n"+input.nextLine();
         String z = input.nextLine()+"\n"+input.nextLine()+"\n"+input.nextLine()+"\n"+input.nextLine()+"\n"+input.nextLine();
         input.close();
         
         // Putting each question and their 4 possible answers into an String array 
         String[] questions = {q, r, s, t, u, v, w, x, y, z};
     
         int times = 0; // Counting number of questions asked up to 5
         int correctCount = 0; //Counting correct answers 
         int incorrectCount = 0; //Counting incorrect answers     
         
         //Asking questions up to 5 times
         do
         {
            //Picking a random question in the array and prompt the user for answer / increment number of questions asked
            String randomPickedQuestion = questions[new Random().nextInt(questions.length)];
            print(randomPickedQuestion);
            times++;
            
            //Answering questions       
            System.out.print("\nAnswer Here:");
            String answer = new Scanner(System.in).nextLine();
            
            //Grading answwers / answer key is located in the bottom of the txt file    
            if( randomPickedQuestion == questions[0]){
               if(answer.equalsIgnoreCase("D")){
                  print("\nCongratulation. That is correct.\n");
                  correctCount++;
               }
               else{
                  print("\nSorry. That is incorrect. Correct answer was D.\n");
                  incorrectCount++;
               }         
            }
            else if(randomPickedQuestion == questions[1] ){
               if(answer.equalsIgnoreCase("A")){
                  print("\nCongratulation. That is correct.\n");
                  correctCount++;
               }
               else{
                  print("\nSorry. That is incorrect. Correct answer was A.\n");
                  incorrectCount++;
               } 
            } 
            else if(randomPickedQuestion == questions[2]){
               if(answer.equalsIgnoreCase("B")){
                  print("\nCongratulation. That is correct.\n");
                  correctCount++;
               }
               else{
                  print("\nSorry. That is incorrect. Correct answer was B.\n");
                  incorrectCount++;
               }         
            }
            else if(randomPickedQuestion == questions[3]){
               if(answer.equalsIgnoreCase("B")){
                  print("\nCongratulation. That is correct.\n");
                  correctCount++;
               }
               else{
                  print("\nSorry. That is incorrect. Correct answer was B.\n");
                  incorrectCount++;
               }         
            }
            else if(randomPickedQuestion == questions[4]){
               if(answer.equalsIgnoreCase("D")){
                  print("\nCongratulation. That is correct.\n");
                  correctCount++;
               }
               else{
                  print("\nSorry. That is incorrect. Correct answer was D.\n");
                  incorrectCount++;
               }         
            }
            else if(randomPickedQuestion == questions[5]){
               if(answer.equalsIgnoreCase("A")){
                  print("\nCongratulation. That is correct.\n");
                  correctCount++;
               }
               else{
                  print("\nSorry. That is incorrect. Correct answer was A.\n");
                  incorrectCount++;
               }         
            }
            else if(randomPickedQuestion == questions[6]){
               if(answer.equalsIgnoreCase("C")){
                  print("\nCongratulation. That is correct.\n");
                  correctCount++;
               }
               else{
                  print("\nSorry. That is incorrect. Correct answer was C.\n");
                  incorrectCount++;
               }         
            }
            else if(randomPickedQuestion == questions[7]){
               if(answer.equalsIgnoreCase("A")){
                  print("\nCongratulation. That is correct.\n");
                  correctCount++;
               }
               else{
                  print("\nSorry. That is incorrect. Correct answer was A.\n");
                  incorrectCount++;
               }         
            }
            else if( randomPickedQuestion == questions[8]){
               if(answer.equalsIgnoreCase("B")){
                  print("\nCongratulation. That is correct.\n");
                  correctCount++;
               }
               else{
                  print("\nSorry. That is incorrect. Correct answer was B.\n");
                     incorrectCount++;
               }         
            }
            else{
               if(answer.equalsIgnoreCase("A")){
                  print("\nCongratulation. That is correct.\n");
                  correctCount++;
               }
               else{
                  print("\nSorry. That is incorrect. Correct answer was A.\n");
                  incorrectCount++;
                }         
             }
          //Setting limit of questions asked to 5   
          }while(times < 5);    
          
          //Providing summary of their results and scores
          print("Thank you for taking the quiz. Your correct answer is " + correctCount + 
                ", incorrect is " + incorrectCount + " and score is " + getScore(correctCount) + ".");    
      }  
      //Catching Exception in case there is a problem importing file
      catch(IOException ex){
         System.out.println("Error reading file");
      }
   }
   //1st Method / for printing       
   public static void print(String s){
      System.out.println(s);
   } 
   //2nd Method / for getting score
   public static String getScore(int s){
      if(s == 5){
         return "100%";
      }
      else if(s == 4){
         return "80%";
      }
      else if(s == 3){
         return "60%";
      }
      else if(s == 2){
         return "40%";
      }
      else if(s == 1){
         return "20%";
      }
      else{
         return "0%";
      }
   }  
} 