package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class javascriptexecutorpractice {
 WebDriver driver;
 JavascriptExecutor js;
 
 @BeforeClass
	public void setup()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
	}
	
 @Test
 public void test()
 {
	 js=(JavascriptExecutor)driver;
	WebElement firstname = driver.findElement(By.id("name"));
	js.executeScript("arguments[0].setAttribute('value','john')", firstname);
	WebElement email = driver.findElement(By.id("email"));
	js.executeScript("arguments[0].setAttribute('value','abc@gmail.com')", email);
	WebElement phone = driver.findElement(By.id("phone"));
	js.executeScript("arguments[0].setAttribute('value','1234567890')", phone);
	 WebElement rbutton = driver.findElement(By.id("male"));
	 js.executeScript("arguments[0].click();", rbutton);
	
	//scrolling the pages
//	 js.executeScript("window.scrollBy(0,2000)", "");
//	 System.out.println(js.executeScript("return.window.pageYOffset"));//show location
	 
	 //till element
//	 WebElement till = driver.findElement(By.xpath("//button[normalize-space()='Confirm Box']"));
//	 js.executeScript("arguments[0].scrollIntoView();", till);
	 
	 //scroll down end
	 js.executeScript("window.scrollBy(0,document.body.scrollHeight);");
	
	
 }
	
 @AfterClass
 public void tearDown()
 {
	 driver.quit();
 }
	
	
}
