//package test

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
*/


import java.util.ArrayList;
import java.io.*;
import java.util.*;

public class Question {

	protected String prompt;
	protected List<String> possibleAnswers = new ArrayList<String>();
	protected String answer;
	protected String userResponse;
   
   protected static final String KEY = "Key:";
	protected static final String PROMPT = "Prompt:";
	protected static final String ANSWER = "Answer: ";
	
	protected static List<Question> questions = new ArrayList<Question>();
	protected static List<Question> answeredQuestions  = new ArrayList<Question>();

	
	public Question() {
	}

	public String getUserResponse() {
		return userResponse;
	}

	public void setUserResponse(String userResponse) {
		this.userResponse = userResponse;
	}

	public boolean isAnswerCorrect() {
		System.out.println( "[" + this.answer +  "] == [" + this.userResponse + "]");
		return this.answer.equalsIgnoreCase(this.userResponse.trim());
	}

	public void setPrompt( String prompt) {
		this.prompt = prompt;
	}

	public String getPrompt() {
		return this.prompt;
	}

	public void setAnswer( String answer) {
		//StringTokenizer tok = new StringTokenizer(" ");
		this.answer = answer;    //tok.nextToken();
	}

	public String getAnswer() {
		
		return this.answer.trim();
	}

	public List<String> getPossibleAnswers() {
		return this.possibleAnswers;
	}
	
	/**
	* print contents of question
	*/
	public String toString() {
	
		return "Question: " + this.prompt + System.getProperty("line.separator") 
			+ "Answer: " + this.answer + System.getProperty("line.separator") 
			+ "Keys: " + this.possibleAnswers;
	}
   
   //Load questions into List of questions
   
   protected static void loadQuestions(List<String> input) {

		String data = "";
		Question question = null;   
      
		for(Iterator<String> it = input.iterator(); it.hasNext(); ) {
			data = it.next();
			
			// created new question object and assign question
			if(data.startsWith( PROMPT)) {
				question = new Question();
				questions.add(question);
				question.setPrompt( data);
			} 
         else if ( data.startsWith( KEY)) {
				question.getPossibleAnswers().add(data);
			}
			else if ( data.startsWith (ANSWER)) {
				question.setAnswer(data);
			} 
      }
   }
   
   public static Question displayQuestion(List<Question> questions) {
		
		int index = new Random().nextInt(questions.size());
		
		Question question = questions.get(index);
		
		//remove question from list of possible questions that can be asked
		questions.remove(index);
		
		System.out.println(question.getPrompt());
		for( Iterator<String> possibleAnswerit = question.getPossibleAnswers().iterator(); possibleAnswerit.hasNext();) {
			System.out.println("\t" + possibleAnswerit.next()); 
		}
		return question; 
	}
	
	public static Question processAnswer(Question question) {
		
		//Answering questions       
        System.out.println( System.getProperty("line.separator") + "Answer Here:");
        String answer = new Scanner(System.in).nextLine();
        
        System.out.println("User selected: " + answer); 
        
        question.setUserResponse(answer);
        
        if( question.isAnswerCorrect()) {
        	System.out.println("Congratulations!!! You selected the correct answer");
        } 
        else {
        	System.out.println("Sorry!! Your answer is incorrect. The correct answer is: " + question.getAnswer());
        }
        
        return question;		
	}
	
	public static int calculateAndDisplayScore( List<Question> answeredQuestions ) {
		
		int score = 0;
		System.out.println("calculateAndDisplayScore() --> answered Questions = " + answeredQuestions);
		
		// Iterate over the answered questions to see which questions were answered correctly
		// if answered correctly, increment score by 1
		for(Iterator<Question> questionIterator = answeredQuestions.iterator(); questionIterator.hasNext();) {
			if( questionIterator.next().isAnswerCorrect()) {
				score++;
			}
		}
		System.out.println("User Score is: " + Integer.toString((score/answeredQuestions.size())));
		
   return score;	
	}

   public static void main(String[] args)throws Exception
   {
      File file = new File("Traore_Mbarick_Questions.txt");
      
      Scanner sc = new Scanner(file); 
     
      List<String> lines = new ArrayList<String>(); 
     
      while (sc.hasNextLine()) {  
      lines.add(sc.nextLine());  
      }
      loadQuestions(lines);
      
      System.out.println();// just space
      
      //System.out.println("**********************  this is question 5" + questions.get(4));
      
      for(int count = 0; count < 5; count++) {
    	  
    	  Question selectedQuestionForDisplay =   Question.displayQuestion(questions);
    	  answeredQuestions.add( Question.processAnswer(selectedQuestionForDisplay));   	  
      } 
   Question.calculateAndDisplayScore(answeredQuestions);   
   }
}
