package java8;
@FunctionalInterface
public interface Calculator {
public int find(int a,int b);
public static String manipulation() {
	return "Arithmetic Calculation";
}
public default void referanceType() {
	System.out.println("Functional Interface is implemented with lambda Expression(Anonymus type reference)");
}
}
