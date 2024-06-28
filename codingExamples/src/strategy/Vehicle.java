package strategy;

public class Vehicle {
  
	DriveStrategyInterface driveStrategy;
	
	public Vehicle(DriveStrategyInterface driveStrategy) {
		this.driveStrategy =driveStrategy;
	}
	
	void drive() {
		driveStrategy.drive();
	}
	
	/*void drive(VehicleStrategyInterface vehicleStrategy) {
		vehicleStrategy.drive();
	}*/
}
