package for3;

public class UseChair {

	public static void main(String[] args) {
		Chair chair1=new Chair();
		chair1.material="plastic";
		chair1.color="blue";
		chair1.price=1000;
		chair1.discountPercent=5;
		Chair chair2=new Chair();
		chair2.material="wood";
		chair2.color="sandal";
		chair2.price=1500;
		chair2.discountPercent=10;
		Chair chair3=new Chair();
		chair3.material="iron";
		chair3.color="water";
		chair3.price=2000;
		chair3.discountPercent=15;
		Chair[] chairs= {chair1,chair2,chair3};
		int total=0;
		for(Chair n:chairs) {
			n.netPrice=n.price-(n.price*n.discountPercent/100);
		System.out.println(n.material.toUpperCase()+" "+n.color.toUpperCase()+" "+n.netPrice);
		total=total+n.netPrice;
		}
		System.out.println(total);

	}

}
