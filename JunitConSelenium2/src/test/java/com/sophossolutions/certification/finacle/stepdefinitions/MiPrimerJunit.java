package com.sophossolutions.certification.finacle.stepdefinitions;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.*;

public class MiPrimerJunit {
	
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
	public void validarLoguinNewtours() {
		
		/*Paso 2- Abrir la página web*/
		driver.get("http://www.newtours.demoaut.com");
		
		assertTrue(driver.findElement(By.xpath("//img[@src='/images/nav/logo.gif']")).isDisplayed());
		
		/*Paso 3 - Rellenar User Name*/
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		
		/*Paso 4 - Rellenar el password*/
		driver.findElement(By.name("password")).sendKeys("tutorial");
		
		/*Paso 5 - Hacer Login*/
		driver.findElement(By.name("login")).submit();		
		System.out.println("Test Case Finalizado");

	}
	
	@Ignore
	public void validarLoguin2Newtours() {
		
		/*Paso 2- Abrir la página web*/
		driver.get("http://www.newtours.demoaut.com");
		
		/*Paso 3 - Rellenar User Name*/
		driver.findElement(By.name("userName")).sendKeys("maipalac");
		
		/*Paso 4 - Rellenar el password*/
		driver.findElement(By.name("password")).sendKeys("maipalac");
		
		/*Paso 5 - Hacer Login*/
		driver.findElement(By.name("login")).submit();		
		System.out.println("Test Case Finalizado");

	}

}
