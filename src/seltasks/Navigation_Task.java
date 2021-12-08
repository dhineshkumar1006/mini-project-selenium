package seltasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation_Task {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		Thread.sleep(2000);

		driver.navigate().to("https://www.flipkart.com/");

		String title = driver.getTitle();
		System.out.println("url=" + title);

		String currentUrl = driver.getCurrentUrl();
		System.out.println("page=" + currentUrl);

		Thread.sleep(2000);

		driver.navigate().to(
				"https://www.myntra.com/?utm_source=perf_google_search_brand&utm_medium=perf_google_search_brand&utm_campaign=Search%20-%20Myntra%20Brand%20(India)&gclid=CjwKCAiA7dKMBhBCEiwAO_crFCBxV8i2dpkcdF8WrSNAHHptCacIQK5YPitf4zbgNJaX3byULxnLcBoCJWcQAvD_BwE");

		driver.navigate().forward();

		Thread.sleep(2000);

		driver.navigate().back();

		Thread.sleep(2000);

		driver.navigate().refresh();

		driver.close();

		Thread.sleep(2000);

		driver.quit();

	}
}
