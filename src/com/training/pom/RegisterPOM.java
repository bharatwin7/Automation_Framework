package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPOM {
	private WebDriver driver;
	public RegisterPOM(WebDriver driver)
	{
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(), ' Log In / Register')]")
	private WebElement loginLink;
	
	//@FindBy(xpath = "//a[contains(text(),'Register')]")
	@FindBy(linkText ="Register")
	private WebElement registerTab;
	
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(id="first-name")
    private WebElement firstName;
	
	@FindBy(id="last-name")
	private WebElement lastName;
	
	public void clickRegister() throws InterruptedException
	{
		loginLink.click();
		Thread.sleep(3000);
	//	WebDriverWait wait = new WebDriverWait(this.driver,30);
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Register')]")));
		registerTab.click();
		Thread.sleep(3000);
		
	}
	
	public void sendEmail(String email)
	{
		
		this.email.clear();
		this.email.sendKeys(email);
	}
	
	public void sendFirstName(String Fname)
	{
		this.firstName.clear();
		this.firstName.sendKeys(Fname);
	}
	
	public void sendLastName(String Lname)
	{
		this.lastName.clear();
		this.lastName.sendKeys(Lname);
	    this.lastName.submit();
	}
}
