package com.nathan;

import java.util.Scanner;

public class Main
{
	public static void main (String [] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Family members in household: ");
		int numFamilyMembers = scanner.nextInt();




		System.out.println("Enter your age: ");
		int yourAge = scanner.nextInt();

		System.out.println("Enter your gender (M/F/X): ");
		String yourGender = scanner.next();

		System.out.println("Enter your entertainment costs (going out/miscellaneous): ");
		double yourEntertainment = scanner.nextDouble();

		System.out.println("Enter your vehicle gas bill per month: ");
		double yourGasBill = scanner.nextDouble();

		System.out.println("Enter your monthly TFSA contribution: ");
		double yourTFSA = scanner.nextDouble();


		System.out.println("Enter your annual student loans: ");
		double yourLoans = scanner.nextDouble();




		System.out.println("Enter father's age: ");
		int fathersAge = scanner.nextInt();

		System.out.println("Enter father's gender (M/F/X): ");
		String fathersGender = scanner.next();

		System.out.println("Enter father's yearly salary: ");
		double fathersSalary = scanner.nextDouble();

		System.out.println("Enter father's monthly bills (groceries, electricity, water, cellphone): ");
		double fathersBills = scanner.nextDouble();

		System.out.println("Enter father's entertainment costs (going out/miscellaneous): ");
		double fathersEntertainment = scanner.nextDouble();

		System.out.println("Enter father's vehicle gas bill per month: ");
		double fathersGasBill = scanner.nextDouble();

		System.out.println("Enter father's monthly TFSA contribution: ");
		double fathersTFSA = scanner.nextDouble();





		System.out.println("Enter mother's age: ");
		int mothersAge = scanner.nextInt();

		System.out.println("Enter mother's gender (M/F/X): ");
		String mothersGender = scanner.next();

		System.out.println("Enter mother's yearly salary: ");
		double mothersSalary = scanner.nextDouble();

		System.out.println("Enter mother's monthly bills (groceries, electricity, water, cellphone): ");
		double mothersBills = scanner.nextDouble();

		System.out.println("Enter mother's entertainment costs (going out/miscellaneous): ");
		double mothersEntertainment = scanner.nextDouble();

		System.out.println("Enter mother's vehicle gas bill per month: ");
		double mothersGasBill = scanner.nextDouble();

		System.out.println("Enter mother's monthly TFSA contribution: ");
		double mothersTFSA = scanner.nextDouble();




		Dad dad = new Dad(fathersAge, fathersGender, fathersSalary, fathersBills, fathersEntertainment, fathersGasBill, fathersTFSA);
		Mom mom = new Mom(mothersAge, mothersGender, mothersSalary, mothersBills, mothersEntertainment, mothersGasBill, mothersTFSA);
		Yourself yourself = new Yourself(yourAge, yourGender, yourEntertainment, yourGasBill, yourTFSA, yourLoans);



		
		System.out.println("Your monthly household income, after all taxes and costs are subtracted and all investments added is: " 
		+ (dad.dadMonthlyIncome() + mom.momMonthlyIncome() + yourself.yourselfMonthlyIncome()));



	}
}