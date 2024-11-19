package Class.SpringProject;

public class Bike {
	String model;
	int price;
	 Bike(String model,int price){
		 this.model=model;
		 this.price=price;
	 }
	 public void print() {
		System.out.println("Model Name: "+model+", Price of Car: "+price);
	 }

}
