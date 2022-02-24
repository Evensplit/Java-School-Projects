package ch6Ex6;

public class DiagonalOs {

	public static void main(String[] args) {
		 int n = 7, spaces = 7;
		    for(int i = 0;i<n;i++){
		      for(int k = 0;k<spaces;k++){
		        System.out.print(" ");
		      }
		      spaces--;
		      for(int j = 0;j<2*i+1;j++){
		        System.out.print("T");
		      }
		      System.out.println();
		    }
		
		
		/*int rows = 7, k = 0;
		for(int i = 1; i <= rows; ++i, k = 0) {
		  for(int space = 1; space <= rows - i; ++space) {
		System.out.print(" "+" ");
		}
		while(k != 2 * i - 1) {
		System.out.print("T ");
		++k;
		}
		System.out.println();
		}*/
		
	}

}
