package for2;

public class MaximumLengthString {

	public static void main(String[] args) {
			String[] a= {"oslo","bergen","wales","munich","geneva"};
			String max="";
			for(int i=0;i<a.length;i++) {
				if(a[i].length()>=max.length())
					max=a[i];
			}
			System.out.println(max);

	}

}
