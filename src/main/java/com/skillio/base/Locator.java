package com.skillio.base;

public interface Locator {
	
	//String searchproduct="//input[@placeholder=\"Search for products, brands and more\"]";
	 String  closeButton="//span[@class=\"sc-koXPp bDtzaf\"]";
	 String fromButton="//span[text()='From']";
      String fromSearchbutton="//input[@type=\"text\"]";
      String ProductCityAppered="ul#autoSuggest-list";
      String FromSearchbuttonClick=  "div.kGtxGm>div>ul#autoSuggest-list>li:nth-child(1)";                         //"ul#autoSuggest-list>li:nth-child(1)";
    // String ToButton=  "div.OmQvV>div>span";                      //"//span[text()='To']";     
     
    String toSearchButton= "div.fbAAhv>input";
   String toSearchButtonClick="ul#autoSuggest-list>li:nth-child(1)";
	
	String clickOnDepatureButton="//span[text()='Departure']";
	//"div[class=\"gr_fswFld active\"]>span";
	String currentMonthYear="//div[@class=\"DayPicker-Caption\"]/div";
	//div[class="DayPicker-Caption"] div
	String nextMonth="//span[@aria-label=\"Next Month\"]";
	//span[aria-label="Next Month"]
	String popUpWindow="div.sc-jlwm9r-6 ";
	String popupClose="//p[@class=\"sc-jlwm9r-1 ewETUe\"]";
	String currentDate="//p[@class=\"fsw__date\"]";
	String travellerAndClassButton="//span[text()='Travellers & Class']";
	String childOption="//p[text()='Children']/following-sibling::div /child::span[2]";
	String childIncreament="//p[text()='Children']/following-sibling::div/child::span[3]";
	String childDecreament="//p[text()='Children']/following-sibling::div/child::span[3]";
	String EconomyButton="li[class=\"sc-12foipm-46 jva-DHv\"]";
	String DoneButton="a[class=\"sc-12foipm-64 jkgFUQ\"]";
	String SeniorButton="div>input#SC+label[class=\"sc-12foipm-88 kSreEi\"]>div:nth-child(1)";
	String StudentButton="div>input#ST+label[class=\"sc-12foipm-88 kSreEi\"]>div:nth-child(1)";
	String DoctorButton="div>input#D+label[class=\"sc-12foipm-88 kSreEi\"]>div:nth-child(1)";
	String ArmForce="div>input#AF+label[class=\"sc-12foipm-88 kSreEi\"]>div:nth-child(1)";
	
	
	
	
	}
