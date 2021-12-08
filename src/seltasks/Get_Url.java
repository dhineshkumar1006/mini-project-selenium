package seltasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Url {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
	}

}
