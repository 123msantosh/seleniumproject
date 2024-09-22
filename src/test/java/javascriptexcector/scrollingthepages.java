package javascriptexcector;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollingthepages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
driver.manage().window().maximize();

JavascriptExecutor js=(JavascriptExecutor)driver;

//js.executeAsyncScript("window.scrollBy(0,4000)", "");

//System.out.println(js.executeScript("window.pageYOffset;"));
//specific element
WebElement flag = driver.findElement(By.xpath("//td[text()='India']"));
js.executeScript("arguments[0].scrollIntoView();", flag);

//end of the page
js.executeScript("window.scrollBy(0,document.body.scrollHeight);");

//start of page
js.executeScript("window.scrollBy(0,-document.body.scrollHeight);");





	}

}
