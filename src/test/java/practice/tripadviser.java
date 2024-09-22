package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;

public class tripadviser {
WebDriver driver;
	@BeforeClass
	public void setup() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.tripadvisor.in/Hotel_Review-g659792-d1231058-Reviews-Club_Mahindra_Puducherry-Pondicherry_Union_Territory_of_Pondicherry.html");
		driver.manage().window().maximize();
	}
	
	@Test
	public void giveReview() throws InterruptedException
	{
//		driver.findElement(By.xpath("//input[@placeholder='Where to?']")).sendKeys("club mahindra");
//		driver.findElement(By.xpath("//div[@class='EtzER']//div")).click();
		driver.findElement(By.xpath("//span[text()='Review']")).click();
		
		List<WebElement> ratings = driver.findElements(By.xpath("//label[@class='_S']"));
		int Treviews = ratings.size();
		Actions ac =new Actions(driver);
		for (int i = 0; i <Treviews; i++) {
			if (i==Treviews-1) {
				ac.moveToElement(ratings.get(i)).build().perform();
				ratings.get(i).click();
			}
			ac.moveToElement(ratings.get(i)).build().perform();
			Thread.sleep(2000);
		}
	driver.findElement(By.xpath("//span[contains(@class,'biGQs _P') and text()='Select one']")).click();
	
	List<WebElement> years = driver.findElements(By.xpath("//li//span[contains(@class,'biGQs _P')]"));
		
		for (WebElement webElement : years) {
			String text = webElement.getText();
			if (text.equals("May 2023")) {
				webElement.click();
				break;
			}
		}
		
		driver.findElement(By.xpath("//span[text()='Couples']")).click();
		
		driver.findElement(By.id("review-text")).sendKeys("It is good service forever....2. Once page is loaded, search for iPhone XR (64GB) - Yellow.\r\n"
				+ "3. Select the matching iPhone once list appears.\r\n"
				+ "4. Get the price of the selected iPhone.\r\n"
				+ "5. Now, go to https://www.flipkart.com/.\r\n"
				+ "6. Repeat steps 2 to 4 and get the price.\r\n"
				+ "7. Compare the price on both the website and determine which website.\r\n"
				+ "has lesser value for the iPhone and print the final result on the console.");
		
		driver.findElement(By.id("review-title")).sendKeys("Hooneymoon package");
		
		driver.findElement(By.xpath("//span[text()='Submit review']")).click();
	}
	
	
	
	
	
	
	
}
