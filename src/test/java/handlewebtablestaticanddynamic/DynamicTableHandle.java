package handlewebtablestaticanddynamic;

import java.awt.Point;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTableHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://demo.opencart.com/admin/");

driver.manage().window().maximize();

driver.findElement(By.name("username")).sendKeys("demo");
driver.findElement(By.name("password")).sendKeys("demo");
driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
WebElement popup = driver.findElement(By.xpath("//button[@class='btn-close']"));
if (popup.isDisplayed()) {
	driver.findElement(By.xpath("//button[@class='btn-close']")).click();
}
 driver.findElement(By.xpath("//*[@id=\"menu-customer\"]/a")).click();
 driver.findElement(By.xpath("(//ul[@id='collapse-5']//a[1])[1]")).click();
 Thread.sleep(2000);
 //find total no. of pages
 String text = driver.findElement(By.xpath("//div[text()='Showing 1 to 10 of 13309 (1331 Pages)']")).getText();
 int TotalPages=Integer.parseInt(text.substring(text.indexOf("(")+1, text.indexOf("Pages")-1));
 System.out.println(TotalPages);
 
 for (int i =1; i <=10; i++) {
	if (TotalPages>1) {
		WebElement Active_Pages = driver.findElement(By.xpath("//ul[@class='pagination']//li//*[text()="+i+"]"));
		System.out.println(Active_Pages.getText());
		Active_Pages.click();
		Thread.sleep(2000);
	}
}
	}

}
