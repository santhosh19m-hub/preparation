package for3;

public class UseFan {

	public static void main(String[] args) {
		Fan fan1=new Fan();
		fan1.brand="usha";
		fan1.price=5000;
		fan1.noOfWings=3;
		fan1.taxPercent=5;
		Fan fan2=new Fan();
		fan2.brand="crompton";
		fan2.price=6000;
		fan2.noOfWings=4;
		fan2.taxPercent=10;
		Fan fan3=new Fan();
		fan3.brand="Havells";
		fan3.price=7000;
		fan3.noOfWings=6;
		fan3.taxPercent=8;
		Fan[] fans= {fan1,fan2,fan3};
		Fan max=fan1;
		Fan min=fan1;
		int tot=0;
		int avg=0;
		for(Fan n:fans) {
			System.out.println(n.brand.toUpperCase()+" "+n.price+" "+n.noOfWings+" "+n.taxPercent);
			n.netPrice=n.price+(n.price*n.taxPercent/100);
			System.out.println(n.netPrice);
			if(n.netPrice>max.netPrice) {
		    max=n;
		}
			if(n.netPrice<min.netPrice) {
				min=n;
			}
			tot=tot+n.netPrice;
			
		}
		System.out.println(max.netPrice+" "+min.netPrice);
		avg=tot/fans.length;
		System.out.println(tot+" "+avg);
	}

}
