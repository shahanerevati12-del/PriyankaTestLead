package com.skillio;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.skillio.base.Keyword;
import com.skillio.base.Locator;
import com.skillio.utils.waitfor;

public class Mytestcases extends SetUp {

	@Test(description = "tc001-verified jeans filter")
	public void verifiyJeansfilter() throws InterruptedException {
		/*
		 * driver.findElement(By.
		 * xpath("//input[@placeholder=\"Search for products, brands and more\"]")).
		 * sendKeys("Levis",Keys.ENTER); Thread.sleep(5000);
		 * driver.findElement(By.xpath("//ul[@class=\"categories-list\"]/li[1]")).click(
		 * ); Thread.sleep(3000); List<WebElement>prodctTitles=
		 * driver.findElements(By.xpath("//h4[@class=\"product-product\"]"));
		 * 
		 * 
		 * for (WebElement producttitle : prodctTitles) {
		 * 
		 * String producttitleText=producttitle.getText();
		 * assertTrue(producttitle.getText().contains("Jeans")
		 * ,"product other than jeans"+producttitleText); }
		 */

	}

	/*
	 * @Test public static void verifyJeansFilteronSrpUsingKeyword() {
	 * Keyword.enterText("xpath",Locator.searchproduct, "Levis"); }
	 */
	@Test
	public static void clickOnToButton() throws InterruptedException {
		Keyword.clickElement("xpath", Locator.closeButton);
		// select From Button
		Keyword.clickElement("xpath", Locator.fromButton);
		Keyword.enterText("Xpath", Locator.fromSearchbutton, "Pune");
		waitfor.presenceOfElement(By.cssSelector(Locator.FromSearchbuttonClick));
		Keyword.clickElement("css", Locator.FromSearchbuttonClick);
		// select To Button
		Keyword.enterText("css", Locator.ToSearchButton, "Mumbai");
		waitfor.presenceOfElement(By.cssSelector(Locator.ToSearchButtonClick));
		Keyword.clickElement("css", Locator.ToSearchButtonClick);
		// select Date
		Keyword.clickElement("Xpath", Locator.ClickOnDepatureButton);
		//Close PopUp
		waitfor.presenceOfElement(By.cssSelector(Locator.PopUpWindow));
		Keyword.clickElement("Xpath", Locator.PopupClose);
		Keyword.selectMonthYear("December 2025", "28");
		//waitfor.elementtoClick(By.xpath(Locator.CurrentDate));
		//Select Traveller& Class
		waitfor.presenceOfElement(By.xpath(Locator.TravellerAndClassButton));
		Keyword.clickElement("Xpath",Locator.TravellerAndClassButton);
		Keyword.travellerClass(4);
		Keyword.clickElement("css",Locator.EconomyButton);
		//waitfor.presenceOfElement(By.xpath(Locator.DoneButton));
		//Keyword.browserNotificationHandle("chrome","allow");
		Keyword.clickElement("css", Locator.DoneButton);
		

	}

}
