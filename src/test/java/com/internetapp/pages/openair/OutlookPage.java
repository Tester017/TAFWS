package com.internetapp.pages.openair;

import static com.maveric.core.utils.reporter.Report.log;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.maveric.core.config.ConfigProperties;
import com.maveric.core.driver.Driver;
import com.maveric.core.testng.SeleniumBase;

public class OutlookPage extends SeleniumBase{
	
    private final By btn_login = By.xpath("//input[@type='submit']");
    private final By txt_username = By.name("loginfmt");
    private final By txt_password = By.name("passwd");
    
    WebDriverWait wait;
    WebDriver driver;
    
    public OutlookPage() {
        driver = Driver.getWebDriver();
        wait = new WebDriverWait(driver, ConfigProperties.WAIT_TIMEOUT.getInt());
    }
    
    public OutlookPage navigate(String url) {
        driver.navigate().to(url);
        logScreenshot("login");
        log("sample log");

        return this;

    }
    
    public OutlookPage enterUserName(String userName) {
    	clearAndType(driver.findElement(txt_username),userName,txt_username);
		return this;
    }
    

	public OutlookPage enterPassword(String password) throws InterruptedException {
		Thread.sleep(15000);
    	clearAndType(driver.findElement(txt_password),password,txt_password);
		return this;
    }
    
    public OutlookPage clickSubmit() {
    	click(driver.findElement(btn_login));
		return this;
    }


}
