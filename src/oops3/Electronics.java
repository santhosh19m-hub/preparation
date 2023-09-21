package oops3;

public abstract class Electronics {
	public String onOff(boolean isOn) {
		if(isOn==true) {
			return "It is working";
		}
		else {
			return "It is not working";
		}
	}
	public abstract int resaleValue(int price,int yearsUsed);

}
