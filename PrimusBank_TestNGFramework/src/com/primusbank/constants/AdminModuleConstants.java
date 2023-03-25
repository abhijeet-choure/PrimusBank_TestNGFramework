package com.primusbank.constants;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.primusbank.library.AdminHomePage;
import com.primusbank.library.PrimusBankHomePage;

public class AdminModuleConstants extends PrimusBankConstants 
{
	
	@BeforeTest
	public void adminLogin()
	{
		PrimusBankHomePage phome=new PrimusBankHomePage();
		phome.adminLogin("Admin", "Admin");
	}
	
	@AfterTest
	public void adminLogout()
	{
		AdminHomePage ahome=new AdminHomePage();
		ahome.adminLogout();
	}
	
}
