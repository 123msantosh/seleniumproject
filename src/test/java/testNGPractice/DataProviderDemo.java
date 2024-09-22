package testNGPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class DataProviderDemo {

	WebDriver driver;
	@BeforeClass
	void setup()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	
	@Test(dataProvider = "dp")
	void login(String usern, String pass) throws InterruptedException {
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys(usern);
		 Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys(pass);
		
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a/span")).click();
		
	}
	
	@DataProvider(name="dp")
	String [][]logindata()
	{
		String [][]data= {{"Admin","Admin"},{"Admin","Admin12"},{"admin","Admin123"},{"Admin","hello"}};
		return data;
		
	}
	
	
	
	
	
}
