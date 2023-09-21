package java8;

public interface Vehicle {
public default String calculateSpeed(int cc) {
	return "Speed is"+cc;
}
public static String engineType() {
	return "All vehicles are combustion engine";
}
public String fuelUsage();
}
