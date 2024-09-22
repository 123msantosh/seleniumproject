package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class xpathusingaxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 WebDriver driver=new ChromeDriver();
  driver .get("https://money.rediff.com/gainers/bse/daily/groupa");
  
  driver.manage().window().maximize();
  
  String text = driver.findElement(By.xpath("//a[contains(text(),'NIIT Ltd')]/self::a")).getText();
  System.out.println(text);
  
 String Ptext = driver.findElement(By.xpath("//a[contains(text(),'NIIT Ltd')]/parent::td")).getText();
 System.out.println(Ptext);
 
 List<WebElement> noofchilds = driver.findElements(By.xpath("//a[contains(text(),'NIIT Ltd')]/ancestor::tr/child::td"));
 
 System.out.println(noofchilds.size());
 
 List<WebElement> noofgrandchild = driver.findElements(By.xpath("//td/a[contains(text(),'NIIT Ltd')]/ancestor::tr/descendant::td"));
 System.out.println(noofgrandchild.size());
 
 List<WebElement> followins = driver.findElements(By.xpath("//td/a[contains(text(),'NIIT Ltd')]/ancestor::tr/following::tr"));
 System.out.println(followins.size());
 
List<WebElement> followingsiblins = driver.findElements(By.xpath("//td/a[contains(text(),'NIIT Ltd')]/ancestor::tr/following-sibling::*"));
System.out.println(followingsiblins.size());



 
	}

}
