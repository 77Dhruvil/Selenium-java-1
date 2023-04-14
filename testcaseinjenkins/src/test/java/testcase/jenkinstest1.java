package testcase;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

	
	@Test
	public class jenkinstest1 {
			
			WebDriver driver;
			public void jenkinstest() throws InterruptedException, AWTException {
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Drivers\\chromedriver.exe");
			
		
			
			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			WebDriver driver = new ChromeDriver(options);
			driver.get("https://www.educastic.com/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.manage().window().fullscreen();
			Thread.sleep(2000);
			
			Robot robot = new Robot();
			Thread.sleep(2000);
			robot.keyPress(KeyEvent.VK_ESCAPE);
			Thread.sleep(2000);
			robot.keyRelease(KeyEvent.VK_ESCAPE);
			Dimension d = new Dimension(400,800);
			driver.manage().window().setSize(d);
			System.out.println("Dhruvil is automation learner");

			//driver.findElement(By.xpath("//*[@id=\"mySidenav2\"]/div/a[1]")
			
			
			
			
//			WebDriver driver1;
//			System.setProperty("webdriver.gecko.driver","D:\\Selenium\\s-lib\\geckodriver.exe");
//			driver1 = new FirefoxDriver();
//			driver1.get("https://www.educastic.com/");
//			driver.manage().window().maximize();
//			Thread.sleep(2000);
//			driver.manage().window().fullscreen();
//			Thread.sleep(2000);
//			Robot robot1 = new Robot();
//			Thread.sleep(4000);
//			robot1.keyPress(KeyEvent.VK_ESCAPE);
//			Thread.sleep(2000);
//			robot1.keyRelease(KeyEvent.VK_ESCAPE);
	//	
		}

	}
	

