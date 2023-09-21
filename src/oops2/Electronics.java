package oops2;

public class Electronics {
String brand;
int price;
boolean isWarranty;
public Electronics(String brand,int price,boolean isWarranty) {
	this.brand=brand;
	this.price=price;
	this.isWarranty=isWarranty;
}
public String toString() {
	return "Brand is "+brand+"Price is "+price+"Warranty Available"+isWarranty;
}
}
