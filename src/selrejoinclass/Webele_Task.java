package selrejoinclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webele_Task {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		Thread.sleep(3000);

		WebElement id = driver.findElement(By.id("email"));
		id.sendKeys("dhin10@gmail.com");

		WebElement pswd = driver.findElement(By.name("pass"));
		pswd.sendKeys("123456");

		String curl = driver.getCurrentUrl();
		System.out.println("url is" + curl);

		Thread.sleep(3000);

		WebElement btn = driver.findElement(By.name("login"));
		btn.click();

		Thread.sleep(3000);

		driver.navigate().to("https://www.instagram.com/accounts/login/");

		String t = driver.getTitle();
		System.out.println("tittle is" + t);

	}

}
