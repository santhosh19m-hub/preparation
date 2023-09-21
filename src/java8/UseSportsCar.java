package java8;

public class UseSportsCar {

	public static void main(String[] args) {
		SportsCar s=new SportsCar();
		System.out.println(s.calculateSpeed(350));
		System.out.println(s.fuelUsage());
		System.out.println(Vehicle.engineType());

	}

}
