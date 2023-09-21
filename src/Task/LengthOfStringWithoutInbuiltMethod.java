package Task;

public class LengthOfStringWithoutInbuiltMethod {

	public static void main(String[] args) {
		String a="Software";
		int count=0;
		char[] c=a.toCharArray();
		for(int i=0;i<c.length;i++) {
			count++;
		}
		System.out.println(count);

	}

}
