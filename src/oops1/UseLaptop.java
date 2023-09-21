package oops1;

public class UseLaptop {

	public static void main(String[] args) {
		Battery b1=new Battery(2000,1500,750);
		Laptop l1=new Laptop("Lenovo",80000,4,b1);
		Battery b2=new Battery(3000,2000,800);
		Laptop l2=new Laptop("Acer",50000,6,b2);
		Laptop l3=new Laptop("Dell",90000,8,b2);
		Laptop[] laps= {l1,l2,l3};
		Laptop max=l1;
		for(int i=0;i<laps.length;i++) {
			if(laps[i].getPrice()>max.getPrice())
				max=laps[i];
		}
		System.out.println(max);
		

	}

}
