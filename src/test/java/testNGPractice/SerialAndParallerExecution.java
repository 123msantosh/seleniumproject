package testNGPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class SerialAndParallerExecution {
	WebDriver driver;
	
	@Parameters({"browser","url"})	
void setup(String br,String appurl)
{
		if(br.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(br.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		else
		{
			driver =new FirefoxDriver();
		}
		driver.get(appurl);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	   }
	@Test
	void checklogo()
	{  try {
		boolean status = driver.findElement(By.xpath("//div[@class='orangehrm-login-branding']/img")).isDisplayed();
		Assert.assertEquals(status, true);
	     } catch (Exception e) {
		Assert.fail("No capturing logo element");
	             }
		
	}
	
//	@AfterClass
//	void logout()
//	{
//		driver.close();
//	}
	
	
	
	
	
	
	
	
}
