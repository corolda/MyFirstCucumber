package com.demoaut.newtours.StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.demoaut.newtours.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;


public class GoogleSearchStepDefinitions {
	WebDriver driver;
	@Given("precondiciones")
	public void precondiciones() {	
		System.setProperty("webdriver.gecko.driver", "C://Selenium/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
	    
	}

	@When("hago")
	public void hago() {
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.name("userName")).sendKeys("sophos");
		driver.findElement(By.name("password")).sendKeys("sophos");
		driver.findElement(By.name("login")).submit();

		
	}

	@Then("valido")
	public void valido() {
		Assert.assertTrue(driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/p[1]/img")).isDisplayed());
	   
	}
}
