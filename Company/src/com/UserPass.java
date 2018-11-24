package com;

public class UserPass {
	private String name;
	private String lastName;
	private int age;
	private int yearsThatWork;
	private String userName;
	private String password;
	private boolean vaziat;
	private int trye;

	public UserPass(String name, String lastName, int age, int yearsThatWork,
			String userName, String password, boolean vaziat,int trye) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.age = age;
		this.yearsThatWork = yearsThatWork;
		this.userName = userName;
		this.password = password;
		this.vaziat = vaziat;
		this.trye = trye;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getYearsThatWork() {
		return yearsThatWork;
	}
	public void setYearsThatWork(int yearsThatWork) {
		this.yearsThatWork = yearsThatWork;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isVaziat() {
		return vaziat;
	}
	public void setVaziat(boolean vaziat) {
		this.vaziat = vaziat;
	}
	public int getTrye() {
		return trye;
	}
	public void setTrye(int trye) {
		this.trye = trye;
	}
	
	
	

}
