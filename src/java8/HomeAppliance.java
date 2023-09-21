package java8;

public interface HomeAppliance {
public static void onOff(boolean isOn) {
	if(isOn==true) {
		System.out.println("It is working");
	}
	else {
		System.out.println("It is not working");
	}
}
public String appliance();
}
