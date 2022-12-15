package org.openqa.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SwagLabCheckoutPage {

	WebDriver driver;

	By Firstname = By.xpath("//input[@name=\"firstName\"]");
	By Lastname = By.xpath("//input[@name=\"lastName\"]");
	By PostalCode = By.xpath("//input[@name=\"postalCode\"]");
	By ContinueBtn = By.xpath("//input[@name=\"continue\"]");
	By FinishBtn = By.xpath("//button[@name=\"finish\"]");

	public SwagLabCheckoutPage(WebDriver driver) {

		this.driver = driver;

	}

	// Provide a random firstname, lastname and a zip code
	public void FillDetails(String StrFirstName, String StrLastName, String StrPostalCode) {
		driver.findElement(Firstname).sendKeys(StrFirstName);
		driver.findElement(Lastname).sendKeys(StrLastName);
		driver.findElement(PostalCode).sendKeys(StrPostalCode);
		driver.findElement(ContinueBtn).click();

	}

	public void ClickonFinishBtn() {
		driver.findElement(FinishBtn).click();

	}

}
