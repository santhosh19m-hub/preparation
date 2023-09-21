package oops3;

public class Table implements Furniture {
	public void printMaterial(String material) {
		System.out.println("The material is "+material);
	}
	public String durability(String material) {
		if(material.equalsIgnoreCase("wood")) {
			return "highly durable";
		}
		else {
			return "average durability";
		}
	}

}
