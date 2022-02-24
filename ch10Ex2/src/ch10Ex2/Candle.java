package ch10Ex2;

public class Candle {

	protected String color;
	protected int height;
	protected double price;
	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
		this.price = this.height * 2;
	}
	public double getPrice() {
		return price;
	}
	//public void setPrice(int price) {
	//	this.price = this.height * 2;
	//}
	
	
	
}
