package for2;

public class EvenLenthString {

	public static void main(String[] args) {
		String[] a= {"oslo","bergen","wales","munich","geneva"};
		for(int i=0;i<a.length;i++) {
			if(a[i].length()%2==0)
				System.out.println(a[i]);
		}

	}

}
