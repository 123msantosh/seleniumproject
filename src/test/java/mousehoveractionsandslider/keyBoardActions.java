package mousehoveractionsandslider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyBoardActions {

	public static void main(String[] args){
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
driver.manage().window().maximize();
 
Actions act=new Actions(driver);
driver.findElement(By.name("username")).sendKeys("admin");

//Thread.sleep(5000);
//select ctrl+a
act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();

//copy ctrl+c
act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();

//tab
act.keyDown(Keys.TAB).keyDown(Keys.TAB).perform();


driver.close();
//or
//act.sendKeys(Keys.TAB).perform();

//paste ctrl+v
act.keyDown(Keys.CONTROL).sendKeys("v").keyDown(Keys.CONTROL).perform();







	}

}
