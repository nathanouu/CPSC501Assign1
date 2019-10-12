package com.nathan;

public class Dad extends Person
{

	public double dadPreSalary;
	public double dadPostSalary;
	public double rsp;
	public double billsToPay;
	public double entertainment;
	public double monthlySalary;
	public double gas;
	public double monthlyTotal;



	public Dad(int age, String gender, double salary, double monthlyBills, double entertainmentCost, double monthlyGas, double tfsaAmount)
	{

		super(age, gender);
		dadPreSalary = salary;
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
		return dadPreSalary;
	}

	public double calculateRsp()
	{
		rsp = dadPostSalary * 1.18;
		return rsp;
	}

	public double afterTaxSalary()
	{
		if (dadPreSalary <= 47630)
		{
			dadPostSalary = dadPreSalary * 0.85;
			return dadPostSalary;
		}
		else if (dadPreSalary >= 47631 && dadPreSalary <= 95259)
		{
			dadPostSalary = (47631 * 0.85) + ((dadPreSalary - 47631) * 0.795);
			return dadPostSalary;
		}
		else if (dadPreSalary >= 95260 && dadPreSalary <= 147667)
		{
			dadPostSalary = (47631 * 0.85) + (47629 * 0.795) + (dadPreSalary - 95160) * 0.74;
			return dadPostSalary;
		}

		else 
		{
			dadPostSalary = (47631 * 0.85) + (47629 * 0.795) + (dadPreSalary - 100000) * 0.67;
			return dadPostSalary;
		}
	}


	public double calculateMonthlySalary()
	{
		monthlySalary = dadPostSalary / 12;
		return monthlySalary;
	}

	public double calculateMonthlyBills()
	{
		monthlyTotal = billsToPay + entertainment;
		return monthlyTotal;
	}

	public double dadMonthlyIncome()
	{
		double monthlyIncome = calculateMonthlySalary() - calculateRsp() - gas - calculateMonthlyBills() + calculateTfsa();
		return monthlyIncome;
	}

}





























