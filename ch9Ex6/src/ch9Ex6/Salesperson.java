package ch9Ex6;
public class Salesperson

{

   private int id;

   private double sales;

   Salesperson(int idNum, double amt)

   {

      id = idNum;

      sales = amt;

   }

   public int getId()

   {

      return id;

   }

   public double getSales()

   {

      return sales;

   }

   public void setId(int idNum)

   {

      id = idNum;

   }

   public void setSales(double amt)

   {

      sales = amt;

   }

}








/*public class Salesperson
{
   private int id;
   private double sales;
   Salesperson(int idNum, double amt)
   {
      id = idNum;
      sales = amt;
   }
   public int getId()
   {
      return id;
   }
   public double getSales()
   {
      return sales;
   }
   public void setId(int idNum)
   {
      id = idNum;
   }
   public void setSales(double amt)
   {
      sales = amt;
   }
}



/*public class Salesperson {
	   private int id;
	   private double sales;
	  
	   Salesperson(int idNum, double amt){
	       this.id= idNum;
	       this.sales= amt;
	   }
	   //parameterized constructor
	  // Salesperson(String id,double value){
	       //this.id =;
	       //this.sales=value;
	   //}
	   //getters and setters
	   public String getId() {
	       return id;
	   }
	   public void setId(String id) {
	       this.id= id;
	   }
	   public double getSalesValue() {
	       return sales;
	   }
	   public void setSalesValue(double salesValue) {
	       this.salesValue = salesValue;
	   }
	   //to string method
	   public String toString() {
	       return "ID "+this.id + " Sales: "+this.salesValue+"\n";
	   }
	  
	}*/



