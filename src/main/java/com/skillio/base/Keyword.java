package com.skillio.base;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.skillio.erros.Invalidbrowsererror;

public class Keyword {
	public static RemoteWebDriver driver;
	public static void openBrowser(String browserName) {
		FirefoxOptions option = new FirefoxOptions();
		option.addArguments("--incognito");
		option.addPreference("dom.webnotifications.enabled", false);
		
		if(browserName==null) {
			System.out.println("invalid Browser name: chrome");
			browserName="firefox";
		}
		if(browserName.equalsIgnoreCase("chrome")) {
			 driver=new ChromeDriver();
			
		}else if(browserName.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver(option);
		}else {
			throw new Invalidbrowsererror(browserName);
		}

	}
	
	public static void launchAppUrl(String url) {
		driver.get(url);

	}
	
	
	public static void enterText(String locatorType,String locator,CharSequence...text) {
		getWebElement(locatorType, locator).sendKeys(text);
	}

	public static void clickElement(String locatorType,String locator) {
		getWebElement(locatorType, locator)
		.click();
		}
	
	public static WebElement getWebElement(String locatorType,String locator) {
		WebElement element;
		if(locatorType.equalsIgnoreCase("xpath")) {
		  element=  driver.findElement(By.xpath(locator));
		     }else if(locatorType.equalsIgnoreCase("css")) {
		    element=	driver.findElement(By.cssSelector(locator));
		    	 
		     }else if(locatorType.equalsIgnoreCase("id")) {
		    element=	driver.findElement(By.id(locator));
		     }else {
		    	 throw new   com.skillio.exceptions.InvalidLocatorexception(locatorType);
		    	 
		     }
		return element;

	}
	
	public static void selectMonthYear(String monthYear,String Date) {
		
	//	String recentyearmonth = "December 2025";
	//	driver.findElement(By.xpath("//span[text()='Departure']")).click();

		while (true) {
			//String curentmonthyear = driver.findElement(By.xpath("//div[@class=\"DayPicker-Caption\"]/div")).getText();
			String curentmonthyear = driver.findElement(By.xpath(Locator.CurrentMonthYear)).getText();
			if (curentmonthyear.equals( monthYear)) {
				break;

			} else {
				driver.findElement(By.xpath(Locator.NextMonth)).click();
			}
		}
		List<WebElement> alldays = driver.findElements(By.xpath(Locator.CurrentDate));

		for (WebElement day : alldays) {
			if (day.getText().equals(Date)) {
				day.click();
				break;
			}

		}
	}
	
	public static void travellerClass(int requiredAge) throws InterruptedException {
		// to child option
				//int requirechild = 8;
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

				WebElement childclickelement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Locator.ChildOption)));
				int currentchilds = Integer.parseInt(childclickelement.getText());
				while (currentchilds < requiredAge) {
					WebElement addchild = driver.findElement(By.xpath(Locator.ChildIncreament));
					addchild.click();
					currentchilds++;
				}
				while (currentchilds > requiredAge) {
					WebElement addchild = driver.findElement(By.xpath(Locator.ChildDecreament));
					addchild.click();
					currentchilds--;

				}
				//click on economy button
				//driver.findElement(By.xpath("//li[text()='economy']")).click();
				
				
				
				//Thread.sleep(1000);
				//driver.findElement(By.xpath("//a[text()='Done']")).click();

	}
	
	public String getText(String locatorType,String locator) {
   return getWebElement(locatorType, locator).getText();
	}
	
	public static List<String> getTexts(String locatorType,String locator) {
		List<WebElement> elements =getWebElements(locatorType, locator);
		List<String> elementTexts=new ArrayList<String>();
		
		for (WebElement element : elements) {
			elementTexts.add(element.getText());
		}
		return elementTexts;
  
	}
	
	
	public static List<WebElement> getWebElements(String locatorType, String locator) {
		List<WebElement> elements;
		if(locatorType.equalsIgnoreCase("xpath")) {
		  elements=  driver.findElements(By.xpath(locator));
		     }else if(locatorType.equalsIgnoreCase("css")) {
		    elements=	driver.findElements(By.cssSelector(locator));
		    	 
		     }else if(locatorType.equalsIgnoreCase("id")) {
		    elements=	driver.findElements(By.id(locator));
		     }else {
		    	 throw new   com.skillio.exceptions.InvalidLocatorexception(locatorType);
		    	 
		     }
		return elements;
		
	}

	public static void selectDate() {
		String recday = "28";
		List<WebElement> alldays = driver.findElements(By.xpath("//p[@class=\"fsw__date\"]"));

		for (WebElement day : alldays) {
			if (day.getText().equals(recday)) {
				day.click();
				break;
			}

		}
	}
	
	private void selectFair(String Farename) {
		if(Farename.equalsIgnoreCase("Senior Citizen")) {
			driver.findElement(By.cssSelector("div>input#SC+label[class=\"sc-12foipm-88 kSreEi\"]>div:nth-child(1)")).click();
		}else if(Farename.equalsIgnoreCase("Student")) {
			driver.findElement(By.cssSelector("div>input#ST+label[class=\"sc-12foipm-88 kSreEi\"]>div:nth-child(1)")).click(); 
		}else if(Farename.equalsIgnoreCase("Armed Forces")) {
			driver.findElement(By.cssSelector("div>input#AF+label[class=\"sc-12foipm-88 kSreEi\"]>div:nth-child(1)")).click();
		}else if(Farename.equalsIgnoreCase("Doctors & Nurse")) {
			driver.findElement(By.cssSelector("div>input#D+label[class=\"sc-12foipm-88 kSreEi\"]>div:nth-child(1)")).click();
		}else {
			System.out.println("no fair name selected");
		}

	}
	
	public static void browserNotificationHandle(String BrowserName,String NotificationOption) {
		if(BrowserName.equalsIgnoreCase("chrome")) {
			ChromeOptions options=new ChromeOptions();
			Map<String,Object>prefs=new HashMap<String, Object>();
			if(NotificationOption.equalsIgnoreCase("block")) {
				prefs.put("profile.default notifications", 2);
			}else if(NotificationOption.equalsIgnoreCase("allow")) {
				prefs.put("profile.default notifications", 1);
			}
			options.setExperimentalOption("prefs", prefs);
		
			driver=new ChromeDriver(options);
		}else if(BrowserName.equalsIgnoreCase("firefox")) {
		FirefoxOptions options=new FirefoxOptions();
		  if(NotificationOption.equalsIgnoreCase("block")) {
			  options.addPreference("dom.webnotiication.enable",false);
			  options.addPreference("dom.push.enable",false);
		  }else if(NotificationOption.equalsIgnoreCase("allow")) {
			  options.addPreference("dom.webnotiication.enable",true);
			  options.addPreference("dom.push.enable",true);
		  }
		  driver=new FirefoxDriver(options);
		  }
		else {
			System.out.println("invalid browser name");
		}
		//return driver;

	}
	public static void quiteBrowser() {
		driver.quit();

	}

}
