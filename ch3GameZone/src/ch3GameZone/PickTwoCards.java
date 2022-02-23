package ch3GameZone;
import java.util.Random;

public class PickTwoCards {

	    final static int CARDS_IN_SUIT = 13;
	    final static char[] suits = {'s','h','d','c'};


	    public static void main(String args[]){
	        Card firstCardSelected = selectACard();
	        System.out.println("Your FIRST Card is Selected with::");
	        System.out.println("********************************");
	        System.out.println("Suit ::"+firstCardSelected.getSuit());
	        System.out.println("Value ::"+firstCardSelected.getValue()+"\n");
	        Card secondCardSelected = selectACard();
	        System.out.println("Your SECOND Card is Selected with::");
	        System.out.println("********************************");
	        System.out.println("Suit ::"+secondCardSelected.getSuit());
	        System.out.println("Value ::"+secondCardSelected.getValue()+"\n");
	    }

	    public static Card selectACard(){
	        Card card = new Card();
	        card.setSuit(getRandomSuit());
	        card.setValue(getRandomValue());
	        return card;
	    }

	    public static char getRandomSuit(){
	        int randomSuitIndex = new Random().nextInt(suits.length);
	        char randomSuit = suits[randomSuitIndex];
	        return randomSuit;
	    }

	    public static int getRandomValue(){
	        int randomCardValue = ((int)(Math.random()*100)%CARDS_IN_SUIT+1);
	        return randomCardValue;
	    }

}


