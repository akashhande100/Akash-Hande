package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DemoNopcommerce extends LaunchBrowserWithCustomisedMethod {

	public static void main(String[] args) {

		launchBrowser();
		manageOperation();
		openApplicationUrl("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		WebElement emailField = driver.findElement(By.xpath("//input[@class='email']"));
		clearText(emailField);
		emailField.sendKeys("admin@yourstore.com");

		String attributeValue = emailField.getAttribute("value");
		System.out.println("Actual email : " + attributeValue);

		WebElement passwordField = driver.findElement(By.xpath("//input[@class='password']"));
		clearText(passwordField);
		passwordField.sendKeys("admin");

		String attributeValue1 = passwordField.getAttribute("value");
		System.out.println("Actual password : " + attributeValue1);

		driver.findElement(By.xpath("//input[@type='checkbox']")).click();

		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
