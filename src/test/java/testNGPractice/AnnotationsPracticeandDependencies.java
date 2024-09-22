package testNGPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;

public class AnnotationsPracticeandDependencies {
WebDriver driver;

    @Test(priority = 1)
	void openapp()
	{  //System.out.println("Before class");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	
	@Test(priority = 2 ,dependsOnMethods = {"openapp"})
	void login() throws InterruptedException
	{

		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("Admin");
		 Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
	}
	
	@Test(priority = 3,dependsOnMethods = {"openapp","login"})
	void sucess()
	{
	System.out.println("sucessful login");
	Assert.assertTrue(false);
	}
	
	
	@Test(priority = 4,dependsOnMethods = {"login","sucess"})
	void logout()
	{  System.out.println("After class");
		driver.quit();
	}
	
	
	
	
	
	
	
}
