package for3;

public class UsePen {

	public static void main(String[] args) {
		Pen pen1=new Pen();
		pen1.color="blue";
		pen1.price=40;
		pen1.inkType="gel";
		pen1.brand="Reynolds";
		Pen pen2=new Pen();
		pen2.color="Red";
		pen2.price=45;
		pen2.inkType="Refil";
		pen2.brand="Cello";
		Pen pen3=new Pen();
		pen3.color="black";
		pen3.price=30;
		pen3.inkType="ink";
		pen3.brand="Camlin";
		Pen[] pens= {pen1,pen2,pen3};
		Pen max=pens[0];
		Pen min=pens[0];
		for(int i=0;i<pens.length;i++) {
			System.out.println(pens[i].color+pens[i].price+pens[i].inkType+pens[i].brand);
			if(pens[i].price>max.price)
				max=pens[i];
			if(pens[i].price<min.price)
				min=pens[i];
		}
		System.out.println(max.price);
		System.out.println(min.price);
	}

}
