package Task;

public class DuplicatesinASentence {

	public static void main(String[] args) {
	String a="I am Ram and I am developer";
	String[] b=a.split(" ");
	for(int i=0;i<b.length;i++) {
		for(int j=i+1;j<b.length;j++) {
			if(b[i].equals(b[j])) {
				System.out.println(b[i]);
			}
		}
	}
	}

}
