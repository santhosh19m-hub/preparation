package functions;

public class Laptop {
	String brand;
	int price;
	String color;
	float rating;
	int ram;
	public Laptop printmax(Laptop[] x) {
		Laptop max=x[0];
		for(int i=0;i<x.length;i++) {
		if(x[i].price>max.price)
			max=x[i];
		}	
		return max;
		}
	public void white(Laptop[] x) {
		for(int i=0;i<x.length;i++) {
			if(x[i].color=="white")
				System.out.println(x[i].brand);
		}
	}

}
