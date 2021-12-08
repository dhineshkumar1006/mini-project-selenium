package selrejoinclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Simple_demo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir") +"//driver//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/accounts/login/");
		
		driver.manage().window().maximize();
		
		WebElement usn = driver.findElement(By.xpath("//input[@type='text']"));
		
		usn.sendKeys("karnan@yahoo.com");
		
		driver.findElement(by.xp)
		
	}
}
