package datepickerandhandledropdownwithinvalidelement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handledropdownhiddenelement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("Admin");
		
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
		
		driver.findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[2]")).click();
		
		driver.findElement(By.xpath("(//div[text()='-- Select --'])[2]")).click();
		Thread.sleep(1000);
		List<WebElement> options = driver.findElements(By.xpath(" //div[@role='listbox']//div//span"));
		System.out.println(options.size());
		for (WebElement option : options) {
			if (option.getText().equals("Content Specialist")) {
				option.click();
				break;
			}
			//System.out.println(option.getText());
		}
		
		
		
		
		
		
		
		
	}
	

}
