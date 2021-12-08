package seltasks;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Task {
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver", "\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement all = driver.findElement(By.xpath("//span[@class='hm-icon-label']"));
		
		Actions act = new Actions (driver);
		
		act.moveToElement(all).build().perform();  //movetoelement moves mouse
		
		act.click().build().perform();
		
		//act.contextClick().build().perform();-------->contextclick------>right click in mouse
		
		Thread.sleep(3000);
		
		WebElement mob = driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[17]/a"));
		
		act.moveToElement(mob).build().perform();
		
		act.contextClick().build().perform();
		
		Robot r = new Robot();
		Thread.sleep(2000);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
