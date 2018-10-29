package com.dotdash.pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.dotdashtestBase.TestBase;

public class createNewTask extends TestBase{
	@FindBy(name="data")
	WebElement task;

	

	@FindBy(xpath = "//input[@type='submit' and @value='Add']")
	WebElement AddBtn;

	public createNewTask() {
		PageFactory.initElements(driver, this);
	}
	

	public void createNewtask(String taskname, String category ) {
		
		task.sendKeys(taskname);
		
		
		
		Select list1= new Select(driver.findElement(By.name("category")));
		list1.selectByVisibleText(category);
		
		AddBtn.click();
	
	}

















}
