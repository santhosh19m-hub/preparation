package stream;

import java.util.ArrayList;
import java.util.Comparator;

public class Sorted {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<>();
		a.add(10);
		a.add(20);
		a.add(100);
		a.add(50);
		a.add(70);
		a.add(80);
		a.add(80);
		a.add(40);
		a.add(40);
		a.add(110);
		a.stream().sorted().forEach(x-> System.out.println(x));
		a.stream().sorted(Comparator.reverseOrder()).forEach(x-> System.out.println(x));
		a.stream().distinct().sorted().forEach(x-> System.out.println(x));
		a.stream().sorted().limit(5).forEach(x-> System.out.println(x));
		a.stream().sorted().skip(3).limit(3).forEach(x-> System.out.println(x));
		Integer max=a.stream().max(Integer::compare).get();
		System.out.println("aaaa"+max);
		Integer min=a.stream().min(Integer::compare).get();
		System.out.println("bbbbb"+min);
		boolean value=a.stream().anyMatch(x-> x%2!=0);
		System.out.println(value);
		Integer max1=a.stream().sorted(Comparator.reverseOrder()).findFirst().get();
		System.out.println(max1);
	}

}
