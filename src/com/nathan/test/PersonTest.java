package com.nathan.test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.nathan.Dad;
import com.nathan.Mom;
import com.nathan.Person;
import com.nathan.Yourself;

public class PersonTest {

	public static Dad dad;
	public  static Mom mom;
	public  static Yourself yourself;


	@Test
	public void testCalculateMonthlyIncome() {
		dad = new Dad(45, "M", 50000, 5000, 5000, 3000, 8000);
		mom = new Mom(40, "F", 40000, 5000, 5000, 2000, 7000);
		yourself = new Yourself(20, "M", 50, 50, 500, 5000);
		Assert.assertNotNull(dad);
		Assert.assertNotNull(mom);
		Assert.assertNotNull(yourself);
		double monthlyIncome = dad.dadMonthlyIncome() + mom.momMonthlyIncome() + yourself.yourselfMonthlyIncome();
		Assert.assertNotEquals(0.00, monthlyIncome);
	}


	@Test
	public void testPerson() {
		Person person = new Person(21, "F");
		Assert.assertEquals("F", person.getGender());
	}

}
