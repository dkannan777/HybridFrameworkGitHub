package testDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class BrowserLaunchTest {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = null;
		String myProjectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", myProjectPath + "/Drivers/chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://www.google.com");
		Wait<WebDriver> wait = new FluentWait<>(driver).withTimeout(5, TimeUnit.SECONDS).pollingEvery(500,msecs).ignoring(NoSuchElementException.class  
				Alert alert = wait.until(ExpectedConditions.alertIsPresent());
				alert.accept();
		driver.findElement(By.name("q")).sendKeys("Testing Materials");
		driver.findElement(By.name("btnk")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		driver.close();

	}

}
