package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class UseAc {

	public static void main(String[] args) {
		Ac a1=new Ac("croma",40000,1.5f,true);
		Ac a2=new Ac("bluestar",30000,2.0f,false);
		Ac a3=new Ac("LG",75000,3.0f,true);
		Ac a4=new Ac("onida",20000,1.0f,false);
		Ac a5=new Ac("voltas",15000,0.5f,true);
		Ac a6=new Ac("havells",50000,2.5f,false);
		Ac a7=new Ac("Sony",40000,1.5f,true);
		ArrayList<Ac>acs=new ArrayList<>();
		acs.add(a1);
		acs.add(a2);
		acs.add(a3);
		acs.add(a4);
		acs.add(a5);
		acs.add(a6);
		acs.add(a7);
		acs.stream().filter(x->x.getPrice()>20000).forEach(y->System.out.println(y));
		acs.stream().map(i->i.getBrand()).forEach(x->System.out.println(x));
		acs.stream().filter(x->x.isInverter()==true).map(i->i.getBrand()).forEach(x->System.out.println(x));
		long count=acs.stream().filter(temp->temp.isInverter()==true).count();
		System.out.println(count);
		List<Ac>san=acs.stream().filter(j->j.isInverter()==true&&j.getTons()>=1.5f).collect(Collectors.toList());
		System.out.println(san);
		List<String>san1=acs.stream().filter(j->j.isInverter()==true&&j.getTons()>=1.5f).map(a->a.getBrand()).collect(Collectors.toList());
		System.out.println(san1);
		Map<String,Ac>acsmap=acs.stream().collect(Collectors.toMap(x->x.getBrand(),y->y));
		System.out.println(acsmap);
		
	}
	}


