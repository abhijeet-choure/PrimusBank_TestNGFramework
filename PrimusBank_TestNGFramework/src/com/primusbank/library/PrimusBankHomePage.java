package com.primusbank.library;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.primusbank.constants.PrimusBankConstants;

public class PrimusBankHomePage extends PrimusBankConstants
{
	public  String adminuid;
	public  String adminpwd;
	public  String brname;
	public  String bankeruid;
	public  String bankerpwd;
	public  String customeruid;
	public  String customerpwd;
	
	public boolean adminLogin(String uname,String pword)
	{
		String expurl,acturl;
		expurl="adminflow";
		login(uname,pword);
		acturl=driver.getCurrentUrl();
		if (acturl.toLowerCase().contains(expurl.toLowerCase())) 
		{
			return true;
		} else 
		{
			return false;
		}
	}
	
	public boolean bankerLogin(String branchname,String uname,String pword)
	{
		String expurl,acturl;
		expurl="Bankers_flow";		
		Select brlist=new Select(driver.findElement(By.id("drlist")));
		brlist.selectByVisibleText(branchname);
		login(uname,pword);
		acturl=driver.getCurrentUrl();
		if (acturl.toLowerCase().contains(expurl.toLowerCase())) 
		{
			return true;
		} else 
		{
			return false;
		}
		
	}
	
	public boolean customerLogin(String uid,String pwd)
	{
	 driver.findElement(By.id("personal")).click();
	 driver.findElement(By.id("idtxt")).sendKeys(uid);
	 driver.findElement(By.id("pswdtxt")).sendKeys(pwd);
	 driver.findElement(By.id("btnGO")).click();
	 if(driver.findElement(By.xpath("//table/tbody/tr[2]/td/a/img")).isDisplayed())
	 {
		 return true;
	 }
	 else
	 {
		 return false;
	 }
	}
	
	public void navigateToPersonalBankingPage()
	{
		
	}
	
	public void navigateToCorporateBankingPage()
	{
		
	}
	
	public void navigateToInternationalBankingPage()
	{
		
	}
	
	public void navigateToAboutUsPage()
	{
		
	}
	
	public void navigateToSitemapPage()
	{
		
	}
	
	public void login(String uname,String pword)
	{
		driver.findElement(By.id("txtuId")).sendKeys(uname);
		driver.findElement(By.id("txtPword")).sendKeys(pword);
		driver.findElement(By.id("login")).click();
	}
}
