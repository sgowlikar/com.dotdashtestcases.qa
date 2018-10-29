package com.dotdashtestscripts;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.dotdash.pages.Togglepage;
import com.dotdashtestBase.TestBase;

public class Togglepagetest extends TestBase{

	Togglepage togglepage;
	
	
	public Togglepagetest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		togglepage = new Togglepage();	
	}
	

@Test
public void Togglebtntest(){
	boolean flag = togglepage.validateTogglebtnisSelected();
	Assert.assertTrue(flag);
	System.out.println("Toggle button is working");
}
@AfterMethod
public void tearDown(){
	driver.quit();
}

	
}
	