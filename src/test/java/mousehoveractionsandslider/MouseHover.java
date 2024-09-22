package mousehoveractionsandslider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

driver.get("https://demo.opencart.com/");
driver.manage().window().maximize();
WebElement dexttop = driver.findElement(By.xpath("(//a)[13]"));
WebElement mac = driver.findElement(By.xpath("(//a[normalize-space()='Mac (1)'])[1]"));

Actions act = new Actions(driver);
act.moveToElement(dexttop).moveToElement(mac).click().build().perform();

//WebElement rclick = driver.findElement(By.xpath("//a[@id='compare-total']"));

//act.contextClick(rclick).perform();
		
		
		
		
		
		
	}

}
