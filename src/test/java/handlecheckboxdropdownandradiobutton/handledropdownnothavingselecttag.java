package handlecheckboxdropdownandradiobutton;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class handledropdownnothavingselecttag {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		 
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(15));


				driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_3");
				driver.manage().window().maximize();
				driver.findElement(By.xpath("//span[@class='multiselect-selected-text']")).click();
			
		List<WebElement> options = mywait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul/li")));
			    
			      System.out.println(options.size());
			      
			      for (int i = 0; i < options.size(); i++) {
					
			    	 String text = options.get(i).getText();
			    	 if (text.equals("HTML")|| text.equals("Java")||options.get(i).getText().equals("CSS")) {
						options.get(i).click();
					                                 }
				             }
			      Thread.sleep(3000);
			      driver.close();
			      
	}

}
