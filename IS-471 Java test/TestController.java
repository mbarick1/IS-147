//package test;

//The <class>Test</class> object will load the questions & answers the process the users responses ...
 
import java.util.ArrayList;
import java.io.*;
import java.util.*;

public class TestController  
{
	protected static final String KEY = "Key:";
	protected static final String PROMPT = "Prompt:";
	protected static final String ANSWER = "Answer: ";
	
	protected static List<Question> questions = new ArrayList<Question>();
	protected static List<Question> answeredQuestions  = new ArrayList<Question>();
	
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
    	  
    	  Question selectedQuestionForDisplay = TestProcessor.displayQuestion(questions);
    	  answeredQuestions.add( TestProcessor.processAnswer(selectedQuestionForDisplay));   	  
      }
      
   TestProcessor.calculateAndDisplayScore(answeredQuestions);   
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
         /*
         else 
         {
				System.out.println("Incorrect format: ignoring ==> " + data);
			}
         */
		} 
   //System.out.println( "questions are: " + questions);
   }  
   
   //Process line questions into List of questions
   
   /*
   protected static void processQuestions(String input) {

		System.out.println("processQuestions() --> input: " + input);
		Question question = null;   
	
			// created new question object and assign question
			if(input.startsWith( PROMPT)) {
				question = new Question();
				questions.add(question);
				question.setPrompt( input);
			} 
         else if ( input.startsWith( KEY)) {
				question.getPossibleAnswers().add(input);
			}
			else if ( input.startsWith (ANSWER)) {
				question.setAnswer(input);
			} 
         
         else 
         {
				System.out.println("Incorrect format: ignoring ==> " + input);
			}
			System.out.println( "questions are: " + questions); 
         
   } 
   */  
}
