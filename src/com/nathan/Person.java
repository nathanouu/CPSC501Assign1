package com.nathan;

public class Person
{

	protected int age;
	protected String gender;
	protected double tfsa;
	


	public Person(int age, String gender)
	{
		this.age = age;
		this.gender = gender;
	}


	protected double calculateTfsa()
	{
		double newTfsa = tfsa * 1.05;
		return newTfsa;
	}

	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}
	

}