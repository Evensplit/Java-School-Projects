package ch3GameZone;

public class Card {

	 private static char suit;
	    private static int value;

	    public static char getSuit() {
	        return suit;
	    }

	    public static void setSuit(char suit) {
	        Card.suit = suit;
	    }

	    public static int getValue() {
	        return value;
	    }

	    public static void setValue(int value) {
	        Card.value = value;
	    }
	}


