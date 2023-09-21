package for2;

public class Homework {
	public static void main(String[] args) {
		String[] a= {"oslo","bergen","wales","munich","geneva"};
		for(int i=0;i<a.length;i++) {
			if(a[i].length()%2==0) {
				int b=a[i].length()/2;
				System.out.println(a[i].charAt(b-1)+""+a[i].charAt(b));
			}
				else {
					int c=a[i].length()/2;
			System.out.println(a[i].charAt(c));
		}
		}
	}

}
