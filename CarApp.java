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
		
		System.out.println("Current Inventory:");
		printInventory(carArrList());
		System.out.println("Please enter the number (1-6) of the car you want to buy!");		
		int numCar = Validator.getInt(scan, "", 1,6);
		
		//print the car selected
		System.out.println(carArrList().get(numCar -1));
		
		//remove the selected car
		//create method to remove the selected car
		carArrList = carArrList.remove(numCar -1);
		
		//update list to reflect the removed car
		System.out.println(carArrList());
		
//		System.out.println("Current Inventory:" + deleteCar(carArrList(), (numCar-1));
		

	}
			
		//create array for car information (make, model, year, price)
		// add mileage for used cars
		
		public static ArrayList<Car> carArrList(){
	        ArrayList<Car> carArrList = new ArrayList<>();
	        carArrList.add(new Car("Honda", "Civic", 2017, 28000));
	        carArrList.add(new Car("Ford", "Focus", 2017, 15000));
	        carArrList.add(new Car("Audi", "A4", 2017, 32000));
	        carArrList.add(new UsedCar("Mazda", "R8", 2000, 8000, 150000)); 
	        carArrList.add(new UsedCar("Nissan", "Sentra", 2003, 4000, 95000));
	        carArrList.add(new UsedCar("Chevy", "Impala", 2008, 9500, 76000));
	        return carArrList;
	    }
		
		
		public static void printInventory(ArrayList<Car> CarList) {
	        for(int i = 0; i < carArrList().size(); ++i) {
	            System.out.print((i + 1) + ":");
	        System.out.println(carArrList().get(i));
	    
	        }
	        
	       
	        
//
//		int j = 0;
//		ArrayList<Car> carArrList = new ArrayList<>();
//		
//		for (j = 1; j <= numNew; j++) {
//		String make = Validator.getString(scan, "Enter Car #" + j + " Make:");  //TOFIX car number
//		String model = Validator.getString(scan, "Enter Car #" + j + " Model:");
//		int year = Validator.getInt(scan, "Enter Car #" + j  +" Year:");
//		double price = Validator.getDouble(scan, "Enter Car #" + j + " Price:");
//		carArrList.add(new Car(make, model, year, price));
//		
//		
//		}
//				
//		UsedCar usedCarObject = new UsedCar();
//		
//		String mileage = Validator.getString(scnr, "mileage");
//		carArrList.add(usedCarObject);
//		
//		
//		System.out.println("Current Inventory:");
//		for(Car c : carArrList) {
//		System.out.println(c.toString());
//		}
////		for (int i = 0; i <= numCars; i++) {
////			System.out.println(carArrList.get(i));
////		}
////		//loop that gets user input for (make, model, year, price)
////		boolean isValid = true;
////        while (isValid == true) {
////        	for(j=0; j<= i; j++ ) {
////        		Scanner scnr = new Scanner(System.in);
////        		System.out.println();
        		
        	}


	}
