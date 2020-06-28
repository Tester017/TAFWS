package com.daniel.workspace;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.internetapp.tests.annotations.SomeClassToTest;

public class DifferenceOfTwoNumbers extends Annotations{
	
		
	@Test(dataProvider="calcDifferenceInputs",groups = {"Arithmetic", "Difference"})
	public void testMethod1(int a,int b, int c) {
		SomeClassToTest difference = new SomeClassToTest();
		int result = difference.differenceOfTwoNumbers(a, b);
		System.out.println("Running Test -> testMethod1 : " + "the difference of "+a+" and "+b+" is - " + result);
		Assert.assertEquals(result, c);

	}

}
