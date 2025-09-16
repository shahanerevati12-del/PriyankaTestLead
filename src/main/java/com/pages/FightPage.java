package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.skillio.base.Keyword;

public class FightPage {
	public FightPage() {
		PageFactory.initElements(Keyword.driver,this);
	}
	@FindBy(xpath="//span[@class=\"sc-koXPp bDtzaf\"]")
			private WebElement CloseButton;
	
	
	
	
	public void clickOnCloseButton() {
		CloseButton.click();
	}

}
