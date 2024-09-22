package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class automationPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      WebDriver driver=new ChromeDriver();
      
     
      driver.get("https://automationexercise.com/");
      driver.manage().window().maximize();
      
      Thread.sleep(3000);
      
     List<WebElement> sliders = driver.findElements(By.className("carousel-inner"));
     
    System.out.println( sliders.size());
    
    List<WebElement> images = driver.findElements(By.tagName("img"));
    System.out.println(images.size());
    
    List<WebElement> links = driver.findElements(By.tagName("a"));
    System.out.println(links.size());
    driver.quit();
    
	}

}
