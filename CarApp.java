import java.util.Scanner;
import java.util.ArrayList;
/**
 * 
 */

/**
 * @author hbm1
 *
 */
public class CarApp {

	
	public static void main(String[] args) {	
	
		Scanner scan = new Scanner(System.in);
		//ask user how many cars they want to enter
		
		int numCars = Validator.getInt(scan, "How many cars do you want to enter?");
//		int j = 0;
		
	
		//create array for car information (make, model, year, price)
		
//		
		int j = 1;
		ArrayList<Car> carArrList = new ArrayList<>();
		
		for (j = 1; j <= numCars; j++) {
		String make = Validator.getString(scan, "Enter Car #" + j + " Make:");  //TOFIX car number
		String model = Validator.getString(scan, "Enter Car #" + j + " Model:");
		int year = Validator.getInt(scan, "Enter Car #" + j  +" Year:");
		double price = Validator.getDouble(scan, "Enter Car #" + j + " Price:");
		carArrList.add(new Car(make, model, year, price));
		
		}
				
		System.out.println("Current Inventory:");
		System.out.println(carArrList);
		
//		for (int i = 0; i <= numCars; i++) {
//			System.out.println(carArrList.get(i));
//		}
//		//loop that gets user input for (make, model, year, price)
//		boolean isValid = true;
//        while (isValid == true) {
//        	for(j=0; j<= i; j++ ) {
//        		Scanner scnr = new Scanner(System.in);
//        		System.out.println();
        		
        	}


	}
