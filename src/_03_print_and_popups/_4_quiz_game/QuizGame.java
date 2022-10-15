package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int score=0;
		
		// ASK A QUESTION AND CHECK THE ANSWER
	
				// 2.  Ask the user a question 
		String answer=JOptionPane.showInputDialog("what is 150+150 ");
				
				// 3.  Use an if statement to check if their answer is correct
		if(answer.equals("300")){
			score=score+1;
			
		}
		
				
				// 4.  if the user's answer was correct, add one to their score

		
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		 answer=JOptionPane.showInputDialog("what is 100-100");
		 if(answer.equals("0")) {
			 score=score+1;
		 }else {
			 score=score-1;
		 }
		 answer=JOptionPane.showInputDialog("what is 50-50+100-50");
		 if(answer.equals("50")) {
			 score=score+1;
		 }else {
			 score=score-1;
		 }
		 answer=JOptionPane.showInputDialog("what is 250-100-50+5");
		 if(answer.equals("105")) {
			 score=score+1;
		 }else {
			 score=score-1;
		 }
		
		
		
		// After all the questions have been asked, tell the user their final score 
		JOptionPane.showMessageDialog(null,"Your score:"+score);
		
	}
}
