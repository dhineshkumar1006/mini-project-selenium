package seltasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Task {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.instagram.com/");

		driver.manage().window().maximize();

		Thread.sleep(2000);

		WebElement usn = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[1]/div/label/input"));

		usn.sendKeys("dhine@gmail.com");

		Thread.sleep(2000);

		WebElement pswd = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[2]/div/label/input"));

		pswd.sendKeys("dhineghv");

		Thread.sleep(2000);

		WebElement btn = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]"));

		btn.click();
	}

}
