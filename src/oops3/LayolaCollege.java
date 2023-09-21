package oops3;

public class LayolaCollege implements College {
	public String collegeType(String degree) {
		if(degree.equalsIgnoreCase("B.E"))
			return "Engineering College";
		else if(degree.equalsIgnoreCase("B.sc"))
			return "Arts&Science College";
		else if(degree.equalsIgnoreCase("m.b.b.s"))
			return "Medical College";
		else
			return "mom";
	}
	public int duration(String degree) {
		return 5;
	}

}
