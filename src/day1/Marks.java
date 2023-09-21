package day1;

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Tamil Mark");
		int a=input.nextInt();
		System.out.println("Enter the English Mark");
		int b=input.nextInt();
		System.out.println("Enter the Maths Mark");
		int c=input.nextInt();
		System.out.println("Enter the Science Mark");
		int d=input.nextInt();
		System.out.println("Enter the Social Science Mark");
		int e=input.nextInt();
		int total=a+b+c+d+e;
		int ave=total/5;
		System.out.println("The Total Mark is "+total+"\nThe Average of Marks is "+ave);

	}

}
