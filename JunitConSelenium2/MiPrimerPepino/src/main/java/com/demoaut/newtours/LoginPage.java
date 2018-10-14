package com.demoaut.newtours;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	By txtUserName = By.id("user_login");  
	By txtPassword = By.xpath("//*[@id=\"user_pass\"]");  
	By btnLogin = By.name("wp-submit");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void loginToWordpress(String userid, String pass) {
		typeUserName(userid);
		typePassword(pass);
		clickOnLoginButton();
	}
	
	public void typeUserName(String uid) {
		driver.findElement(txtUserName).sendKeys(uid);
	}
	
	public void typePassword(String pass) {
		driver.findElement(txtPassword).sendKeys(pass);
	}
	
	public void clickOnLoginButton() {
		driver.findElement(btnLogin).click();
	}

}
