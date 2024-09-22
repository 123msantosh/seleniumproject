package waitsDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class exwaits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		WebDriverWait mywait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		WebElement username = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		
		username.sendKeys("Admin");
		
		       WebElement password = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		password.sendKeys("admin123");
		
		System.out.println(password.isDisplayed());
		
		
		System.out.println(password.isEnabled());
		
		System.out.println(password.isSelected());
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	
	
	}

}
