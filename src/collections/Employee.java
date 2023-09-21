package collections;

import java.util.HashMap;

public class Employee {

	public static void main(String[] args) {
		String emp1="Rajesh";
		String emp2="pugazh";
		String emp3="Pragadeesh";
		HashMap<Integer,String> employees=new HashMap<>();
		employees.put(101, emp1);
		employees.put(108, emp2);
		employees.put(103, emp3);
		System.out.println(employees);
		System.out.println(employees.keySet());
		System.out.println(employees.values());
		for(Integer i:employees.keySet()) {
			System.out.println(i+" "+employees.get(i));
		}
		for(String e:employees.values()) {
			System.out.println(e);
		}
		employees.keySet().forEach(x-> System.out.println(x+" "+employees.get(x)));
		employees.values().forEach(y-> System.out.println(y));
		employees.forEach((x,y)-> System.out.println(x+" "+y));

	}

}
