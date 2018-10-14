package com.sophossolutions.certification.finacle.stepdefinitions;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BuscarGoogle {

	WebDriver driver;

	@Before
	public void setUp() throws Exception {
		/*Paso 1 - Configurar el driver con GoogleChrome*/
		System.setProperty("webdriver.chrome.driver", "C://Selenium/Drivers/chromedriver.exe");
		driver = new ChromeDriver();	
	}

	@After
	public void tearDown() throws Exception {
		driver.close();
	}

	@Test
	public void buscarCucumber() {
		
		/*Paso 2- Abrir la página web*/
		driver.get("https://www.google.com.co/");
		
		assertTrue(driver.findElement(By.id("hplogo")).isDisplayed());
		
		/*Paso 3 - Rellenar User Name*/
		driver.findElement(By.id("lst-ib")).sendKeys("Cucumber");
		
		/*Paso 4 - Click en botón buscar*/
		driver.findElement(By.name("btnK")).submit();
		
		assertTrue(driver.findElement(By.xpath("//a[@href='https://cucumber.io/']//h3[@class='LC20lb'][contains(text(),'Cucumber')]")).isDisplayed());
				
		System.out.println("Test Case Finalizado");
	}

}
