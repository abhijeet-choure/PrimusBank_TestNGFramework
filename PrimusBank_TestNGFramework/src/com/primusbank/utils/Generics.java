package com.primusbank.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.primusbank.constants.PrimusBankConstants;

public class Generics extends PrimusBankConstants 
{
	
	
	public static void selectItem(String locator,String item)
	{
		WebElement listelement;
		listelement=driver.findElement(By.xpath(locator));
		Select list=new Select(listelement);
		list.selectByVisibleText(item);		
	}
	
	
}
