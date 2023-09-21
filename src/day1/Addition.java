package day1;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the first number to add");
		int a=input.nextInt();
		System.out.println("Enter the Second number to add");
		int b=input.nextInt();
		int c=a+b;
		System.out.println("Addition of given Two Number is "+c);
		

	}

}
