package seleniumPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowserWithCustomisedMethod {

	static WebDriver driver;

	public static void launchBrowser() {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	public static void openApplicationUrl(String url) {
		driver.get(url);
	}

	public static void closeCurrentWindow() {
		driver.close();
	}

	public static void closeBrowser() {
		driver.quit();
	}

	public static String getPageTitle() {
		return driver.getTitle();
	}

	public static String getCurrentUrl() {
		return driver.getCurrentUrl();
	}

	public static String getPageSource() {
		return driver.getPageSource();
	}

	public static void navigationOperation() {
		driver.navigate().back();
	}

	public static void main(String[] args) {

		launchBrowser();
		// openApplicationUrl("https://www.amazon.com/");
		openApplicationUrl("https://www.flipkart.com/");
		String title = getPageTitle();
		System.out.println("Application Title = " + title);
		System.out.println("Current Url = " + getCurrentUrl());
		System.out.println("Page Source = " + getPageSource().substring(0, 10));
		navigationOperation();
		closeCurrentWindow();
		closeBrowser();

	}

}
