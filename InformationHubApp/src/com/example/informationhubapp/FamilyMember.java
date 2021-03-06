package com.example.informationhubapp;

public class FamilyMember {
	
	private String name;
	private boolean gender;
	private int age;
	private String birthday;
	private String weight;
	private String height;
	private String color;
	
	public FamilyMember() {
		
	}
	
	public FamilyMember(String n, boolean g, int a, String b, String w, String h, String c) {
		name = n;
		gender = g;
		age = a;
		birthday = b;
		weight = w;
		height = h;
		color = c;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public void setGender(boolean g) {
		gender = g;
	} // Male is true, Female is false
	
	public void setAge(int a) {
		age = a;
	}
	
	public void setBirthday(String b) {
		birthday = b;
	}
	
	public void setWeight(String w) {
		weight = w;
	}
	
	public void setHeight(String h) {
		height = h;
	}
	
	public void setColor(String c) {
		color = c;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean getGender() {
		return gender;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getBirthday() {
		return birthday;
	}
	
	public String getWeight() {
		return weight;
	}
	
	public String getHeight() {
		return height;
	}
	
	public String getColor() {
		return color;
	}
	
}
