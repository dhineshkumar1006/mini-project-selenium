package seltasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_T {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.instagram.com/");
	
	driver.manage().window().maximize();
	
	Thread.sleep(3000);
	
	WebElement usn = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[1]/div/label/input"));
	
	usn.sendKeys("dhin@gmail.com");
	
	WebElement pswd = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[2]/div/label/input"));
	
	pswd.sendKeys("567891");
	
	Thread.sleep(5000);
	
	WebElement btn = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]"));
	
	btn.click();
	
	
	
	
	
	
	
	
	
	
	}

}
