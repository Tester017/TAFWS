package com.daniel.workspace;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.internetapp.tests.annotations.SomeClassToTest;

public class Addition extends Annotations{
	
	
	
	@Test(dataProvider="calcAdditionInputs",groups = {"Arithmetic", "Addition"})
	public void testMethod1(int a,int b,int c) {
		SomeClassToTest sum = new SomeClassToTest();
		int result = sum.sumNumbers(a, b);
		System.out.println("Running Test -> testMethod1 : " + "the sum of "+a+" and "+b+" is - " + result);
		Assert.assertEquals(result, c);
		System.out.println("Thread 1");

	}

}
