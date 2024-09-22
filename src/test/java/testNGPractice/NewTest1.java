package testNGPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class NewTest1 {
 WebDriver driver;
	
	@Test(priority = 1)
   void openapp() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();	
  }
	
	@AfterSuite
	void login() 
	{
		System.out.println("After suite");
	}
	
	@Test(priority = 3)
	void logout()
	{
		driver.close();
	}
	
	
	
	
	
}
