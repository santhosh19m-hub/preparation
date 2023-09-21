package preparationJava8;

import java.util.Arrays;
import java.util.List;

public class UseEven {

	public static void main(String[] args) {
		List<Integer> a=Arrays.asList(10,50,30,7,65);
        Even1 e=new Even1();
        Even s=e::san;
        s.findEven(a);
	}

}
