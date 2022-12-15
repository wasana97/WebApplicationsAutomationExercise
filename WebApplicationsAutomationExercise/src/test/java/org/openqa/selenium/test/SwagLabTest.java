package org.openqa.selenium.test;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.maven.App;
import org.openqa.selenium.pages.SwagLabCartPage;
import org.openqa.selenium.pages.SwagLabCheckoutPage;
import org.openqa.selenium.pages.SwagLabHomePage;
import org.openqa.selenium.pages.SwagLabLoginPage;

public class SwagLabTest {
	String driverPath = "C:\\Users\\USER\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe";
	WebDriver driver;
	SwagLabLoginPage Login;
	SwagLabHomePage Home;
	SwagLabCartPage Cart;
	SwagLabCheckoutPage CheckOut;

	@Before
	public void setup() {

		System.setProperty("webdriver.chrome.driver", driverPath);

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");

	}

	@Test
	public void SwagLabTest_001() {

		Login = new SwagLabLoginPage(driver);
		Home = new SwagLabHomePage(driver);
		Cart = new SwagLabCartPage(driver);
		CheckOut = new SwagLabCheckoutPage(driver);
		
		Login.Login("performance_glitch_user", "secret_sauce");
		
		Home.CheckThePrice();
		Home.AddProductIntoTheCart();
		Home.ClickAddToCartBtn();
		
		Cart.VerifyItem();
		Cart.ClickCheckoutBtn();
		
		CheckOut.FillDetails("Wasana", "Geeganage", "12310");
		CheckOut.ClickonFinishBtn();

	}

	@After
	public void CloseBrowser() {
		driver.close();
	}
}
