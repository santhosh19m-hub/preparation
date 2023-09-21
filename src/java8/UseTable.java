package java8;

public class UseTable {

	public static void main(String[] args) {
		Table t=new Table();
		System.out.println(t.findPrice("wood", 3000));
		System.out.println(Furniture.durability("Wood"));

	}

}
