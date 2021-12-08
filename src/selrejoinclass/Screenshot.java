package selrejoinclass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
	
			
			System.setProperty("webdriver.chrome.driver","\\Users\\DELL\\eclipse-workspace\\New_seltasks\\Driver\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.facebook.com/signup");
			
			driver.manage().window().maximize();
			
			Thread.sleep(3000);
			
			WebElement usn = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
			
			usn.sendKeys("dhinkum");
			
			WebElement btn = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
			
			btn.click();
			
			Thread.sleep(2000);
			
			TakesScreenshot ts = (TakesScreenshot) driver;
			
			File src = ts.getScreenshotAs(OutputType.FILE);
			
			File dest = new File("\\Users\\DELL\\eclipse-workspace\\Selenium\\screenshots/pic.png");
			
			FileUtils.copyFile(src, dest);
			
			
			
			
			
			
			
		}

	
	}


