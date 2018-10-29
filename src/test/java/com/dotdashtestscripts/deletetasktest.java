package com.dotdashtestscripts;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.dotdash.pages.deletetaskpage;
import com.dotdashtestBase.TestBase;

public class deletetasktest extends TestBase {

	
	deletetaskpage Deletetaskpage;
	 public deletetasktest() {
		 super();
	 }
	@BeforeMethod
	public void setUp(){
		initialization();
	Deletetaskpage = new deletetaskpage();
	
	}
	
	
	
	@Test
	public void Readingbooksisdisplayed(){
		boolean flag = Deletetaskpage.validateattendeventsisDisplayed();
		Assert.assertTrue(flag);
		System.out.println("Category is removed");

	}


	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
	
	
}

