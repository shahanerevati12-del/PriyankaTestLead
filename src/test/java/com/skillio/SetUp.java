package com.skillio;

import java.time.Duration;

//public class SetUp {

//package com.selenium.goibibo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.skillio.base.Keyword;
import com.skillio.base.Locator;
import com.skillio.erros.Invalidbrowsererror;

public class SetUp {
	
    @Parameters("browser-name")
	@BeforeMethod
	public void setUp(@Optional String browseName) throws InterruptedException
	{
        
		Keyword.openBrowser(browseName);
		Thread.sleep(1000);
		//WebDriverWait.wait=new WebDriverWait(keyword.driver,Duration.ofSeconds(60));
		Keyword.launchAppUrl("https://www.goibibo.com/flights/");
		
	
	}
	@AfterMethod
	public void tearDown() throws Exception {
		Keyword.quiteBrowser();
	}

}
