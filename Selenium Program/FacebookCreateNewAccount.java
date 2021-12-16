package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookCreateNewAccount {

	static WebDriver driver;

	public static void launchBrowser() {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	public static void manageOperation() {
		driver.manage().window().maximize();
	}

	public static void openFacebookApplication(String url) {
		driver.get(url);
	}

	public static void HandleWebElement() {

		driver.findElement(By.cssSelector("a[class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();

		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Akash");
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Hande");
		driver.findElement(By.cssSelector("input[name='reg_email__']")).sendKeys("akashhadne100@gmail.com");
		driver.findElement(By.cssSelector("input[name='reg_passwd__']")).sendKeys("Hande@123");
		driver.findElement(By.cssSelector("select[id='day']")).sendKeys("1");
		driver.findElement(By.cssSelector("select[id='month']")).sendKeys("March");
		driver.findElement(By.cssSelector("select[id='year']")).sendKeys("1997");
		driver.findElement(By.cssSelector("input[value='2']")).click();
		driver.findElement(By.cssSelector("button[name='websubmit']")).click();

	}

	public static void main(String[] args) {

		launchBrowser();
		manageOperation();
		openFacebookApplication("https://www.facebook.com/");
		HandleWebElement();
	}

}
