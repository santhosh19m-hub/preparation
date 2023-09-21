package collections;

import java.util.HashMap;

public class UseBankCustomer {

	public static void main(String[] args) {
		BankCustomer b1=new BankCustomer(6111364197l,50000,"Santhosh",true);
		BankCustomer b2=new BankCustomer(6111364191l,30000,"Veera",false);
		BankCustomer b3=new BankCustomer(6111364192l,80000,"Yuvaraj",false);
		BankCustomer b4=new BankCustomer(6111364193l,90000,"Sesha",true);
		BankCustomer b5=new BankCustomer(6111364194l,40000,"Manju",true);
		BankCustomer b6=new BankCustomer(6111364195l,100000,"Bharath",false);
		BankCustomer b7=new BankCustomer(6111364196l,20000,"Gokul",true);
		BankCustomer b8=new BankCustomer(6111364198l,18000,"Gopal",false);
		HashMap<Long,BankCustomer> customers=new HashMap<>();
		customers.put(b1.getAccNo(),b1);
		customers.put(b2.getAccNo(),b2);
		customers.put(b3.getAccNo(),b3);
		customers.put(b4.getAccNo(),b4);
		customers.put(b5.getAccNo(),b5);
		customers.put(b6.getAccNo(),b6);
		customers.put(b7.getAccNo(),b7);
		customers.put(b8.getAccNo(),b8);
		for(Long l:customers.keySet()) {
			System.out.println(l+" "+customers.get(l));
		}
		BankCustomer max=b1;
		for(BankCustomer l:customers.values()) {
			if(l.getBal()>max.getBal())
				max=l;
		}
		System.out.println(max);
	}

}
