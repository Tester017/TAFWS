package com.maveric.core.testng;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import com.maveric.core.testng.listeners.DriverListener;
import com.maveric.core.testng.listeners.ReportListener;
import com.maveric.core.testng.listeners.RestListener;
import com.maveric.core.testng.listeners.TestListener;

@Listeners({TestListener.class, ReportListener.class, DriverListener.class, RestListener.class})
public class Annotations extends SeleniumBase {
	
  
  @BeforeMethod
  public void beforeMethod() {
//	startApp("firefox", "http://leaftaps.com/opentaps");
	
  }

  @AfterMethod
  public void afterMethod() {
//	  close();
  }

}

