package oopEncapsulation;

public class TV {
	
	private String tvName;
	private int    pixle;
	private double price;
	
	
	public void setTvName(String newname) {
		this.tvName = newname;
	}
	public String getTvName() {
		return tvName;
	}
	public int getPixle() {
		return pixle;
	}
	public void setPixle(int pixle) {
		this.pixle = pixle;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

}
