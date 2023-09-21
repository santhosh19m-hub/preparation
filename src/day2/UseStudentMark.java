package day2;

public class UseStudentMark {

	public static void main(String[] args) {
		StudentMark a=new StudentMark();
		a.name="Revanth";
		a.english=80;
		a.maths=90;
		a.science=70;
		a.total=a.english+a.maths+a.science;
		a.average=a.total/3f;
		StudentMark b=new StudentMark();
		b.name="Saneer";
		b.english=70;
		b.maths=60;
		b.science=80;
		b.total=b.english+b.maths+b.science;
		b.average=b.total/3f;
		StudentMark c=new StudentMark();
		c.name="Ajay";
		c.english=50;
		c.maths=40;
		c.science=60;
		c.total=c.english+c.maths+c.science;
		c.average=c.total/3f;
		int total=a.total+b.total+c.total;
		float average=(a.average+b.average+c.average)/3;
		System.out.println(a.name+" total is"+a.total+b.name+" total is "+b.total+c.name+"total is "+c.total);
		System.out.println(a.name+" Average is"+a.average+b.name+" Average is "+b.average+c.name+"Average is "+c.average);
		System.out.println("The Total of Total student Mark is "+total);
		System.out.println("The Total of Average student Mark is "+average);
		

	}

}
