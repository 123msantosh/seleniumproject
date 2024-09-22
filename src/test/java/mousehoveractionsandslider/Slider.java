package mousehoveractionsandslider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		WebElement min_slider = driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[1]"));
		System.out.println("Original Location : "+min_slider.getLocation());//(59, 250)
		Actions act=new Actions(driver);
		act.dragAndDropBy(min_slider, 200, 250).build().perform();
		System.out.println("Locations after sliding : "+min_slider.getLocation());
		
		Point P =new Point(500,300);
		driver.manage().window().setPosition(P);
		
		System.out.println("Locations after sliding : "+min_slider.getLocation());
		
		
	}

}
