package Task;

public class ReveseStringsinaArray {
public String[] rev(String[] a) {
	String[] b=new String[a.length];
	for(int i=0;i<a.length;i++) {
		String c="";
		for(int j=a[i].length()-1;j>=0;j--) {
			c=c+a[i].charAt(j);
		}
		b[i]=c;
	}
	return b;
}
}
