package DeOnpackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DeOnLogin {
	
	WebDriver driver;
	
	@Test(priority=1)
	
	public void Open_Browser () {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("sdfasdf");
		driver.get("https://trootechproducts.com:9010/");
	}
	
 	
	@Test(priority=3)
	public void Users () throws InterruptedException, AWTException {
		Thread.sleep(2000);
		driver.findElement(By.linkText("Users")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[type='button'][class='ant-btn ant-btn-primary userAddButton']")).click();
		Thread.sleep(2000);
		WebElement uploadButton = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div[2]/form/div[1]/div/div/span/div/div/span"));
		StringSelection q = new StringSelection("C:\\Users\\PATEL\\Downloads\\download (1).jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(q,null);

		Thread.sleep(2000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
      	r.keyPress(KeyEvent.VK_ENTER);
      	r.keyRelease(KeyEvent.VK_ENTER);
      	System.out.println("test");
		driver.findElement(By.id("brokerForm_first_name")).sendKeys("Jacob");
		driver.findElement(By.id("brokerForm_last_name")).sendKeys("aa");
		driver.findElement(By.id("brokerForm_email")).sendKeys("jacob_aa@mailinator.com");
		driver.findElement(By.id("brokerForm_phone")).sendKeys("5645644");
		driver.findElement(By.cssSelector("#brokerForm > div.ant-row.ant-row-end > button.ant-btn.ant-btn-submit")).click();
	
	
//	@Test(priority=4)
//	public void EditUsers() {
//		
//		driver.findElement(By.xpath("//*[@id=\"root\"]/section/section/main/div/div/div[2]/div[1]/div[2]/div/div/div/div/div/div/div/div/table/tbody/tr[1]/td[7]")).click();
		
		
		
	}


