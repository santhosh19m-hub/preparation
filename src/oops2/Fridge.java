package oops2;

public class Fridge extends Electronics {
String color;
int noOfDoors;
public Fridge(String brand,int price,boolean isWarranty,String color,int noOfDoors) {
	super(brand,price,isWarranty);
	this.color=color;
	this.noOfDoors=noOfDoors;
}
public String toString() {
	return super.toString()+"Color is "+color+"No of Doors "+noOfDoors;
}
}
