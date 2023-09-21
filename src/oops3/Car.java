package oops3;

public class Car implements RoadWayRules,Vehicle {
	public int speedLimit(String location) {
		if(location.equalsIgnoreCase("city"))
			return 40;
		else 
			return 80;
	}
	public String fuelType(boolean isPetrol) {
		if(isPetrol==true)
			return "petrol";
		else 
			return "diesel";
	}
	public String transportType(String boardcolour) {
		if(boardcolour.equalsIgnoreCase("white"))
			return "own Vehicle";
		else 
			return "Rental";
	}

}
