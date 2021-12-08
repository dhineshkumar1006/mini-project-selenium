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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Mini_Project {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		System.out.println("driver launch in chrome");
		
		driver.get("http://automationpractice.com/index.php");
		System.out.println("page opened");
		
		//driver.manage().window().maximize();
		
		WebElement tshirts = driver.findElement(By.xpath("(//a[@title='T-shirts'])[2]"));
		tshirts.click();
		System.out.println("tshirts clicked");
		
		WebElement selecteditem = driver.findElement(By.xpath("//img[@alt='Faded Short Sleeve T-shirts']"));
		selecteditem.click();
		System.out.println("selected item clicked");
		
		WebElement addcart = driver.findElement(By.xpath("(//button[@type='submit'])[3]"));
		Actions act = new Actions(driver);
		act.moveToElement(addcart).build().perform();
		//act.contextClick(addcart).build().perform();--right clicked
		act.click().build().perform();
		System.out.println("addcart clicked");
		Thread.sleep(5000);
		
		WebElement proceed_btn = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])"));
		act.moveToElement(proceed_btn).build().perform();
		Thread.sleep(5000);//got webelementnotinteractable execption
		act.click().build().perform();
		System.out.println("procced button clicked");
		
		//proceed_btn.click();
		
//		WebElement proceed_btn = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])"));
//		act.click(proceed_btn).build().perform();
		
		WebElement confirm_proceed = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		act.click(confirm_proceed).build().perform();
		Thread.sleep(3000);
		System.out.println("confirm proceed");
		
//		WebElement createacc = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
//		createacc.sendKeys("dhineshfb10@gmail.com");
//		System.out.println("mail passed");
//		
//		WebElement clickcreateacc = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
//		clickcreateacc.click();
//		System.out.println("account created");
//		Thread.sleep(5000);
		
//		WebElement mr = driver.findElement(By.xpath("(//label[@for='id_gender1'])[1]"));
//		act.doubleClick(mr).build().perform();
		
//		WebElement mr = driver.findElement(By.id("uniform-id_gender1"));
//		mr.click();
//		System.out.println("mr clicked");
//		Thread.sleep(2000);
//		//act.click(mr).build().perform();--no need
//		
//		WebElement firstname = driver.findElement(By.id("customer_firstname"));
//		firstname.sendKeys("dhinesh");
//		System.out.println("name passed");
//		Thread.sleep(2000);
//		
//		WebElement lastname = driver.findElement(By.id("customer_lastname"));
//		lastname.sendKeys("kumar");
//		System.out.println("last name passed");
//		Thread.sleep(2000);
//		
//		WebElement mailid = driver.findElement(By.id("email"));
//		mailid.click();
//		System.out.println("mail clicked");
//		Thread.sleep(2000);
//		
//		WebElement pswd = driver.findElement(By.id("passwd"));
//		pswd.sendKeys("dinu20");
//		Thread.sleep(2000);
//		
//		WebElement date = driver.findElement(By.id("days"));
//		date.click();
//		System.out.println("date clicked");
//		
//		Select s = new Select(date);
//		s.selectByValue("10");
//		System.out.println("value selected");
//		
//		WebElement mon = driver.findElement(By.id("months"));
//		mon.click();
//		System.out.println("month clicked");
//		Thread.sleep(2000);
//		
//		Select s1 = new Select(mon);
//		s1.selectByVisibleText("June");
//		System.out.println("month selected");
//		Thread.sleep(2000);
//		
//		WebElement yr = driver.findElement(By.id("years"));
//		yr.click();
//		System.out.println("yr clicked");
//		
//		Select s2 = new Select(yr);
//		s2.selectByVisibleText("1995");
//		System.out.println("year selected");
//		Thread.sleep(2000);
//		
//		
//		WebElement refclick = driver.findElement(By.xpath("(//label[@for='optin'])[1]"));
//		refclick.click();
//		System.out.println("ref clicked");
//		
//		WebElement company = driver.findElement(By.xpath("(//input[@type='text'])[7]"));
//		company.sendKeys("greens technologies");
//		System.out.println("company printed");
//		Thread.sleep(2000);
//		
//		WebElement address = driver.findElement(By.xpath("(//input[@type='text'])[8]"));
//		address.sendKeys("No-2,main road kuruku sandhu");
//		System.out.println("address printed");
//		Thread.sleep(2000);
//		
//		WebElement addl2 = driver.findElement(By.xpath("(//input[@type='text'])[9]"));
//		addl2.sendKeys("plot no 19");
//		System.out.println("addl2 printed");
//		Thread.sleep(2000);
//		
//		WebElement city = driver.findElement(By.xpath("(//input[@type='text'])[10]"));
//		city.sendKeys("chennai");
//		System.out.println("city printed");
//		Thread.sleep(2000);
//		
//		WebElement state = driver.findElement(By.name("id_state"));
//		state.click();
//		System.out.println("state clicked");
//		Thread.sleep(5000);
//		
//		Select s3 = new Select(state);
//		s3.selectByVisibleText("Alabama");
//		System.out.println("state printed");
//		Thread.sleep(3000);
//		
//		WebElement zip = driver.findElement(By.xpath("(//input[@type='text'])[11]"));
//		zip.sendKeys("625011");
//		System.out.println("zip prints");
//		Thread.sleep(2000);
//		
//		WebElement phnum = driver.findElement(By.xpath("(//input[@type='text'])[12]"));
//		phnum.sendKeys("7010771153");
//		System.out.println("ph num printed");
//		Thread.sleep(2000);
//		
//		WebElement register = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
//		register.click();
//		System.out.println("reg clicked");
//		
		
		WebElement usn = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		usn.sendKeys("dhineshfb10@gmail.com");
		System.out.println("mail id ok");
		
		WebElement pswd = driver.findElement(By.xpath("(//input[@type='password'])"));
		pswd.sendKeys("dinu20");
		System.out.println("password ok");
		Thread.sleep(3000);
		
		WebElement signin = driver.findElement(By.xpath("(//button[@type='submit'])[3]"));
		signin.click();
		System.out.println("btn clicked");
		
		WebElement proceedaddr = driver.findElement(By.name("processAddress"));
		act.click(proceedaddr).build().perform();
		System.out.println("proceedaddr clicked");
		Thread.sleep(3000);
		
		WebElement deliveryaccept = driver.findElement(By.id("uniform-cgv"));
		act.click(deliveryaccept).build().perform();
		System.out.println("del accepted");
		Thread.sleep(3000);
		
		WebElement proceedbtn = driver.findElement(By.name("processCarrier"));
		act.click(proceedbtn).build().perform();
		System.out.println("btn clicked");
		Thread.sleep(2000);
		
		TakesScreenshot ts = (TakesScreenshot) driver;

		Thread.sleep(2000);

		File src = ts.getScreenshotAs(OutputType.FILE);

		File dest = new File("\\Users\\DELL\\eclipse-workspace\\Selenium\\screenshots/picture.png");

		FileUtils.copyFile(src, dest);
		
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		
//		File src = ts.getScreenshotAs(OutputType.FILE);
//		
//		//File dest = new File("C:\\Users\\DELL\\eclipse-workspace\\Selenium\\screenshots/picture.png1");
//		
//		File dest = new File("\\Users\\DELL\\eclipse-workspace\\Selenium\\screenshots/picture.png");
//		
//		FileUtils.copyDirectory(src, dest);
//		
//		System.out.println("screenshot taken");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

