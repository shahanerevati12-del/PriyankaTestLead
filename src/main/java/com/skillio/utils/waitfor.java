package com.skillio.utils;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.skillio.base.Keyword;

public class waitfor {
	static WebDriverWait wait;
	
	static{
		wait=new WebDriverWait(Keyword.driver, Duration.ofSeconds(60));
		wait.pollingEvery(Duration.ofMillis(500));
		wait.ignoring(NoSuchElementException.class);
		wait.withMessage("Script time out");
		
	}
	public static void presenceOfElement(By element) {
		wait.until(ExpectedConditions.presenceOfElementLocated(element));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public static void elementtoClick(By element) {
		//.until(ExpectedConditions.presenceOfElementLocated(element));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	public static void visibilityOfelement(By element) {
		//.until(ExpectedConditions.presenceOfElementLocated(element));
		wait.until(ExpectedConditions.visibilityOfElementLocated(element));
	}

}
