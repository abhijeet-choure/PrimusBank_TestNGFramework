package com.primusbank.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.primusbank.constants.AdminModuleConstants;
import com.primusbank.library.AdminHomePage;
import com.primusbank.library.Branch;

public class NewBranchCreationTest extends AdminModuleConstants
{
	@Test
	public void createBranchTest()
	{
		AdminHomePage ahome=new AdminHomePage();
		ahome.gotoBranchesPage();
		boolean res;
		Branch br=new Branch();
		br.branchname="TestBranch12345";
		br.add1="SomeAdd1";
		br.zipcode="12345";
		br.country="INDIA";
		br.state="Andhra Pradesh";
		br.city="Hyderabad";
		res=br.createBranch(br.branchname, br.add1, br.zipcode, br.country, br.state, br.city);
		Assert.assertTrue(res);
	}
	
	
}
