package com.test.mavenwebdrivergit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {

	public static WebDriver driver;
	
	@BeforeTest
	public void setup() {
		
		
		
		driver = new ChromeDriver();
		
	}
	
	@Test
	public void dologin() {
		
		driver.get("http://www.google.com");
		
		
	}
	
	
}
