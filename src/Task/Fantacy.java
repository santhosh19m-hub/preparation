package Task;

public class Fantacy {
	public static void main(String[] args) {
		String a="a5b2d5";
		String[] b=a.split("");
		for(int i=0;i<a.length();i=i+2) {
			for(int j=0;j<Integer.parseInt(b[i+1]);j++) {
				System.out.print(b[i]);
			}
			//System.out.println();
		}
	}

}
