package collections;

import java.util.ArrayList;

public class UseStudent {

	public static void main(String[] args) {
		Student s1=new Student("San",14,5,true);
		Student s2=new Student("yuvi",12,3,true);
		Student s3=new Student("ajay",14,5,true);
		Student s4=new Student("revanth",14,5,true);
		Student s5=new Student("sekar",17,12,false);
		Student s6=new Student("ajith",14,5,false);
		Student s7=new Student("shyam",14,5,false);
		ArrayList<Student>s=new ArrayList<>();
		s.add(s1);
		s.add(s2);
		s.add(s3);
		s.add(s4);
		s.add(s5);
		s.add(s6);
		s.add(s7);
		Student max=s.get(0);
		for(int i=0;i<s.size();i++) {
			if(s.get(i).getAge()>max.getAge()) {
				max=s.get(i);
			}
		}
			System.out.println(max);
			Student min=s.get(0);
			for(Student x:s) {
				if(x.getAge()<min.getAge())
					min=x;
			}
		System.out.println(min);
		s.forEach(x->System.out.println(x));
		System.out.println(s);
		ArrayList<Student> male=new ArrayList<>();
		s.forEach(x-> {
			if(x.getIsMale()==true)
				male.add(x);
		});
	}

}
