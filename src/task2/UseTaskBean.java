package task2;

public class UseTaskBean {

	public static void main(String[] args) {
		TaskBean tb=new TaskBean();
		tb.anagram("race", "care");
        String[] a={"san","anuprabha","anukavi","anusingh"};
        System.out.println(tb.commonPrefix(a));
        String b="I am raj I am develeper";
        tb.dupinSentence(b);
        tb.pattern();
	}

}
