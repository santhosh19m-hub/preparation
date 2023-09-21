package task2;

public class MariMukesh {

	public static void main(String[] args) {
		String a="mmarimugesh";
		String temp="";
		for(int i=a.length()-1;i>=0;i--) {
			temp=temp+a.charAt(i);
		}
		System.out.println(temp);
		for(int i=0;i<temp.length();i++) {
			int count=0;
			for(int j=i+1;j<temp.length();j++) {
				if(temp.charAt(i)==temp.charAt(j)) {
					count++;
				}
			}
			if(count!=1) {
				System.out.println(temp.charAt(i));
			}
		}

	}

}
