package Task;

public class Demo {
public String[] san(String[] a) {
	String[] b=new String[a.length];
	for(int i=0;i<a.length;i++) {
		b[i]=a[i].toUpperCase();
	}
	return b;
}
}
