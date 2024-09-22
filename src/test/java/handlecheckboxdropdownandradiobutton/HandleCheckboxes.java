package handlecheckboxdropdownandradiobutton;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	WebDriver driver=new ChromeDriver();
	
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

driver.get("https://itera-qa.azurewebsites.net/home/automation");
driver.manage().window().maximize();

//driver.findElement(By.xpath("//input[@id='monday']")).click();

List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@id='monday']/ancestor::div//input[@type='checkbox' and @class='form-check-input']"));
		System.out.println(checkboxes.size());
		
	/*	for (WebElement boxes : checkboxes)
		{
			boxes.click();
		}
		*/
		for (int i = 0; i<5; i++) {
			checkboxes.get(i).click();
		}
		
		
		for(int i=0;i<checkboxes.size();i++)
		{   //if(checkboxes.get(i).isSelected()) 
		        {
			checkboxes.get(i).click();
		         }
		}
		
		
	}

}
