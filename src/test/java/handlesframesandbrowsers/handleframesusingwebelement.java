package handlesframesandbrowsers;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleframesusingwebelement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();

driver.get("https://ui.vision/demo/webtest/frames/");

driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

WebElement FRm1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
driver.switchTo().frame(FRm1);
driver.findElement(By.name("mytext1")).sendKeys("Hello");
driver.switchTo().defaultContent();

WebElement FRm2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
driver.switchTo().frame(FRm2);
driver.findElement(By.name("mytext2")).sendKeys("Hello");
driver.switchTo().defaultContent();

WebElement FRm3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
driver.switchTo().frame(FRm3);
driver.findElement(By.name("mytext3")).sendKeys("Good");
Thread.sleep(3000);
//WebElement ifrm1 = driver.findElement(By.xpath("//html[@class='HB1eCd-UMrnmb']"));
driver.switchTo().frame(0);
driver.findElement(By.xpath("((//div[contains(@class,'AB7Lab')])[1]")).click();

driver.findElement(By.xpath("(//div[@class='uHMk6b fsHoPb'])[2]")).click();
//driver.switchTo().frame(3);
driver.findElement(By.xpath("//div[@class='MocG8c HZ3kWc mhLiyf LMgvRb KKjvXb DEh1R']")).click();
Thread.sleep(3000);
List<WebElement> options = driver.findElements(By.xpath("//span[@class='vRMGwf oJeWuf']"));

for (int i = 0; i < options.size(); i++) {
	String text = options.get(i).getText();
	if (text.equals("Well, now I know")) {
		options.get(i).click();
	}
}
driver.switchTo().defaultContent();

	}

}
