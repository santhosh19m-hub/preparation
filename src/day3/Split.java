package day3;

public class Split {

	public static void main(String[] args) {
		String a="Santhosh#Revanth#Saneer#Ajay";
		String[] b=a.split("#");
		System.out.println(b[0]+","+b[1]+","+b[2]+","+b[3]);

	}

}
