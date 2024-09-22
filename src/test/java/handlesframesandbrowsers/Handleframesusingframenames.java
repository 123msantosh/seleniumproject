package handlesframesandbrowsers;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handleframesusingframenames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");

driver.manage().window().maximize();
Thread.sleep(2000);

driver.switchTo().frame("packageListFrame");

driver.findElement(By.linkText("org.openqa.selenium")).click();

driver.switchTo().defaultContent();
Thread.sleep(5000);

driver.switchTo().frame("packageFrame");
driver.findElement(By.xpath("//span[text()='Capabilities']")).click();

driver.switchTo().defaultContent();
Thread.sleep(5000);
WebElement search1 = driver.findElement(By.xpath("//input[@class=\"watermark ui-autocomplete-input\"]"));
search1.click();
search1.sendKeys("java");

List<WebElement> links = driver.findElements(By.xpath("//span[@class='resultHighlight']"));

 for (int i = 0; i < links.size(); i++) {
	 
	String text = links.get(i).getText();
	if (text.equals("scriptException")) {
		links.get(i).click();
		
	}
	
}
		
		
		
	}

}
