package org.openqa.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SwagLabHomePage {
	WebDriver driver;
	By productWithPrice = By
			.xpath("//div[text()=\"Sauce Labs Fleece Jacket\"]/../../following-sibling::div/div[text()=\"49.99\"]");
	By product = By.xpath("(//button[text()=\"Add to cart\"])");

	By cart = By.xpath("//a[@class='shopping_cart_link']");

	public SwagLabHomePage(WebDriver driver) {

		this.driver = driver;

	}

	// Check the price of product
	public void CheckThePrice() {

		if (driver.findElement(productWithPrice) != null) {

			System.out.println("Sauce Labs Fleece Jacket is $49.99");

		} else {

			System.out.println("Sauce Labs Fleece Jacket is not $49.99");

		}
	}

	// Add two products into the cart
	public void AddProductIntoTheCart() {
		String Pro;
		for (int i = 1; i <= 2; i++) {
			Pro = product + "[" + i + "]";
			driver.findElement(product).click();

			System.out.println("Product added");

		}
	}

	// Click cart icon in the top
	public void ClickAddToCartBtn() {
		driver.findElement(cart).click();
	}
}
