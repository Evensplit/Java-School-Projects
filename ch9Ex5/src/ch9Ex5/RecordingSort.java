package ch9Ex5;



import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class RecordingSort {

	   public static void main(String[] args) {
	       // create a recoding array of size 5
	       Recording[] recArr = new Recording[2];
	       // prompts the user for values for the data fields.
	       // create a scanner object
	       Scanner scan = new Scanner(System.in);
	       for (int i = 0; i < 2; i++) {
	           // create a recording object
	           recArr[i] = new Recording();
	           // get song title form user
	           System.out.print("Enter Song title : ");
	           // set title using setter
	           recArr[i].setSong(scan.next());
	           // get artist name form user
	           System.out.print("Enter artist name : ");
	           // set name using setter
	           recArr[i].setArtist(scan.next());
	           // get play time form user
	           System.out.print("Enter play time : ");
	           // set time using setter
	           recArr[i].setPlayTime(scan.nextInt());
	           System.out.println();
	       }
	       while(true) {
	// prompt the user to enter which field the Recordings should be sorted by
	       System.out.println(
	               "Enter which field the Recordings should be sorted by\n(S)ong title\n(A)rtist\nplaying (T)ime\n(E)xit");
	       // get user option and convert to upper case
	       String option = scan.next().toUpperCase();
	       // select sorting method and call
	       switch (option) {
	       case "S":
	           // call sortBySong method
	           sortBySong(recArr);
	           break;
	       case "A":
	           // call sortByArtist method
	           sortByArtist(recArr);
	           break;
	       case "T":
	           // call sortByTime method
	           sortByTime(recArr);
	           break;
	       case "E":
	           System.exit(0);
	           break;
	       default:
	           System.out.println("Option is invalid.");
	           break;
	       }

	   }
	   }

	   /**
	   * sort array by artist name
	   *
	   * @param array
	   */
	   public static void sortByArtist(Recording[] array) {
	       Arrays.sort(array, new Comparator<Recording>() {

	           @Override
	           public int compare(Recording o1, Recording o2) {
	               return o1.getArtist().compareTo(o2.getArtist());
	           }
	       });
	       // print array
	      
	       for (Recording r : array) {
	           System.out.println(r);
	       }
	       System.out.println();
	   }

	   /**
	   * sort array by song title
	   *
	   * @param array
	   */
	   public static void sortBySong(Recording[] array) {

	       Arrays.sort(array, new Comparator < Recording>() {

	           @Override
	           public int compare(Recording o1, Recording o2) {
	               return o1.getSong().compareTo(o2.getSong());
	           }
	       });
	       // print array
	       
	       
	       for (Recording r : array) {
	           System.out.println(r);
	       }
	       System.out.println();
	   }

	   /**
	   * sort array by play time
	   *
	   * @param array
	   */
	   public static void sortByTime(Recording[] array) {

	       Arrays.sort(array, new Comparator<Recording>() {

	           @Override
	           public int compare(Recording o1, Recording o2) {
	               if (o1.getPlayTime() < o2.getPlayTime())
	                   return -1;
	               else if (o1.getPlayTime() > o2.getPlayTime())
	                   return 1;
	               else
	                   return 0;
	           }
	       });
	       // print array
	       for (Recording r : array) {
	           System.out.println(r);
	       }
	       System.out.println();
	   }

	}