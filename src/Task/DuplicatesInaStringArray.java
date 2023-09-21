package Task;

public class DuplicatesInaStringArray {

	public static void main(String[] args) {
		String[] name= {"USA","UK","INDIA","USA"};
		for(int i=0;i<name.length;i++) {
			for(int j=i+1;j<name.length;j++) {
				if(name[i].equals(name[j])) {
					System.out.println(name[i]);
				}
			}
		}

	}

}
