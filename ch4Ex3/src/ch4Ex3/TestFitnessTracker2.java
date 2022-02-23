package ch4Ex3;
import java.time.*;

	public class TestFitnessTracker2
	{
	   public static void main(String[] args)
	   { 
	      FitnessTracker2 exercise = new FitnessTracker2();

	      System.out.println(exercise.getActivity() + " " + exercise.getMinutes() +
	         " minutes on " + exercise.getDate());

	      // code to test constructor added for exercise 3b
	      /*exercise.setActivity("Walking");
	      exercise.setMinutes(30);
	      exercise.setDate(LocalDate.now());
	      
	      
	      /*System.out.println("Exercise Object");
	      System.out.println("Activity: " + exercise.getActivity());
	      System.out.println("Minutes: " + exercise.getMinutes());
	      System.out.println("Date: " + exercise.getDate());*/
	     
	 
	      LocalDate date = LocalDate.of(2020, 8, 20);
	      FitnessTracker2 exercise2 = new FitnessTracker2("bicycling", 35, date);

	      System.out.println(exercise2.getActivity() + " " + exercise2.getMinutes() +
	         " minutes on " + exercise2.getDate());
	   }
	}


