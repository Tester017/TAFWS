package com.daniel.workspace;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.internetapp.tests.Calculator;

public class Multiplication extends Annotations{
	
	@Test(groups = {"Arithmetic", "Multiplication"})
	@Parameters({"value1", "value2","result"})
	public void testMethod1(int a,int b,int c) {
		int result = Calculator.mul(a, b);
		System.out.println("Running Test -> testMethod1 : " + "the product of "+a+" and "+b+" is - " + result);
		Assert.assertEquals(result, c);
		System.out.println("Thread 3");

	}

}
