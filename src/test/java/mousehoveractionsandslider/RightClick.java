package mousehoveractionsandslider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		WebElement rclick = driver.findElement(By.xpath("//p//span"));
		//WebElement mac = driver.findElement(By.xpath("(//a[normalize-space()='Mac (1)'])[1]"));

		Actions act = new Actions(driver);
		act.contextClick(rclick).build().perform();
		
		WebElement cut = driver.findElement(By.xpath("//span[text()='Cut']"));
		act.moveToElement(cut).click().perform();
		
		driver.switchTo().alert().accept();

	}

}
