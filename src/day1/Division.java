package day1;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Divident");
		int a=input.nextInt();
		System.out.println("Enter the Divider");
		int b=input.nextInt();
		int c=a/b;
		System.out.println("The Division Result is "+c);

	}

}
