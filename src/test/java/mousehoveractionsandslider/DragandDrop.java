package mousehoveractionsandslider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		WebElement source1 = driver.findElement(By.xpath("//div[@id='box6']"));
		WebElement target1 = driver.findElement(By.xpath("//div[@id='box106']"));
		
		WebElement source2 = driver.findElement(By.xpath("//div[@id='box3']"));
		WebElement target2 = driver.findElement(By.xpath("//div[@id='box103']"));
		
		WebElement source3 = driver.findElement(By.xpath("//div[@id='box7']"));
		WebElement target3 = driver.findElement(By.xpath("//div[@id='box102']"));

		Actions act = new Actions(driver);
		act.dragAndDrop(source1, target1).build().perform();
		act.dragAndDrop(source2, target2).perform();
		act.dragAndDrop(source3, target3).perform();
		
	
		
		
		
	}

}
