package task2;

public class MyProgram {

	public static void main(String[] args) {
		String a="mmarimugesh";
		String b="";
		for(int i=a.length()-1;i>=0;i--) {
			if(a.charAt(i)=='m') {
				continue;
			}
			else {
				b=b+a.charAt(i);
			}
							
		}
		System.out.println(b);

	}

}
