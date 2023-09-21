package java8;

public interface Furniture {
public default int findPrice(String material,int price) {
	if(material.equalsIgnoreCase("Wood")) {
		return price+5000;
	}
	else {
		return price;
	}
}
public static String durability(String material) {
	if(material.equalsIgnoreCase("Wood")) {
		return "Long Durable";
	}
	else {
		return "Short Durable";
	}
}
}
