import java.util.*;


//import java.util.Iterator;
//import java.util.List;
//import java.util.Random;
//import java.util.Scanner;
/**
 * this class is responsible for displaying the question and accepting the user's answer
 * @author bntraore
 *
 */
public class TestProcessor {

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
}
