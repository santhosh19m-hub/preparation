package day2;

public class UseAc {

	public static void main(String[] args) {
		Ac a=new Ac();
		a.brand="Voltas";
		a.price=12000;
		a.colour="Black";
		a.ton=1.5f;
		a.rating=4.5f;
		a.tax=20;
		a.netprice=a.price+(a.price*a.tax)/100;
		Ac b=new Ac();
		b.brand="Croma";
		b.price=15000;
		b.colour="White";
		b.ton=1.0f;
		b.rating=3.5f;
		b.tax=25;
		b.netprice=b.price+(b.price*b.tax)/100;
		Ac c=new Ac();
		c.brand="LG";
		c.price=18000;
		c.colour="Sandal";
		c.ton=2.0f;
		c.rating=5.0f;
		c.tax=30;
		c.netprice=c.price+(c.price*c.tax)/100;
		System.out.println("Brand Name is "+a.brand+",\nPrice is "+a.price+",\nColour  is "+a.colour+",\nTon is "+a.ton+",\nRating is "+a.rating+",\nTax is "+a.tax+",\nNetPrice is "+a.netprice+".");
		System.out.println("Brand Name is "+b.brand+",\nPrice is "+b.price+",\nColour  is "+b.colour+",\nTon is "+b.ton+",\nRating is "+b.rating+",\nTax is "+b.tax+",\nNetPrice is "+b.netprice+".");
		System.out.println("Brand Name is "+c.brand+",\nPrice is "+c.price+",\nColour  is "+c.colour+",\nTon is "+c.ton+",\nRating is "+c.rating+",\nTax is "+c.tax+",\nNetPrice is "+c.netprice+".");
		int total=a.netprice+b.netprice+c.netprice;
		System.out.println("The Total NetPrice is "+total+".");
		
		

	}

}
