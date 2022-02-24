package ch7Ex7;

import java.util.Scanner;

public class ThreeLetterAcronym {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 words: ");
        String arr[];
        //reading string from user
        String words = sc.nextLine();
        //splitting it into words based on whitespace
        arr = words.split(" ");
       
        String acronym = "";
        //iterating through first 3 words and taking 1st char from each word
        for(int i = 0;i < 3; i++) {
                acronym = acronym + arr[i].charAt(0);
        }
        acronym=acronym.toUpperCase();
        System.out.println("Acronym for "+words+" is : "+acronym);
        
}

}
