package preparattionException;

public class Exception1 {

	public static void main(String[] args) {
		String[] a= {"sun","moon","star"};
		try {
		System.out.println(a[6].charAt(5));
		}
		catch(StringIndexOutOfBoundsException si) {
			si.printStackTrace();
		}
		catch(IndexOutOfBoundsException ie) {
			ie.printStackTrace();
			System.out.println(ie);
			System.out.println("Santhosh");
		}
		catch(RuntimeException re) {
			re.printStackTrace();
		}
		catch(Exception e) {
	        System.err.println("Excetion");
	        e.printStackTrace();
		}
		finally {
			System.out.println("Errorsolved");
		}
	}

}
