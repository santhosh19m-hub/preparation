package oops3;

public class ItEmployee extends Employee {
	public void eat() {
		System.out.println("Eat Three times a Day");
	}
	public String Sleep(int time) {
		if(time>0||time<6||time>21||time<24)
			return "Sleeping Time";
		else
			return "Working time";
	}
	public int calculateSalary(String designation) {
		if(designation.equalsIgnoreCase("HR"))
			return 75000;
		else if(designation.equalsIgnoreCase("TL"))
			return 50000;
		else if(designation.equalsIgnoreCase("Developer"))
			return 35000;
		else
			return 20000;
	}

}
