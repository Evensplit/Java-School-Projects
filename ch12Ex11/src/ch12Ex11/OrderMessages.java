package ch12Ex11;

public class OrderMessages {
	
	private String messages[];
	public OrderMessages() {
	
	 messages = new String[7];

     messages[0] = "Item number not numeric";

     messages[1] = "Item number too low";

     messages[2] = "Item number too high";

     messages[3] = "Quantity not numeric";

     messages[4] = "Quantity too low ";

     messages[5] = "Quantity too high ";

     messages[6] = "Item does not exist";
  }
	   public String getMessage(int index)

       {

             if(index >= 0 && index <messages.length)

                    return messages[index];

             else

                    return "";

       }
	
}
	/* public final static String[] message =
	     { "Item number not numeric    ",
	       "Quantity not numeric       ",
	       "Item number too low        ",
	       "Item number too high       ",
	       "Quantity too low           ",
	       "Quantity too high          ",
	       "Item number does not exist ",  };

}*/
