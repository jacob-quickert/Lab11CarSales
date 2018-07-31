package Lab11CarSales;

public class UsedCar extends Car{
	
	private double mileage;

	// used eclipse to put out contructors, getters and setters
	public UsedCar() {
		super();

	}

	public UsedCar(String make, String model, int year, double price, double mileage) {
		super(make, model, year, price);
		this.mileage = mileage;
	}

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}
	
	// this adds (used), 10spaces, mileage value to 2 decimal places, and "miles" to the super's (Car) toString.
	@Override
	public String toString() {
		return super.toString() + String.format("(Used) %-10.2f miles", mileage);
	}
	

}
