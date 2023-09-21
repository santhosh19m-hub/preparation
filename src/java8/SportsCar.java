package java8;

public class SportsCar implements Vehicle {
	public String calculateSpeed(int cc) {
		return "The speed is "+(cc+100);
	}
	public String fuelUsage() {
		return "High fuel usage";
	}

}
