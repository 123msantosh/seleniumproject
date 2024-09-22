package handlecheckboxdropdownandradiobutton;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Handledropdownwithselecttag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
 
WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(15));


		driver.get("https://www.opencart.com/index.php");
		driver.findElement(By.xpath("//*[@id=\"navbar-collapse-header\"]/div/a[2]")).click();
		driver.manage().window().maximize();
		WebElement dropdowns = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='input-country']")));
	      dropdowns.click();
	      Select country=new Select(dropdowns);
	      
	     country.selectByVisibleText("Albania");
	     country.selectByValue("3");
	     country.selectByIndex(6);

		
	}

}
