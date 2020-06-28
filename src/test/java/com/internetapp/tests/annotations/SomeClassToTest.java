package com.internetapp.tests.annotations;

public class SomeClassToTest {
	
	public int sumNumbers(int a, int b) {
		return a + b;
	}
	
	public String addStrings(String a, String b) {
		return a + " " + b;
	}
	
	public int[] getArray() {
		int[] arrayExample = {1, 2, 3};
		return arrayExample;
	}
	
	public int differenceOfTwoNumbers(int a, int b) {
		int result= a - b;
		return (result<0)?(result*-1):result;
	}
}