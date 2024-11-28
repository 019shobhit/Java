package Class.AutoWireing;

public class Employee {
	Address ads;

	public Address getAds() {
		return ads;
	}

	public void setAds(Address ads) {
		this.ads = ads;
	}

	public void show() {
		System.out.println("Employee [ads=" + ads + "]");
	}

}
