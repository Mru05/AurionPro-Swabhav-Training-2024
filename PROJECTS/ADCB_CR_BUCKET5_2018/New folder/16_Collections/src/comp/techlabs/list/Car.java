package comp.techlabs.list;

public class Car {
	private int carId;
    private String companyName;
    private double price;
    private double mileage;
    
    
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getMileage() {
		return mileage;
	}
	public void setMileage(double mileage) {
		this.mileage = mileage;
	}
	public Car(int carId, String companyName, double price, double mileage) {
		super();
		this.carId = carId;
		this.companyName = companyName;
		this.price = price;
		this.mileage = mileage;
	}
	public void displayCarDetails() {
        System.out.println("Car ID: " + carId);
        System.out.println("Company Name: " + companyName);
        System.out.println("Price: $" + price);
        System.out.println("Mileage: " + mileage + " kmpl");
    }

}
