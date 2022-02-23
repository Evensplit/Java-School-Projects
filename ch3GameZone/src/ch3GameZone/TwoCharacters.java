package ch3GameZone;

import java.util.Scanner;

public class TwoCharacters {
	
	public static void main(String[] args)
    {
        int lives;
        int eyes;
        String color;

        MyCharacter char1 = new MyCharacter();
        MyCharacter char2 = new MyCharacter();

        lives = ((int)(Math.random() * 5) + 1);
        eyes = ((int)(Math.random() * 6) + 1);
        color = pickColor();

        char1.setLives(lives);
        char1.setNumberOfEyes(eyes);
        char1.setColor(color);

        lives = ((int)(Math.random() * 5) + 1);
        eyes = ((int)(Math.random() * 6) + 1);
        color = pickColor2();

        char2.setLives(lives);
        char2.setNumberOfEyes(eyes);
        char2.setColor(color);

        display(char1);
        display2(char2);
    }

    public static String pickColor()
    {
        String color;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Choose a color for character >> ");
        color = keyboard.nextLine();
        return color;
    }

    public static String pickColor2()
    {
        String color;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Choose a color for your second character >> ");
        color = keyboard.nextLine();
        return color;
    }

    public static void display(MyCharacter ch)
    {
        System.out.println("Your character has " + ch.getLives() + " lives. It has " + ch.getNumberOfEyes() + " eyes. It's color is " + ch.getColor());
    }

    public static void display2(MyCharacter ch)
    {
        System.out.println("Your second character has " + ch.getLives() + " lives. It has " + ch.getNumberOfEyes() + " eyes. It's color is " + ch.getColor());
    }

}
