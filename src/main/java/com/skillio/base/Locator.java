package com.skillio.base;

public interface Locator {
	
	//String searchproduct="//input[@placeholder=\"Search for products, brands and more\"]";
	 String  closeButton="//span[@class=\"sc-koXPp bDtzaf\"]";
	 String fromButton="//span[text()='From']";
      String fromSearchbutton="//input[@type=\"text\"]";
      String ProductCityAppered="ul#autoSuggest-list";
      String FromSearchbuttonClick=  "div.kGtxGm>div>ul#autoSuggest-list>li:nth-child(1)";                         //"ul#autoSuggest-list>li:nth-child(1)";
    // String ToButton=  "div.OmQvV>div>span";                      //"//span[text()='To']";     
     
    String ToSearchButton= "div.fbAAhv>input";
   String ToSearchButtonClick="ul#autoSuggest-list>li:nth-child(1)";
	
	String ClickOnDepatureButton="//span[text()='Departure']";
	//"div[class=\"gr_fswFld active\"]>span";
	String CurrentMonthYear="//div[@class=\"DayPicker-Caption\"]/div";
	//div[class="DayPicker-Caption"] div
	String NextMonth="//span[@aria-label=\"Next Month\"]";
	//span[aria-label="Next Month"]
	String PopUpWindow="div.sc-jlwm9r-6 ";
	String PopupClose="//p[@class=\"sc-jlwm9r-1 ewETUe\"]";
	String CurrentDate="//p[@class=\"fsw__date\"]";
	String  TravellerAndClassButton="//span[text()='Travellers & Class']";
	String ChildOption="//p[text()='Children']/following-sibling::div /child::span[2]";
	String ChildIncreament="//p[text()='Children']/following-sibling::div/child::span[3]";
	String ChildDecreament="//p[text()='Children']/following-sibling::div/child::span[3]";
	String EconomyButton="li[class=\"sc-12foipm-46 jva-DHv\"]";
	String DoneButton="a[class=\"sc-12foipm-64 jkgFUQ\"]";
	String SeniorButton="div>input#SC+label[class=\"sc-12foipm-88 kSreEi\"]>div:nth-child(1)";
	String StudentButton="div>input#ST+label[class=\"sc-12foipm-88 kSreEi\"]>div:nth-child(1)";
	String DoctorButton="div>input#D+label[class=\"sc-12foipm-88 kSreEi\"]>div:nth-child(1)";
	String ArmForce="div>input#AF+label[class=\"sc-12foipm-88 kSreEi\"]>div:nth-child(1)";
	
	
	
	
	}
