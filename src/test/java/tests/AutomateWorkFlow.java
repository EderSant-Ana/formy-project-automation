package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.ConfirmationPage;
import pages.FormPage;

public class AutomateWorkFlow {

	private WebDriver driver;

	@Before
	public void setUp() throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws InterruptedException{
		driver.get("https://formy-project.herokuapp.com/form");
		driver.manage().window().maximize();

		FormPage formPage = new FormPage();
		formPage.submitForm(driver);
		
		ConfirmationPage confirmationPage = new ConfirmationPage();
		confirmationPage.waitForAlertBanner(driver);

		assertEquals("The form was successfully submitted!", confirmationPage.getAlertBannerText(driver));
	}
}
