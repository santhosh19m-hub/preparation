package preparation;

public class StringManipulation {

	public static void main(String[] args) {
		String a="2+1-1";
		String[] num=a.split("\\d+");
		String[] sym=a.split("\\D");
		int c=Integer.parseInt(sym[0]);
		for(int i=1;i<num.length;i++) {
			switch(num[i]) {
			case "+" :
				c=c+Integer.parseInt(sym[i]);
				break;
			case "-" :
				c=c-Integer.parseInt(sym[i]);
				break;
			}
		}
		System.out.println(c);

	}

}
