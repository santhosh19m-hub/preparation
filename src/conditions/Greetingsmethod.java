package conditions;

public class Greetingsmethod {

	public static void main(String[] args) {
		int a=3;
		if((a>=4)&&(a<=11)) {
			System.out.println("Good Morning");
	}
		else if((a>=12)&&(a<=15)) {
			System.out.println("Good Afternoon");
	}
		else if((a>=16)&&(a<=18)) {
			System.out.println("Good Evening");
	}
		else if((a>=19&&a<=24)||(a>=0&&a<=4)) {
			System.out.println("Good Night");
	}
		else {
			System.out.println("Not a Timing");
		}
	}

}
