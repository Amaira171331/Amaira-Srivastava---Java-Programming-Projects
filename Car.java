/** Class car represents car objects
 * Amaira Srivastava
 * 7/14
 * Assignment 
 *  */
public class Car {
	private String carName;
	private int mileage;
	private int fuelTankCapacity;
	private int gasLevel;
	
	/** Default constructor */
	Car()
	{
		this.carName = "Not given";
        this.mileage = 0;
        this.fuelTankCapacity = 0;
        this.gasLevel = 0;
	}
	
	/** Overloaded constructor */
	public Car(String carName, int mileage, int fuelTankCapacity) {
	    this.carName = carName;
	    this.mileage = mileage;
	    this.fuelTankCapacity = fuelTankCapacity;
	    this.gasLevel = 0;
    }
	
	/** Getter function for carName */
	public String getCarName() {
		return this.carName;
	}
	
	/** Getter function for mileage */
	public int getMileage() {
		return this.mileage;
	}
	
	/** Getter function for fuelTankCapacity */
	public int getFuelTankCapacity() {
		return this.fuelTankCapacity;
	}
	
	/** Getter function for gasLevel */
	public int getGasLevel() {
		return this.gasLevel;
	}
	
	/** Setter function for carName */
	public void setCarName(String a_carName) {
		this.carName = a_carName;
	}
	
	/** Setter function for mileage */
	public void setMileage(int a_mileage) {
		this.mileage = a_mileage;
	}	
	
	/** Setter function for fuelTankCapacity */
	public void setFuelTankCapacity(int a_fuelTankCapacity) {
		this.fuelTankCapacity = a_fuelTankCapacity;
	}
	
	/** Setter function for gasLevel */
	public void setGasLevel(int a_gasLevel) {
		this.gasLevel = a_gasLevel;
	}
	
	/** toString method */
	public String toString() {
        return "Car Name: " + carName +
        		", Car Mileage: " + mileage +
        		", Fuel Tank Capacity: " + fuelTankCapacity + 
        		", Gas Level: " + gasLevel;
	}
	
	/** Drive method */
	public void drive (int distance)
	{
		int maxDistance = mileage * gasLevel;
	    
	    if (distance <= maxDistance) {
	        // Enough fuel: drive full distance
	        int fuelUsed = (int) Math.ceil((double) distance / mileage);
	        gasLevel -= fuelUsed;
	        System.out.println("Drove " + distance + " miles.");
	    }
	    
	    else {
	        // Not enough fuel: drive as much as possible
	        System.out.println("Drove " + maxDistance + " miles. Could not drive " + (distance - maxDistance) + " miles.");
	        gasLevel = 0; // all fuel used
	    }
	}
	
	/** canDrive method */
	public boolean canDrive (int distance)
	{
		int can_drive = mileage * gasLevel;
		return can_drive >= distance;
//		if (can_drive >= distance)
//		{
//			return true;
//		}
//		else
//		{
//			return false;
//		}
	}
	
	/** fillGas method */
	public void fillGas (int input_gas_amount)
	{
		if (gasLevel + input_gas_amount <= fuelTankCapacity) {
			gasLevel = gasLevel + input_gas_amount;
		}
		else
		{
			int extra = input_gas_amount - fuelTankCapacity;
			System.out.println("The amount specified is greater than the fuel tank capacity. Cannot add " + extra + "gallons." );
		}
	}
}
