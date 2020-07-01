package com.internetapp.tests;

import org.testng.annotations.Test;

import com.internetapp.pages.openair.OutlookPage;
import com.maveric.core.testng.Annotations;

public class LoginOpenAir extends Annotations{
	
	@Test
	public void moveToOpenAir() throws InterruptedException {
		
//		startApp("https://outlook.office365.com/mail/");
		new OutlookPage()
		.navigate("https://outlook.office365.com/mail/")
		.enterUserName("danielf@maveric-systems.com")
		.clickSubmit()
		.enterPassword("Mavjul@123")
		.clickSubmit();
	}

}
