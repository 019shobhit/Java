package Class.SpringC;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {
	@Value("Maruti")
	private String model;
	@Value("2400")
	private int price;
	
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
	public void show() {
		System.out.println("Model Name:"+getModel()+"   \nPrice of car:"+getPrice());	
	}
}

