package oops1;

public class UseCar {

	public static void main(String[] args) {
		Engine e=new Engine(1000,"Diesel","water");
		Tyre t=new Tyre("Mrf",1000,"black");
		Radio r=new Radio("Pioneer",5000,"blue");
		Car c=new Car("Toyato",800000,"White",e,t,r);
		System.out.println(c);

	}

}
