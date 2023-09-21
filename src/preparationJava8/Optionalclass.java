package preparationJava8;

import java.util.Optional;

public class Optionalclass {
	public static void main(String[] args) {
		String[] name=new String[10];
		name[5]="Santhosh";
		Optional<String> a=Optional.ofNullable(name[5]);
		//if(a.isPresent())
			//System.out.println(name[5]);
		//else
			//System.out.println("The Value is Null");
		System.out.println(a.orElse("It is null"));
	}

}
