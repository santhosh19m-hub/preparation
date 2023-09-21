package oops3;

public class WashingMachine extends Electronics {
	public int resaleValue(int price,int yearsUsed) {
		if(yearsUsed<=1)
			return price-(price*10/100);
		else 
			return price-(price*30/100);
	}

}
