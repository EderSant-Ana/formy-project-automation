package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class FormPage {
	
	public void submitForm(WebDriver driver) throws InterruptedException {
		driver.findElement(By.id("first-name")).sendKeys("John");
		Thread.sleep(1000);
		driver.findElement(By.id("last-name")).sendKeys("Doe");
		Thread.sleep(1000);
		driver.findElement(By.id("job-title")).sendKeys("QA Enginner");
		Thread.sleep(1000);
		driver.findElement(By.id("radio-button-2")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("checkbox-2")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("option[value='1'")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("datepicker")).sendKeys("05/28/2019");
		Thread.sleep(1000);
		driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();
	}

}
