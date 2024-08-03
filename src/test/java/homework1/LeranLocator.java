package homework1;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeranLocator {

	WebDriver driver;

	@Before
	public void init() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\junal\\Selenium_Feb2024\\homework\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().deleteAllCookies();
		driver.get("https://codefios.com/ebilling/login");
		driver.manage().window().maximize();
	}

	

	

	@Test
	public void testLocators()  throws InterruptedException 
{

		driver.findElement(By.id("user_name")).sendKeys(" demo@codefios.com");

	}

}
