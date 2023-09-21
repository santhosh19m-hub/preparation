package for3;

public class UseCar {

	public static void main(String[] args) {
		Car a=new Car();
		a.manufacturer="Hyundai";
		a.price=600000;
		a.model="Chevrolet";
		a.taxPercent=30;
		a.discountPercent=20;
		Car b=new Car();
		b.manufacturer="Tata";
		b.price=1000000;
		b.model="Altroz";
		b.taxPercent=20;
		b.discountPercent=10;		
		Car c=new Car();
		c.manufacturer="Toyato";
		c.price=1100000;
		c.model="Etios";
		c.taxPercent=40;
		c.discountPercent=10;
		Car d=new Car();
		d.manufacturer="MarutiSuzuki";
		d.price=900000;
		d.model="Swift";
		d.taxPercent=35;
		d.discountPercent=15;
	Car[] cars= {a,b,c,d};
	//for(int i=0;i<cars.length;i++) {
		//System.out.println(cars[i].brand+" "+cars[i].price+" "+cars[i].colour+" "+cars[i].rating+" "+cars[i].model);
	//}
	//for(Car n:cars) {
	//System.out.println(n.brand+" "+n.price+" "+n.colour+" "+n.rating+" "+n.model);
	//}
	//for(int i=0;i<cars.length;i++) {
		//if(cars[i].price>800000&&cars[i].colour.equals("white"))
			//System.out.println(cars[i].brand+" "+cars[i].price+" "+cars[i].colour+" "+cars[i].rating+" "+cars[i].model);
	//}
	//int max=cars[0].price;
	//Car x=cars[0];
	//for(int i=0;i<cars.length;i++) {
		//if(cars[i].price>=max) {
			//max=cars[i].price;
	          // x=cars[i];
		//}
	//}
	Car max=cars[0];
	Car min=cars[0];
	for(int i=0;i<cars.length;i++) {
		cars[i].netPrice=cars[i].price+(cars[i].price*cars[i].taxPercent/100)-(cars[i].price*cars[i].discountPercent/100);
		System.out.println(cars[i].manufacturer+" "+cars[i].netPrice);
		if(max.netPrice<cars[i].netPrice)
			max=cars[i];
		if(min.netPrice>cars[i].netPrice)
			min=cars[i];
	}
	System.out.println(max.netPrice+" "+min.netPrice);
	
}
}