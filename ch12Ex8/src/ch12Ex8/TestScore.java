package ch12Ex8;

import java.util.Scanner;

public class TestScore {
	public static void main(String args[]) throws Exception {
        Scanner input = new Scanner(System.in);
        int[] ids = {1234, 2345, 3456, 4567, 5678};
        int[] scores = {0, 0, 0, 0, 0};
        String scoreString = new String();
        final int HIGHLIMIT = 100;
        String inString, outString = "";
        for (int x = 0; x < ids.length; ++x) {
            System.out.println("Enter score for student id number: " + ids[x]);
            inString = input.next();
            scores[x] = Integer.parseInt(inString);
            // Write your code here
            int score = Integer.parseInt(inString);
           
            try {
                
				if (score > 100) {
                    throw new ScoreException("Score over 100");
                }
                scores[x] = score;
            } catch(ScoreException e){
                scores[x] = 0;
                System.out.println(e.getMessage());
            }
        }
        for (int x = 0; x < ids.length; ++x)
            outString = outString + "ID #" + ids[x] + "  Score " +
                        scores[x] + "\n";
        System.out.println(outString);
    }
}
