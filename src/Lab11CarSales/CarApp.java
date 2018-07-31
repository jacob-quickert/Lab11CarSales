package Lab11CarSales;

import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		ArrayList<Car> cars = new ArrayList<Car>();
		
		int userNum = Validator.getInt(scan, "How many cars do you want to add? ");
		
		for (int i = 0; i < userNum; i++) {
			System.out.println("Please enter info for a car ");
			String make = Validator.getString(scan, "Make: ");
			String model = Validator.getString(scan, "Model: ");
			int year = Validator.getInt(scan, "Year: ");
			double price = Validator.getDouble(scan, "Price: ");
			cars.add(new Car(make, model, year, price));
		}
		
		System.out.println("Current Inventory: ");
		for (Car c: cars) {
			System.out.println(c.toString());
		}
		
		scan.close();

	}

}
