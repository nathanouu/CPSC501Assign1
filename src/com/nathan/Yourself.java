package com.nathan;

public class Yourself extends Person
{


	public int age;
	public double tfsa;
	public double entertainment;
	public double studentLoans;
	public double gas;
	public double monthlyTotal;
	public double loans;


	public Yourself(int age, String gender, double entertainmentCost, double monthlyGas, double tfsaAmount, double studentLoans)
	{

		super(age, gender);
		entertainment = entertainmentCost;
		tfsa = tfsaAmount;
		gas = monthlyGas;
		loans = studentLoans;


	}

	public int getAge()
	{
		return super.age;
	}

	public String getGender()
	{
		return super.gender;

	}


	public double calculateTfsa()
	{
		double newTfsa = tfsa * 1.05;
		return newTfsa;
	}

	public double monthlyStudentLoans()
	{
		loans = loans / 12;
		return loans;
	}


	public double yourselfMonthlyIncome()
	{
		double monthlyIncome = entertainment - gas + calculateTfsa() - monthlyStudentLoans();
		return monthlyIncome;
	}



}
























