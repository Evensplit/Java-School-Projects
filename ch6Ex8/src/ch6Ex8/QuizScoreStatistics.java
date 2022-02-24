package ch6Ex8;

import java.util.Scanner;


public class QuizScoreStatistics {
	

		
		public static void main(String args[]) {
	        Scanner in = new Scanner(System.in);
	        int score, scoreCount = 0, highestScore = 0, lowestScore = 0, arithmeticAverage = 0;
	        while (true) {
	            System.out.print("Enter a score(0 to 10): ");
	            score = in.nextInt();
	            if (score == 99) break;
	            if (score >= 0 && score <= 10) {
	                if (scoreCount == 0 || score > highestScore) highestScore = score;
	                if (scoreCount == 0 || score < lowestScore) lowestScore = score;
	                arithmeticAverage += score;
	                scoreCount++;
	            } else {
	                System.out.println("Score must be between 0 and 10 ");
	            }
	        }
	        System.out.println(scoreCount + " valid scores were entered");
			System.out.println("Highest was " + highestScore);
			System.out.println("Lowest was " + lowestScore);
			 System.out.println(arithmeticAverage / (double) scoreCount);
			
			
	    }
	
		/*Scanner scanner = new Scanner(System.in);
		//declare and set integer variables
		int studentScore;
		int totalScore = 0 ;
		int scoresCount = 0;
		int toQuit = 99;
		//declare and set a variable to zero
		double arithAverage = 0;
		System.out.println("Enter a score >> ");
		//read student score for keyboard
		studentScore = scanner.nextInt();
		
		//assume that initial score is lowest and highest score
		int lowestScore = studentScore;
		int highestScore = studentScore;
		
		//Checking while loop the condition that is not equal the 99 value)
		while (studentScore != toQuit) {
		
			
			  
			if(studentScore <= 0 || studentScore > 10) { 
				System.out.println("Score must be in between 1 and 10 ");
			    scoresCount-=1;
			    totalScore -= studentScore;
			    if (studentScore <= 0) {
			    	studentScore -=studentScore;
			    }
			    if (studentScore >= 10) {
			    	highestScore -=highestScore;
			    }
			    
			}
			else {
				//checking for lowest score
				if(studentScore < lowestScore) {
					lowestScore = studentScore;
				}
				//checking for highest score
				if(studentScore > highestScore) {
					highestScore = studentScore;
					//add total score
				
				
				}
			}
			
			//next user score prompt
			totalScore = totalScore + studentScore;
			System.out.println("Enter another score or 99 to quit > ");
			//next user score prompt
			studentScore = scanner.nextInt();
			scoresCount +=1;
			}
			
			//Calculate the average score
		    
		    
			arithAverage = (double)totalScore / scoresCount;
			System.out.println(scoresCount + " valid scores were entered");
			System.out.println("Highest was " + highestScore);
			System.out.println("Lowest was " + lowestScore);
			System.out.println("Average was " + arithAverage);
		}*/
		
		
		
		
		
		
		
}
