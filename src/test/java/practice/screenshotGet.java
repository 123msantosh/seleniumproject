package practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class screenshotGet {

	WebDriver driver;
	 TakesScreenshot ts;
	 
	 @BeforeClass
		public void setup()
		{
		 //headless testing
		 ChromeOptions op=new ChromeOptions();
		 op.setHeadless(true);
		 
			driver=new ChromeDriver(op);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://testautomationpractice.blogspot.com/");
			driver.manage().window().maximize();
			
		}
	 
		
	 @Test
	 public void test() throws IOException
	 {
		 ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg = new File("D:\\Selenium Workspace\\seleniumproject\\screenshots\\automation.png");
		FileUtils.copyFile(src, trg);
		
		
		WebElement table = driver.findElement(By.xpath("//div[@class='widget HTML']"));
		
		File src1 = table.getScreenshotAs(OutputType.FILE);
		File trg1 = new File("D:\\Selenium Workspace\\seleniumproject\\screenshots\\automationtable.png");
		FileUtils.copyFile(src1, trg1);
		
	 }
		
	 @AfterClass
	 public void tearDown()
	 {
		 driver.quit();
	 }
		
		

	
	
}
