package java8;

import java.util.Optional;

public class Demo2 {

	public static void main(String[] args) {
		String word="Santhosh";
		Optional<String> check=Optional.ofNullable(word);
		System.out.println(check.isPresent());
		if(check.isPresent()==true) {
			System.out.println(word.toUpperCase());
		    System.out.println(check.get());
		}
		else
			System.out.println("The value is Null");
		System.out.println(check);
		System.out.println(check.get());
		
	}

}
