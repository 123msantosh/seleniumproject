package pageObjectclassTwoapproach;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class logintest {

	WebDriver driver;
	loginpageApproach2 lp;

	
	@BeforeClass
	void setup()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}	
	
	@Test(priority=1)
	void testlogo() throws InterruptedException
	{
		lp=new loginpageApproach2(driver);
		Thread.sleep(5000);
		Assert.assertEquals(lp.checklogopresence(),true);
	}
	
	@Test(priority = 2)
	void testlogin()
	{
		lp.setupusername("Admin");
		lp.setuppassword("admin123");
		lp.clickonsubmit();
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	
	@AfterClass
	void tearDown()
	{
		driver.close();
	}
	
	
	
}
