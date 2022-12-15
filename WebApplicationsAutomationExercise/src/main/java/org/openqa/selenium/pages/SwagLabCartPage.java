package org.openqa.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SwagLabCartPage {
	WebDriver driver;

	By Item = By.xpath("(//div[@class=\"inventory_item_name\"])");
	By Item01 = By.xpath("(//div[@class=\"inventory_item_name\"])[1])");
	By Item02 = By.xpath("(//div[@class=\"inventory_item_name\"])[2])");
	By CheckoutBtn = By.xpath("//button[text()=\"Checkout\"]");

	public SwagLabCartPage(WebDriver driver) {

		this.driver = driver;

	}

	// Verify that selected items are in the cart
	public void VerifyItem() {
		String item;
		for (int i = 1; i <= 2; i++) {
			item = Item + "[" + i + "]";
			if (driver.findElement(Item) != null) {
				
				System.out.println("Item is Present");

			} else {

				System.out.println("Item is Absent");

			}
		}

	}

	// Click checkout button
	public void ClickCheckoutBtn() {
		driver.findElement(CheckoutBtn).click();
	}

}
