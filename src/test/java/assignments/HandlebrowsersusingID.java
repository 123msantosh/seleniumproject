package assignments;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlebrowsersusingID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		WebElement newpage = driver.findElement(By.xpath("//button[text()='New Browser Window']"));
		newpage.click();
		String title = driver.getTitle();
		System.out.println(title);
		Set<String> ids = driver.getWindowHandles();
		for (String Bids : ids) {
			String alltitles = driver.switchTo().window(Bids).getTitle();
			if (alltitles.equals("Your Store")) {
				driver.close();
			}
			
		}
		
	}

}
