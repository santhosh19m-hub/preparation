package oops1;

public class UseChair {

	public static void main(String[] args) {
		Chair a=new Chair();
		a.setMaterial("plastic");
		a.setPrice(1000);
		a.setChairType(null);
		Chair b=new Chair();
		b.setMaterial("Stell");
		b.setPrice(2000);
		b.setChairType(null);
		Chair c=new Chair();
		c.setMaterial("Iron");
		c.setPrice(500);
		c.setChairType(null);
		Chair[] chairs= {a,b,c};
		Chair max=a;
		for(int i=0;i<chairs.length;i++) {
			if(chairs[i].getPrice()>max.getPrice())
				max=chairs[i];
		}
		System.out.println(max.getMaterial()+" "+max.getPrice()+" "+max.getChairType());

	}

}
