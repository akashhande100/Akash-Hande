package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathExample {

	static WebDriver driver;

	public static void launchBrowser() {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	public static void manageOperation() {
		driver.manage().window().maximize();

	}

	public static void openApplication(String url) {
		driver.get(url);
	}

	public static void HandleWebElement() {

		String a = driver.findElement(By.xpath("/html/body/div[1]/label")).getText();
		System.out.println(a);
		driver.findElement(By.cssSelector("input[id='123']")).sendKeys("akashhande100");
		String b = driver.findElement(By.xpath("/html/body/label")).getText();
		System.out.println(b);
		driver.findElement(By.cssSelector("input[id='456']")).sendKeys("Hande@100");
		String c = driver.findElement(By.xpath("/html/body/div[2]/label")).getText();
		System.out.println(c);
		driver.findElement(By.cssSelector("input[id='789']")).sendKeys("Hande@123");
		
		String submit = driver.findElement(By.xpath("/html/body/input[2]")).getText();
		System.out.println(submit);
		String clear = driver.findElement(By.xpath("/html/body/input[3]")).getText();
		System.out.println(clear);
		String signUp = driver.findElement(By.xpath("/html/body/input[4]")).getText();
		System.out.println(signUp);
		
	}
	
	public static void main(String[] args) {
		
		launchBrowser();
		manageOperation();
		openApplication("file:///D:/Java%20Program/HTML/loginpage.html");
		HandleWebElement();
	}

}
