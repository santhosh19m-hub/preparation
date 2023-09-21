package task2;

public class TaskBean {
public void anagram(String a,String b) {
	if(a.length()==b.length()) {
		String[] c=a.split("");
		int count=0;
		for(int i=0;i<a.length();i++) {
			if(b.contains(c[i])) {
				count=count+1;
			}
		}
		if(count==c.length) {
			System.out.println(a+" and "+b+" are Anagram");
		}
		else {
			System.out.println(a+" and "+b+" are Not Anagram");
		}
	}
	else {
		System.out.println(a+" and "+b+" are Not Anagram");
	}
}
public String commonPrefix(String[] a)
{
     String result = a[0];
   for(int i = 1; i < a.length; i++){
       while(a[i].indexOf(result) != 0){
            result = result.substring(0, result.length()-1);
           if(result.isEmpty()){
                return "No Common Prefix";
            }
        }
    }
    return result;
}
public void dupinSentence(String a) {
	String[] b=a.split(" ");
	for(int i=0;i<b.length;i++) {
		for(int j=i+1;j<b.length;j++) {
			if(b[i].equals(b[j])) {
				System.out.println(b[i]);
			}
		}
	}
}
public void pattern() {
	for(int i=1;i<=5;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(i);
		}
		System.out.print("  ");
	}
}
public String[] reverseString()
}
