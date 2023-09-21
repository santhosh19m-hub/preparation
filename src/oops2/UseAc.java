package oops2;

public class UseAc {

	public static void main(String[] args) {
		Ac a=new Ac();
		a.brand="Croma";
		a.price=40000;
		a.isWarranty=true;
		a.isInverter=true;
		a.tons=4.0f;
		System.out.println(a.brand+" "+a.price+" "+a.isWarranty+" "+a.isInverter+" "+a.tons);

	}

}
