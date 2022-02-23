package ch4Ex5;

public class Bread{
	
	private String breadType;
	private int caloriesPerSlice;
	public final static String MOTTO = "The staff of life ";
	
	public Bread(String bread, int cal) {
		breadType = bread;
		caloriesPerSlice = cal;
	}
	
	public String getBreadType() {
		return breadType;
	}
	
	public int getCaloriesPerSlice() {
		return caloriesPerSlice;
	}
	// the setters are not asked for in question 5
	//public void setBreadType() {
		//this.setBreadType();
		
	//}
	
	//public void setCaloriesPerSlice() {
	//	this.setBreadType();
	//}
}
