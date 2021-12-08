package seltasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Task {// SINGLE DROPDOWN

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://twitter.com/i/flow/signup");

		driver.manage().window().maximize();

		WebElement mon = driver.findElement(By.xpath("(//select[@aria-invalid='false'])[1]"));
		mon.click();

		Thread.sleep(2000);

		Select s = new Select(mon);

		s.selectByVisibleText("June");

		WebElement day = driver.findElement(By.xpath("(//select[@aria-invalid='false'])[2]"));

		day.click();

		Select s1 = new Select(day);

		s1.selectByValue("10");
		Thread.sleep(2000);

		WebElement year = driver.findElement(By.xpath("(//select[@aria-invalid='false'])[3]"));
		year.click();

		Select s2 = new Select(year);

		s2.selectByValue("1995");
	}

}
