package Class.SpringProject;

public class Car {
	String model;
	int price;
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	public void info() {
		System.out.println("MOdel Name: "+getModel()+", Price of Car: "+getPrice());
	}

}
