package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssselector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
		
	    driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("books");
		
		driver.findElement(By.cssSelector("button[class='button-1 search-box-button']")).click();
		
		driver.findElement(By.xpath("(//div/h2/a)[1]")).click();
		
		driver.findElement(By.xpath("//div[@class='email-a-friend']/button")).click();
		
		 driver.findElement(By.xpath("//*[@id=\"FriendEmail\"]")).sendKeys("jadhavmahesh2898@gmail.com");
		 
		 driver.findElement(By.cssSelector("#YourEmailAddress")).sendKeys("jadhavmahesh2898@gmail.com");
		 
		 driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[2]/button")).click();
		 
		 
		 
		
		
		
		

	}

}
