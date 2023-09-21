package collections;

public class Bus {
private int noOfSeats;
private String color;
private String depot;
private boolean isGovernment;
public int getNoOfSeats() {
	return noOfSeats;
}
public void setNoOfSeats(int noOfSeats) {
	this.noOfSeats = noOfSeats;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
@Override
public String toString() {
	return "Bus [noOfSeats=" + noOfSeats + ", color=" + color + ", depot=" + depot + ", isGovernment=" + isGovernment
			+ "]";
}
public Bus(int noOfSeats, String color, String depot, boolean isGovernment) {
	super();
	this.noOfSeats = noOfSeats;
	this.color = color;
	this.depot = depot;
	this.isGovernment = isGovernment;
}
public String getDepot() {
	return depot;
}
public void setDepot(String depot) {
	this.depot = depot;
}
public boolean isGovernment() {
	return isGovernment;
}
public void setGovernment(boolean isGovernment) {
	this.isGovernment = isGovernment;
}
}
