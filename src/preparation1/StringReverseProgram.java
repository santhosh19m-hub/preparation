package preparation1;

import java.util.Scanner;

public class StringReverseProgram {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		String a=input.nextLine();
		String b="";
		for(int i=a.length()-1;i>=0;i--) {
			b=b+a.charAt(i);
		}
		System.out.println(b);

	}

}
