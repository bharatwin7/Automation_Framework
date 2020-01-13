package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ResetPasswordPOM {
	private WebDriver driver;
	public ResetPasswordPOM(WebDriver driver)
	{
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(), 'Log In / Register')]")
	private WebElement loginLink;
	
	@FindBy( partialLinkText ="Lost Your Password")
	private WebElement lostPasswordLink;
	
	@FindBy(id="user_login")
	private WebElement emailID;
		
	public void clickRegister() throws InterruptedException
	{
		loginLink.click();
		Thread.sleep(3000);
	//	WebDriverWait wait = new WebDriverWait(this.driver,30);
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Register')]")));
	
	}
	
	public void clickLostPasswordLink()
	{
		this.lostPasswordLink.click();
	}
	
	public void setEmail(String emailID)
	{
		this.emailID.clear();
		this.emailID.sendKeys(emailID);
		this.emailID.submit();
	}

}
