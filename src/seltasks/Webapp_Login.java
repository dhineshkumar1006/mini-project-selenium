package seltasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webapp_Login {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		WebElement emailid = driver.findElement(By.id("email"));

		emailid.sendKeys("dhinesh@yahoo");

		Thread.sleep(2000);

		WebElement pswd = driver.findElement(By.id("pass"));

		pswd.sendKeys("454545");

		Thread.sleep(2000);

		WebElement login = driver.findElement(By.name("login"));

		login.click();

	}

}
