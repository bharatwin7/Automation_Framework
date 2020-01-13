package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPOM {
	private WebDriver driver; 
	
	public LoginPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(xpath="//a[contains(text(), ' Log In / Register')]")
	private WebElement loginLink;
	
	@FindBy(id="user_login")
	private WebElement userName; 
	
	@FindBy(id="user_pass")
	private WebElement password;
	
	@FindBy(name = "login")
	private WebElement loginBtn; 
	
	public void sendUserName(String userName) throws InterruptedException {
		this.loginLink.click();
	//	WebDriverWait wait = new WebDriverWait(this.driver,30);
	//	wait.until(ExpectedConditions.visibilityOfElementLocated((By) this.userName));
		Thread.sleep(5000);
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	public void clickLoginBtn() {
		
			this.loginBtn.click(); 
	}
	
	public void verifyPageTitle()
	{
		String pageTitle = this.driver.getTitle();
		if(pageTitle.contains("Dashboard"))
			System.out.println("Dashboard page loaded");
	}
}
