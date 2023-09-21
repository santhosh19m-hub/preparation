package functions;

public class Practice {
	public String check(int a) {
		if(a%2==0)
			return "Even";
		else
			return "Odd";
			
	}
	public int max(int c,int d) {
		if(c>d)
			return c;
		else
			return d;
	}
	public String bigword(String e,String f) {
		if(e.length()>f.length())
			return e;
		else
			return f;
	}
	public void printeven(int[] x) {
		for(int i=0;i<x.length;i++) {
			if(x[i]%2==0)
				System.out.println(x[i]);
		}
	}
	public int printmax(int[] x) {
		int max=x[0];
		for(int i=0;i<x.length;i++) {
			if(x[i]>max)
				max=x[i];
		}
		return max;
	}

}
