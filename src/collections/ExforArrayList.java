package collections;

import java.util.ArrayList;

public class ExforArrayList {

	public static void main(String[] args) {
		String pen1="Cello";
		String pen2="Natraj";
		String pen3="Reynolds";
		ArrayList<String> pens=new ArrayList<>();
		pens.add(pen1);
		pens.add(pen2);
		pens.add(pen3);
		System.out.println(pens);
		pens.add(2,"Flair");
		System.out.println(pens);
		pens.add("Rorito");
		System.out.println(pens);
		System.out.println(pens.get(0));
		pens.set(3, "Camilin");
		System.out.println(pens);
		pens.remove(2);
		System.out.println(pens);
		for(int i=0;i<pens.size();i++) {
			System.out.println(pens.get(i));
		}
		for(String a:pens) {
			System.out.println(a);
		}
		pens.forEach(x->System.out.println(x));
		pens.forEach(x-> {
			if(x.contains("a"))
				System.out.println(x);
		});

	}

}
