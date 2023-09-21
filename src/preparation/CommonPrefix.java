package preparation;

public class CommonPrefix {

	public static void main(String[] args) {
		String[] a= {"anu","anugraha","anuprabha","anuradha","anupriya"};
		String res=a[2];
		for(int i=0;i<a.length;i++) {
			while(a[i].indexOf(res)!=0) {
				res=res.substring(0,res.length()-1);
			}
		}
        System.out.println(res);
	}

}
