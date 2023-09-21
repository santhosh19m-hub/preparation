package oops1;

public class Engine {
private int cc;
private String fueltype;
private String coolanttype;
public void setCc(int cc) {
	this.cc=cc;
}
public int getCc() {
	return cc;
}
public void setFueltype(String fueltype) {
	this.fueltype=fueltype;
}
public String getFueltype() {
	return fueltype;
}
public void setCoolanttype(String coolanttype) {
	this.coolanttype=coolanttype;
}
public String getCoolanttype() {
	return coolanttype;
}
public Engine(int cc,String fueltype,String coolanttype) {
	this.cc=cc;
	this.fueltype=fueltype;
	this.coolanttype=coolanttype;
}
public String toString() {
	return cc+" "+fueltype+" "+coolanttype;
}
}
