package com.dotdashtestscripts;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.dotdash.pages.checkCorrectURLLaunchedpage;
import com.dotdashtestBase.TestBase;

public class checkCorrectURLLaunched extends TestBase {
	
	checkCorrectURLLaunchedpage checkCorrectURLLaunchedPage;
	
	 public checkCorrectURLLaunched() {
		 super();
	 }
	
	
	
	
	@BeforeMethod
	public void setUp(){
		initialization();
		checkCorrectURLLaunchedPage = new checkCorrectURLLaunchedpage();
	}

@Test
public void checkCorrectURLLaunched(){
	String expectedurl = checkCorrectURLLaunchedpage.validatecheckCorrectURLLaunchedpageTitle();
	Assert.assertEquals(expectedurl, "http://localhost/dotdash-project/index.php");
	System.out.println("Correct URL is Launched");
}


@AfterMethod
public void tearDown(){
	driver.quit();
}
}
