package com.nathan;

public class Mom extends Person
{

	public double momPreSalary;
	public double momPostSalary;
	public double rsp;
	public double billsToPay;
	public double entertainment;
	public double monthlySalary;
	public double gas;
	public double monthlyTotal;



	public Mom(int age, String gender, double salary, double monthlyBills, double entertainmentCost, double monthlyGas, double tfsaAmount)
	{

		super(age, gender);
		momPreSalary = salary;
		billsToPay = monthlyBills;
		entertainment = entertainmentCost;
		tfsa = tfsaAmount;
		gas = monthlyGas;


	}

	public int getAge()
	{
		return super.getAge();
	}

	public String getGender()
	{
		return super.getGender();

	}

	public double getSalary()
	{
		return momPreSalary;
	}

	public double calculateRsp()
	{
		rsp = momPostSalary * 1.18;
		return rsp;
	}

	public double afterTaxSalary()
	{
		if (momPreSalary <= 47630)
		{
			momPostSalary = momPreSalary * 0.85;
			return momPostSalary;
		}
		else if (momPreSalary >= 47631 && momPreSalary <= 95259)
		{
			momPostSalary = (47631 * 0.85) + ((momPreSalary - 47631) * 0.795);
			return momPostSalary;
		}
		else if (momPreSalary >= 95260 && momPreSalary <= 147667)
		{
			momPostSalary = (47631 * 0.85) + (47629 * 0.795) + (momPreSalary - 95160) * 0.74;
			return momPostSalary;
		}

		else 
		{
			momPostSalary = (47631 * 0.85) + (47629 * 0.795) + (momPreSalary - 100000) * 0.67;
			return momPostSalary;
		}
	}


	public double calculateMonthlySalary()
	{
		monthlySalary = momPostSalary / 12;
		return monthlySalary;
	}



	public double calculateMonthlyBills()
	{
		monthlyTotal = billsToPay + entertainment;
		return monthlyTotal;
	}

	public double momMonthlyIncome()
	{
		double monthlyIncome = calculateMonthlySalary() - calculateRsp() - gas - calculateMonthlyBills() + calculateTfsa();
		return monthlyIncome;
	}

}





























