package preparationJava8;

import java.util.List;

public class Even1 {
public void san(List<Integer> b) {
	int min=b.get(0);
	for(int i=0;i<b.size();i++) {
		if(b.get(i)<min) {
			min=b.get(i);
		}
	}
	if(min%2==0) {
		System.out.println(min +"is even");
	}
	else {
		System.out.println(min+" is odd");
	}
}
}
