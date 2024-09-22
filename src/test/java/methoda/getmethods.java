package methoda;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getmethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url+"=================================");
		
		String handle = driver.getWindowHandle();
		System.out.println(handle);
		
		driver.findElement(By.xpath("(//div[@class='tabs'])[1]")).click();
		
		
		 Set<String> handles = driver.getWindowHandles();
		//System.out.println(title);
		for(String handlescrower : handles) {
			System.out.println(handlescrower);
		}
		
		Class<? extends WebDriver> classs = driver.getClass();
		System.out.println(classs);
		//URL myurl = new URL("https://www.flipkart.com/");
		driver.navigate().to("https://www.flipkart.com/");
		driver.navigate().back();
		
		Thread.sleep(2000);
		driver.navigate().forward();
		
		driver.navigate().refresh();
		//String sourse = driver.getPageSource();
		//System.out.println(sourse);
		
		//driver.close();
		
		
		
		
	}

}
