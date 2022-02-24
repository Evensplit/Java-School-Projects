package ch6Ex5;

public class Perfect {
		  
		 
			    private static String num;
				public static void main (String args[]) {
			        int sum = 0;
			       
			        boolean b = perfect(sum);
			        
			        if(b){
		    			int num = 0;
						System.out.println(num + "  ");
		    		}
			        else {
			        	System.out.println(num + "  ");
			        	
			        }
			        
			        
			    }
			    public static boolean perfect(int n) {
			    	
			    	for (n = 1; n <=1000; n++) {
			    		int sum = 0;
			    		
						int num = 0;
						for (int i = 1; i <= num/2; i++) {
			    			if(num % i == 0) {
			    				sum += i;
			    			}
			    		}
			    	
			    	}
					return true;
			    	
			    	
					
				
			        
			    }
			


	      

}
