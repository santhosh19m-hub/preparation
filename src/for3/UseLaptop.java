package for3;

public class UseLaptop {

	public static void main(String[] args) {
		Laptop a=new Laptop();
		a.brand="Dell";
		a.price=50000;
		a.colour="gray";
		a.rating=4.0f;
		a.model="i1";
		a.ram=2;
		Laptop b=new Laptop();
		b.brand="Hp";
		b.price=40000;
		b.colour="white";
		b.rating=4.5f;
		b.model="i2";
		b.ram=4;
		Laptop c=new Laptop();
		c.brand="Acer";
		c.price=60000;
		c.colour="blue";
		c.rating=3.5f;
		c.model="i3";
		c.ram=8;
		Laptop d=new Laptop();
		d.brand="Lenov0";
		d.price=30000;
		d.colour="black";
		d.rating=3.0f;
		d.model="i4";
		d.ram=1;
Laptop[] laps= {a,b,c,d};
Laptop min=laps[0];
for(int i=0;i<laps.length;i++) {
	if(laps[i].price<=min.price)
		min=laps[i];
}
System.out.println(min.brand+" "+min.price+" "+min.colour+" "+min.rating+" "+min.model+" "+min.ram);
	}

}
