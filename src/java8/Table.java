package java8;

public class Table implements Furniture {
public int findPrice(String material,int price) {
	if(material.equalsIgnoreCase("Wood")) {
		return price+2000;
	}
	else {
		return price;
	}
}
}
