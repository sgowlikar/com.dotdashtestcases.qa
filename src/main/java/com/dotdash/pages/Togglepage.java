package com.dotdash.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dotdashtestBase.TestBase;




public class Togglepage extends TestBase {

	
	@FindBy(name="allbox")
	WebElement Togglebtn;
	
	
	public Togglepage(){
		PageFactory.initElements(driver, this);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", Togglebtn);
	}
	
	public boolean validateTogglebtnisSelected(){
		return Togglebtn.isSelected();
	}

	
	
}
	
	

