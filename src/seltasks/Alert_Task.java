package seltasks;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Task {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Alerts.html");

		driver.manage().window().maximize();

		Thread.sleep(2000);

		WebElement btn1 = driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button"));

		btn1.click();

		Alert a1 = driver.switchTo().alert();
		a1.accept();

		WebElement btn2 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
		btn2.click();

		WebElement btn3 = driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button"));
		btn3.click();

		Thread.sleep(2000);

		Alert a2 = driver.switchTo().alert();
		a2.accept();

		WebElement btn4 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a"));
		btn4.click();

		Thread.sleep(2000);

		WebElement btn5 = driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button"));
		btn5.click();

		Thread.sleep(2000);

		Alert a3 = driver.switchTo().alert();
		a3.dismiss();

	}

}
