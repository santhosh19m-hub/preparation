package Task;

public class Demo4prime {
	public void findPrime(int[] a) {
		for(int i=0;i<a.length;i++) {
			boolean isPrime=true;
			for(int j=2;j<a[i];j++) {
				if(a[i]%j==0) {
					isPrime=false;
				}
			}
			if(isPrime==true) {
				System.out.print(a[i]+" ");
			}
		}
	}

}
