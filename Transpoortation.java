package database1;

public class Transpoortation {
	private String type;//e.g.,"Car","Taxi"
	public Transpoortation(String type, double price) {
		super();
		this.type = type;
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	private double price;

}
