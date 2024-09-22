package handlealertpopup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertWithokandcancel {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
	mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='JavaScript Alerts']"))).click();
	
	/*mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Click for JS Alert']"))).click();
	
	//driver.switchTo().alert().accept();
	Alert alerts = mywait.until(ExpectedConditions.alertIsPresent());
	System.out.println(alerts.getText());
	alerts.dismiss();
	
	}*/

	//two options popup
	
/*	mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Click for JS Confirm']"))).click();
	
	//driver.switchTo().alert().accept();
	Alert alerts = mywait.until(ExpectedConditions.alertIsPresent());
	System.out.println(alerts.getText());
	alerts.dismiss();*/
	
	
	
	//Alerts with input text
	
	
	mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='content']/div/ul/li[3]/button"))).click();
	
	//driver.switchTo().alert().accept();
	Alert alerts = mywait.until(ExpectedConditions.alertIsPresent());
	Thread.sleep(3000);
	alerts.sendKeys("Hello");
	System.out.println(alerts.getText());
	alerts.accept();
	}
}
