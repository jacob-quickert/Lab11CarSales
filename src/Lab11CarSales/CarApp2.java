/*
 * @author Jacob Quickert
 */

package Lab11CarSales;

import java.util.ArrayList;
import java.util.Scanner;

public class CarApp2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int userNum = 0;

		Car c1 = new Car("Tesla", "Model S", 2017, 54999.9);
		Car c2 = new Car("Ford", "Escape", 2017, 31999.9);
		Car c3 = new Car("Chevy", "Impala", 2017, 44989.95);
		UsedCar c4 = new UsedCar("Honda", "Accord", 2015, 14795.5, 35987.6);
		UsedCar c5 = new UsedCar("GC", "Chirpus", 2013, 8500.0, 12345.7);
		UsedCar c6 = new UsedCar("GC", "Witherell", 2016, 14450.0, 3500.3);

		ArrayList<Car> cars = new ArrayList<Car>();
		cars.add(c1);
		cars.add(c2);
		cars.add(c3);
		cars.add(c4);
		cars.add(c5);
		cars.add(c6);
		String cont = "y";

		while (cont.equalsIgnoreCase("y")) {
			printMenu(cars);
			
			//use Validator to be sure we get the right number
			userNum = Validator.getInt(scan, "Which car would you like? (Enter Menu #) ", 1, cars.size());
			
			System.out.println("");
			System.out.println(cars.get(userNum - 1).toString());
			System.out.println("");
			
			buyTheCar(scan, userNum, cars);
			
			// offer to let user look and buy another car
			System.out.println("Would you like to look at another car? (y/n)");
			cont = scan.nextLine();
		}
		System.out.println("");
		System.out.println("Goodbye. Have a great day! ");
	}
	//iterate and print the arraylist through a for loop (use i to print the number before the car)
	public static void printMenu(ArrayList<Car> menu) {
		for (int i = 0; i < menu.size(); i++) {
			System.out.println((i + 1) + ". " + menu.get(i).toString());
		}
	}
	// offer to let user buy the car and give feedback if they do.
	public static void buyTheCar (Scanner sc, int userNum, ArrayList<Car> cars) {
		System.out.println("Would you like to buy this car? (y/n) ");
		String choice = sc.nextLine();
		if (choice.equalsIgnoreCase("y")) {
			System.out.println("");
			System.out.println("Excellent! Our finance department will be in touch shortly. ");
			System.out.println("");
			// remove the car they want to buy from the list
			cars.remove(userNum - 1);
		}
	}

}
