package collections;

public class Student {
private String name;
private int age;
private int std;
private boolean isMale;
public Student(String name,int age,int std,boolean isMale) {
	this.name=name;
	this.age=age;
	this.std=std;
	this.isMale=isMale;
}
public String toString() {
	return name+" "+age+" "+std+" "+isMale;
}
public void setName(String name) {
	this.name=name;
}
public String getName() {
	return name;
}
public void setAge(int age) {
	this.age=age;
}
public int getAge() {
	return age;
}
public void setStd(int std) {
	this.std=std;
}
public int getStd() {
	return std;
}
public void setIsMale(boolean isMale) {
	this.isMale=isMale;
}
public boolean getIsMale() {
	return isMale;
}
}
