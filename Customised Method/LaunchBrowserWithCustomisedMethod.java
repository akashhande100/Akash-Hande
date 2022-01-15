package seleniumPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowserWithCustomisedMethod {

	static WebDriver driver;

	public static void launchBrowser() {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	public static void manageOperation() {
		driver.manage().window().maximize();
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

	public static void clickButton(WebElement ele) {
		ele.click();
	}

	public static void clearText(WebElement ele) {
		ele.clear();
	}

	public static void sendKeys(WebElement ele, String value) {
		ele.sendKeys(value);
	}

	public static void getText(WebElement ele, String value) {
		ele.getText();
	}

	public static String getAttribute(WebElement ele, String value) {
		return ele.getAttribute(value);
	}

	public static String getCssValue(WebElement ele, String value) {
		return ele.getCssValue(value);
	}

	public static String getTagName(WebElement ele, String value) {
		return ele.getTagName();
	}

	public static void main(String[] args) {

		launchBrowser();
		manageOperation();
		openApplicationUrl("https://www.flipkart.com/");
		String title = getPageTitle();
		System.out.println("Application Title = " + title);
		System.out.println("Current Url = " + getCurrentUrl());
		System.out.println("Page Source = " + getPageSource().substring(0, 10));
		navigationOperation();
	//	closeCurrentWindow();
	//	closeBrowser();

		String a = getAttribute(driver.findElement(By.cssSelector("input[name='q']")),"placeholder");
		System.out.println("Actual Placeholder : "+ a);
	
	}

}
