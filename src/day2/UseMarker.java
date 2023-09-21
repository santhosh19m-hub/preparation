package day2;

public class UseMarker {

	public static void main(String[] args) {
		Marker m=new Marker();
		m.brand="Camalin";
		m.colour="Black";
		m.shape="Cylindrical";
		m.price=30;
		m.rating=4.5f;
		System.out.println("Brand Name is "+m.brand+",\nColour  is "+m.colour+",\nShape is "+m.shape+",\nPrice is "+m.price+",\nRating is "+m.rating+".");
		Marker m1=new Marker();
		m1.brand="Koreas";
		m1.colour="Blue";
		m1.shape="Cylindrical";
		m1.price=40;
		m1.rating=3.5f;
		System.out.println("Brand Name is "+m1.brand+",\nColour  is "+m1.colour+",\nShape is "+m1.shape+",\nPrice is "+m1.price+",\nRating is "+m1.rating+".");
		
	}

}
