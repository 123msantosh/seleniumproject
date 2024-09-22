package assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleautosuggesteddropdown {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	driver.get("https://www.bing.com/");
//	driver.manage().window().maximize();
//	
//	driver.findElement(By.cssSelector("textarea.sb_form_q[type='search']")).sendKeys("selenium");
//	
//	List<WebElement> options = driver.findElements(By.xpath("//ul[@id='sa_ul']//li"));
//	
//	for(WebElement links : options)
//	{
//		String text = links.getText();
//		if (text.equals("selenium ide")) {
//			links.click();
//			break;
//		}
//	}
	//handle popup
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	driver.findElement(By.name("proceed")).click();
	driver.switchTo().alert().accept();
	
	}

}
