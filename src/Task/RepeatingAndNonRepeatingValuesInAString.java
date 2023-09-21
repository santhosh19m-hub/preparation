package Task;

public class RepeatingAndNonRepeatingValuesInAString {

	public static void main(String[] args) {
		String value="honeybee";
		int rep=0;
		int non=0;
		char[] a=value.toCharArray();
		for(int i=0;i<a.length;i++) {
			int count=0;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
					a[j]='5';
				}
			}
				if(count==0&&a[i]!='5') {
					rep++;
				}
				else if(a[i]!='5'){
					non++;
					System.out.println(a[i]+"="+(count+1));
				}
			
		}
		System.out.println("Repeatin Count is "+non+" Non Repeating Count is "+rep);
		
	}
}
