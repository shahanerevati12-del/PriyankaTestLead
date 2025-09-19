package com.skillio;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.skillio.base.Keyword;

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
