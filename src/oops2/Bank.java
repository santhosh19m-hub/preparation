package oops2;

public class Bank {
public int loan() {
	return 50000;
}
public int loan(int salary) {
	return (salary*10)+50000;
}
public int loan(int salary,int propertyValue) {
	return (propertyValue*50/100)+(salary*10)+50000;
}
}
