package preparation1;

public class StringImMutable {

	public static void main(String[] args) {
		String a="Hello";
		System.out.println(a.hashCode());
		a=a.concat("world");
		System.out.println(a.hashCode());
		StringBuffer sb=new StringBuffer(a);
		System.out.println(sb.hashCode());
		sb=sb.append("false");
		System.out.println(sb.hashCode());
		System.out.println(a);
		StringBuilder sbu=new StringBuilder(a);
		System.out.println(sbu.reverse());

	}

}
