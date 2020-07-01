package com.daniel.workspace;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;

import com.maveric.core.testng.listeners.DriverListener;
import com.maveric.core.testng.listeners.ReportListener;
import com.maveric.core.testng.listeners.RestListener;
import com.maveric.core.testng.listeners.TestListener;

@Listeners({TestListener.class, ReportListener.class, DriverListener.class, RestListener.class})
public class Annotations {
	
	@DataProvider(name="calcDifferenceInputs")
	public Object[][] getData1() {
		return new Object[][] {
			{5,6,1},
			{2,1,1},
			{10,3,7}
		};
	}
	
	@DataProvider(name="calcAdditionInputs")
	public Object[][] getData2() {
		return new Object[][] {
			{5,6,11},
			{2,1,3},
			{10,3,13}
		};
	}
	
	

}
