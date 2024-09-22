package handlecheckboxdropdownandradiobutton;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleautosuggestdropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	WebDriver	driver=new ChromeDriver();
		
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://www.google.com/");
	
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("selenium");
	
	List<WebElement> options = driver.findElements(By.xpath("//div[contains(@class,'wM6W7d')]//span//b"));
	System.out.println(options.size());
	Thread.sleep(3000);
	for (int i = 0; i < options.size(); i++) {
		String text = options.get(i).getText();
		System.out.println(text);
		if (text.equals("interview questions")) {
			options.get(i).click();
			Thread.sleep(3000);
			break;
			
		}
	}
		driver.close();
	}

}
