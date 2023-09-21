package preparation;

public class StringNumbertoString {

	public static void main(String[] args) {
		String s="a1b2c3";
		String[] b=s.split("");
		for(int i=0;i<b.length;i=i+2) {
			for(int j=0;j<Integer.parseInt(b[i+1]);j++) {
				System.out.print(b[i]);
			}
		}

	}

}
