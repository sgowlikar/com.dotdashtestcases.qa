package com.dotdash.pages;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dotdashtestBase.TestBase;

public class deletetaskpage extends TestBase{

	@FindBy(name="todo[14]")
	WebElement tasktodeletebtn;
	
	@FindBy(xpath = "//input[@type='submit' and @value='Remove']")
	WebElement RemoveBtn;

	@FindBy(id="todos-content")
	WebElement Attendwedding;
	
	public deletetaskpage(){
		PageFactory.initElements(driver, this);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",tasktodeletebtn );
		
		JavascriptExecutor js2 = (JavascriptExecutor)driver;
		js2.executeScript("arguments[0].click();",RemoveBtn );
	}
	
	public boolean validateattendeventsisDisplayed(){
		return Attendwedding .isDisplayed();
	}


	
	
}
	










	
	
	
	
	
	
	
	
	
	
	
	

