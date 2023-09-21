package oops1;

public class Battery {
private int mAh;
private int price;
private int watts;
public void setMAh(int mAh) {
	this.mAh=mAh;
}
public int getMAh() {
	return mAh;
}
public void setPrice(int price) {
	this.price=price;
}
public int getPrice() {
	return price;
}
public void setWatts(int watts) {
	this.watts=watts;
}
public int getWatts() {
	return watts;
}
public Battery(int mAh,int price,int watts) {
	this.mAh=mAh;
	this.price=price;
	this.watts=watts;
}
public String toString() {
	return mAh+" "+price+" "+watts;
}
}
