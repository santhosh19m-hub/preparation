package collections;

public class BankCustomer {
private long accNo;
private int bal;
private String name;
private boolean isSavingsAccount;
public long getAccNo() {
	return accNo;
}
public void setAccNo(long accNo) {
	this.accNo = accNo;
}
public int getBal() {
	return bal;
}
public void setBal(int bal) {
	this.bal = bal;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public boolean isSavingsAccount() {
	return isSavingsAccount;
}
public void setSavingsAccount(boolean isSavingsAccount) {
	this.isSavingsAccount = isSavingsAccount;
}
public BankCustomer(long accNo, int bal, String name, boolean isSavingsAccount) {
	super();
	this.accNo = accNo;
	this.bal = bal;
	this.name = name;
	this.isSavingsAccount = isSavingsAccount;
}
@Override
public String toString() {
	return "BankCustomer [accNo=" + accNo + ", bal=" + bal + ", name=" + name + ", isSavingsAccount=" + isSavingsAccount
			+ "]";
}

}
