package com.person.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="human_details")
public class Human {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String name;
private int age;
private String fathersName;
private long phoneNumber;
private String natiive;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getFathersName() {
	return fathersName;
}
public void setFathersName(String fathersName) {
	this.fathersName = fathersName;
}
public long getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(long phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public String getNatiive() {
	return natiive;
}
public void setNatiive(String natiive) {
	this.natiive = natiive;
}

}
