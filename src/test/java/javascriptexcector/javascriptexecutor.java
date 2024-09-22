package javascriptexcector;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class javascriptexecutor {

	public static void main(String[] args) {
	
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//pass value in name 
		WebElement name = driver.findElement(By.xpath("//input[@id='name']"));
		js.executeScript("arguments[0].setAttribute('value','John')", name);
		
		//click on radio button
		WebElement button = driver.findElement(By.xpath("//input[@id='male']"));
		js.executeScript("arguments[0].click();", button);
		
		//handle dropdown
		WebElement drdown = driver.findElement(By.xpath("//select[@id='country']"));
		js.executeScript("arguments[0].click();",drdown);
		
		Select sle=new Select(drdown);
		//sle.selectByIndex(2);
		sle.selectByValue("germany");
		
		
		

	}

}
