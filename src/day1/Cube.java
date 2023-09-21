package day1;

import java.util.Scanner;

public class Cube {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number to be Cubed");
		int a=input.nextInt();
		int b=a*a*a;
		System.out.println("The Cube of the given Number is  "+b);

	}

}
