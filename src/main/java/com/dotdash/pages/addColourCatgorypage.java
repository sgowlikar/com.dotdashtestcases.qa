package com.dotdash.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.dotdashtestBase.TestBase;

public class addColourCatgorypage extends TestBase{

	@FindBy(name="categorydata")
	WebElement categoryname;
	
	@FindBy(xpath = "//input[@type='submit' and @value='Add category']")
	WebElement AddcategoryBtn;

	
	public addColourCatgorypage(){
		PageFactory.initElements(driver, this);
	}
	
	public boolean validateColourcategoryadded(){
		return categoryname.isDisplayed();
	}
	
	public void addcategory(String Hospital , String colour){
		categoryname.sendKeys(Hospital);
		Select list1= new Select(driver.findElement(By.name("colour")));
		list1.selectByVisibleText(colour);
		
		    	JavascriptExecutor js = (JavascriptExecutor)driver;
		    	js.executeScript("arguments[0].click();",AddcategoryBtn );
		    	
		    
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
}
