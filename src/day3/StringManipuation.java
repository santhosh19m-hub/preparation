package day3;

public class StringManipuation {

	public static void main(String[] args) {
		String name1="Pugazh";
		String name2="Pugazh";
		String name3=new String("Pugazh");
		System.out.println(name1==name2);
		System.out.println(name1==name3);
		System.out.println(name1.equals(name3));

	}

}
