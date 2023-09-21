package stream;

public class School {
private String name;
private String schooltype;
private String location;
private int noOfStudents;
private boolean isPrivate;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSchooltype() {
	return schooltype;
}
public void setSchooltype(String schooltype) {
	this.schooltype = schooltype;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public int getNoOfStudents() {
	return noOfStudents;
}
public void setNoOfStudents(int noOfStudents) {
	this.noOfStudents = noOfStudents;
}
public boolean isPrivate() {
	return isPrivate;
}
public void setPrivate(boolean isPrivate) {
	this.isPrivate = isPrivate;
}
public School(String name, String schooltype, String location, int noOfStudents, boolean isPrivate) {
	super();
	this.name = name;
	this.schooltype = schooltype;
	this.location = location;
	this.noOfStudents = noOfStudents;
	this.isPrivate = isPrivate;
}
@Override
public String toString() {
	return "School [name=" + name + ", schooltype=" + schooltype + ", location=" + location + ", noOfStudents="
			+ noOfStudents + ", isPrivate=" + isPrivate + "]";
}

}
