package for2;

public class MaximumInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		int d=Integer.parseInt(args[3]);
		int e=Integer.parseInt(args[4]);
		int[] nums= {a,b,c,d,e};
		int max=nums[0];
		for(int i=0;i<=nums.length-1;i++) {
			if(nums[i]>=max)
				max=nums[i];
		}
	System.out.println(max);
	}
	

}
