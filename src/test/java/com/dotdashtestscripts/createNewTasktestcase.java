package com.dotdashtestscripts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dotdash.pages.createNewTask;
import com.dotdashtestBase.TestBase;
import com.dotdashutil.TestUtil;







public class createNewTasktestcase extends TestBase{

	
	createNewTask  CreateNewTask;
	TestUtil testUtil;
	
	String sheetName = "CreateNewTask";
	
	public createNewTasktestcase(){
		super();
		
}
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		
		initialization();
		testUtil = new TestUtil();
	
		CreateNewTask= new createNewTask();
	
	}
		@DataProvider
		public Object[][] getTestData(){
			Object data[][] = TestUtil.getTestData(sheetName);
			return data;
		}
	
		@Test(dataProvider="getTestData")
		public void validatecreateNewtask(String taskname,  String category) {
			
			CreateNewTask.createNewtask(taskname,category);
			
			
			
			
		}

		@AfterMethod
		public void tearDown(){
			driver.quit();
		}
		
		
	
}
	
	
	
	

