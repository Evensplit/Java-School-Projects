package ch10Ex2;

public class ScentedCandle extends Candle {
	private String scent;

	public String getScent() {
		return scent;
	}

	public void setScent(String scent) {
		this.scent = scent;
	}
	//over ride the parents setHeight()method
	
	public void setHeight(int height) {
		this.height = height;
		this.price = this.height * 3;
	}
	

}
