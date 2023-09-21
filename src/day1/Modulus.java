package day1;

import java.util.Scanner;

public class Modulus {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Divident");
		int a=input.nextInt();
		System.out.println("Enter the Divider");
		int b=input.nextInt();
		int c=a%b;
		System.out.println("The Modulus Result is "+c);

	}

}
