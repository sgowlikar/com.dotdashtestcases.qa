package com.dotdashtestscripts;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.dotdash.pages.addColourCatgorypage;
import com.dotdashtestBase.TestBase;
public class addColourCatgorypagetest extends TestBase{

	addColourCatgorypage AddColourCatgorypage;
	
	

	public addColourCatgorypagetest (){
		super();
	}
	
	
	@BeforeMethod
	public void setUp(){
		initialization();
		AddColourCatgorypage = new addColourCatgorypage();	
	}
	
	@Test
	public void addcolourcattestTest(){
		boolean flag = AddColourCatgorypage.validateColourcategoryadded();
		Assert.assertTrue(flag);
		System.out.println("New Colour Category is created");
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
	
	
	
}
