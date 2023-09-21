package collections;

import java.util.ArrayList;

public class UseBus {

	public static void main(String[] args) {
		Bus b1=new Bus(20,"biue","kandanchavadi",true);
		Bus b2=new Bus(18,"violet","royapuram",false);
		Bus b3=new Bus(22,"Red","manali",true);
		Bus b4=new Bus(24,"Yellow","tondiarpet",false);
		Bus b5=new Bus(26,"Indigo","AnnaSquare",true);
		Bus b6=new Bus(28,"orange","kelambakkam",false);
		Bus b7=new Bus(30,"gray","T.nagar",true);
		ArrayList<Bus>buses=new ArrayList<>();
		buses.add(b1);
		buses.add(b2);
		buses.add(b3);
		buses.add(b4);
		buses.add(b5);
		buses.add(b6);
		buses.add(b7);
		Bus max=buses.get(0);
		for(Bus x:buses) {
			if(x.getNoOfSeats()>max.getNoOfSeats())
				max=x;
		}
		System.out.println(max);
		ArrayList<Bus> govern=new ArrayList<>();
		ArrayList<Bus> privat=new ArrayList<>();
		for(Bus x:buses) {
			if(x.isGovernment()==true)
				govern.add(x);
			else
				privat.add(x);
		}
		System.out.println(govern);
		System.out.println(privat);

	}

}
