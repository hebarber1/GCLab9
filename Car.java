
public class Car {

	private String make;
	private String model;
	private int year;
	private double price;


	public Car(String make, String model, int year, double price) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}
	
	public String getmake() {
		return make;		
	}
	
	public void setmake(String make) {
		this.make = make;
	}
	
	public String getmodel() {
		return model;
	}
	public void setmodel(String model) {
		this.model = model;
	}
	
	public int getyear() {
		return year;
	}
	public void setyear(int year) {
		this.year = year;
	}
	
	public double getprice() {
		return price;
	}
	public void setdouble(double price) {
		this.price = price;
	}
	
	@Override
    public String toString() {
        return make + ", " + model + ", " + year + ",  $" + price  ;
    }
	}
