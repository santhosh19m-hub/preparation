package stream;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class UseSchool {

	public static void main(String[] args) {
		School s1=new School("RamaKrishna","HigherSecondary","Tondiarpet",900,false);
		School s2=new School("K.C.S","Primary","Navalur",500,true);
		School s3=new School("vivekananda","middle","Thiruvottiyur",400,false);
		School s4=new School("D.A.V","HigherSecondary","Choolai",500,true);
		School s5=new School("P.A.K","primary","Manali",600,false);
		School s6=new School("primbuds","play","Saidapet",800,true);
		School s7=new School("Vallal","HigherSecondary","Washermenpet",400,false);
		School s8=new School("Ewart","secondary","Mint",500,true);
		HashMap<String,School>schools=new HashMap<>();
		schools.put(s1.getName(), s1);
		schools.put(s2.getName(), s2);
		schools.put(s3.getName(), s3);
		schools.put(s4.getName(), s4);
		schools.put(s5.getName(), s5);
		schools.put(s6.getName(), s6);
		schools.put(s7.getName(), s7);
		schools.put(s8.getName(), s8);
		List<School>ss=schools.values().stream().filter(a->a.isPrivate()==true).collect(Collectors.toList());
		System.out.println(ss);
		List<School>ss1=schools.values().stream().filter(a->a.isPrivate()==false).collect(Collectors.toList());
		System.out.println(ss1);
		long count=schools.values().stream().filter(x->x.getSchooltype().equalsIgnoreCase("HigherSecondary")).count();
		System.out.println(count);
		long count1=schools.values().stream().filter(x->x.getSchooltype().equalsIgnoreCase("primary")).count();
		System.out.println(count1);
		List<String>ss12=schools.values().stream().filter(a->a.isPrivate()==false&&a.getNoOfStudents()>=500).map(b->b.getName()).collect(Collectors.toList());
		System.out.println(ss12);
	}

}
