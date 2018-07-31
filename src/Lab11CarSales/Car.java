package Lab11CarSales;

public class Car {
	private String make;
	private String model;
	private int year;
	private double price;
	
	//used eclipse to create constructors and getters and setters
	public Car() {
		this.make = "";
		this.model = "";
		this.year = 0;
		this.price = 0.0;
	}
	
	public Car(String make, String model, int year, double price) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	// string.format is putting 10 spaces between make, model, year, and price
	@Override
	public String toString() {
		return String.format("Make: %-10s Model: %-10s Year: %-10d Price: $ %-10.2f", make, model, year, price);
	}
	
	
	
}
