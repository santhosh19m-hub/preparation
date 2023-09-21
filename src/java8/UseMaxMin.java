package java8;

public class UseMaxMin {

	public static void main(String[] args) {
		MaxMin max=new Demo()::findMax;
		int[] nums= {5,6,9,8};
		System.out.println(max.find(nums));

	}

}
