package seltasks;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolltask {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.album.alexflueras.ro/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement img = driver.findElement(By.xpath("//*[@id=\"a7\"]/img"));
		
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	
	jse.executeScript("arguments[0].ScrollIntoView();", img);
		
		DOUBT
	}

}
