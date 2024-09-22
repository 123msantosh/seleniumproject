package mousehoveractionsandslider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		WebElement dexttop = driver.findElement(By.xpath("//span[text()='right click me']"));
		WebElement mac = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));

		Actions act = new Actions(driver);
		act.contextClick(dexttop).perform();
		
		act.doubleClick(mac).build().perform();
		driver.switchTo().alert().accept();

	}

}
