package functions;

public class UseLaptop {

	public static void main(String[] args) {
		Laptop a=new Laptop();
		a.brand="Lenova";
		a.price=50000;
		a.color="blue";
		a.rating=4.5f;
		a.ram=2;
		Laptop b=new Laptop();
		b.brand="Acer";
		b.price=40000;
		b.color="white";
		b.rating=4.0f;
		b.ram=4;
		Laptop c=new Laptop();
		c.brand="Dell";
		c.price=60000;
		c.color="black";
		c.rating=3.5f;
		c.ram=6;
		Laptop d=new Laptop();
		d.brand="Hp";
		d.price=70000;
		d.color="white";
		d.rating=5.0f;
		d.ram=8;
		Laptop[] laps= {a,b,c,d};
		Laptop f=a.printmax(laps);
		System.out.println(f.brand+" "+f.price+" "+f.color+" "+f.rating+" "+f.ram);
		a.white(laps);
	}

}
