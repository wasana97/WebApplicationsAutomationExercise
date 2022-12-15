package org.openqa.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SwagLabLoginPage {
	WebDriver driver;

	By Username = By.xpath("//input[@placeholder='Username']");
	By Password = By.xpath("//input[@placeholder='Password']");
	By LoginButton = By.xpath("//input[@type=\"submit\"]");

	public SwagLabLoginPage(WebDriver driver) {

		this.driver = driver;

	}

	// Log in to the web application
	public void Login(String StrUserName, String strPassword) {
		// Type username
		driver.findElement(Username).sendKeys(StrUserName);
		// Type Password
		driver.findElement(Password).sendKeys(strPassword);
		// Click on the Login button
		driver.findElement(LoginButton).click();
	}

}
